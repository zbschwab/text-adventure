package edu.grinnell.csc207.textadventure;

import edu.grinnell.csc207.textadventure.Parser.Action;

public class Crate extends Room {
    boolean angelSeen = false;
    boolean angelHeard = false;
    int lookCount = 0;

    public Crate() {
        loadText("data/crate-room.txt");
    }

    @Override
    public Action route(Action act, GameState state) {
        System.out.println(state.cond.acclimated + ", " + state.cond.bound); //debug

        // check pockets
        switch (act.toString()) {
            case "check pocket", "check pockets", "feel pocket", "search pocket",
                    "reach pocket", "reach pockets", "search pockets" -> {
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
                    state.turnCount = 0;
                    return new Action("try", "exit");
                } else {
                    return new Action("look", "bound");
                }
            }
        }

        // awareness of angel triggers after basic acclimation
        if (state.cond.acclimated && state.cond.bound) {
            Action a = null;
            switch (act.verb) {
                case "move", "stand", "try", "stretch" -> {
                    a = new Action("move", "bound");
                    if (angelSeen && angelHeard) {
                        return a;
                    }
                }
                case "listen", "wait" -> {
                    return new Action("listen", "angel");
                }
            }

            if (!angelSeen) {
                angelSeen = true;
                Action b = new Action("feel", "angel");
                if (a != null) {
                    return a.composeAction(a, b);
                } else {
                    return b;
                }
            }

            if (!angelHeard) {
                angelHeard = true;
                Action b = new Action("listen", "angel");
                if (a != null) {
                    return a.composeAction(a, b);
                } else {
                    return b;
                }
            }
        }

        // burning rope with lighter
        switch (act.verb) {
            case "burn", "use", "turn", "light" -> {
                if (act.subject.equals("rope") && state.cond.bound
                        && state.inventory.contains("lighter")) {
                    return new Action("burn", "rope");
                }
                if (act.subject.equals("lighter")) {
                    return new Action("light", "lighter");
                }
            }
        }

        // hint for escaping box
        if (!state.cond.bound) {
            return new Action("exit", "hint");
        }

        // wait until angel gnaws through rope
        if ((lookCount >= 5 || state.turnCount >= 15) && state.cond.bound) {
            state.cond.bound = false;
                    return new Action("wait", "long");
        }

        // look/perception handling
        if (act.verb.equals("look")) {
            lookCount++;
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
            if (lookCount > 2) {
                act.subject = "around";
                return act;
            }
        }

        return null;
    }
}
