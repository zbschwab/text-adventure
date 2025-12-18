package edu.grinnell.csc207.textadventure;

import edu.grinnell.csc207.textadventure.Parser.Action;

public class Crate extends Room {
    boolean angelNoticed = false;
    int lookCount = 0;

    public Crate() {
        loadText("data/crate-room.txt");
    }

    @Override
    public Action route(Action act, GameState state) {
        System.out.println(act.verb + ", " + act.subject); // debug

        // check pockets
        switch (act.toString()) {
            case "check pocket", "check pockets", "feel pocket", "search pocket",
                    "search pockets" -> {
                if (!state.inventory.contains("lighter")) {
                    state.inventory.add("lighter");
                    state.inventory.add("phone");
                }
                if (state.cond.bound) {
                    return new Action("check", "pocketbound");
                } else {
                    return act;
                }
            }
        }

        // exit/open crate
        switch (act.subject) {
            case "exit", "out", "crate", "lid", "box" -> {
                if (!state.cond.bound) {
                    state.changeRoom(new Basement());
                    return new Action("try", "exit");
                } else {
                    return new Action("look", "bound");
                }
            }
        }

        // awareness of angel triggers after basic acclimation
        if (state.cond.acclimated && state.cond.bound) {
            switch (act.verb) {
                case "move", "stand", "try", "stretch" -> {
                    if (!angelNoticed) {
                        angelNoticed = true;
                        return new Action("feel", "angel");
                    }
                }
                case "listen", "wait" -> {
                    if (!angelNoticed) {
                        return new Action("listen", "angel");
                    }
                }
            }
        }

        // burning rope with lighter
        switch (act.verb) {
            case "burn", "use", "turn", "light" -> {
                if (act.subject.equals("rope") && state.cond.bound
                        && state.inventory.contains("rope")) {
                    return new Action("burn", "rope");
                }
                if (act.subject.equals("lighter")) {
                    return new Action("light", "lighter");
                }
            }
        }

        // wait until angel gnaws through rope
        switch (act.verb) {
            case "wait", "stay" -> {
                if (state.cond.bound && angelNoticed && lookCount >= 5) {
                    state.cond.bound = false;
                    return new Action("wait", "long");
                }
            }
        }

        // look/perception handling
        switch (act.verb) {
            case "look" -> {
                if (state.cond.dizzy) {
                    act.subject = "dizzy";
                    state.cond.dizzy = false;
                    return act;
                }
                if (!state.cond.acclimated) {
                    act.subject = "first";
                    state.cond.acclimated = true;
                    return act;
                }
                lookCount++;
            }

            default -> act.subject = "around";
        }

        return act;
    }
}