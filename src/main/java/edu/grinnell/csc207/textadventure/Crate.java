package edu.grinnell.csc207.textadventure;

import edu.grinnell.csc207.textadventure.Parser.Action;

public class Crate extends Room {
    public Crate() {
        loadText("data/crate-room.txt");
    }

    @Override
    public Action route(Action act, GameState state) {
        System.out.println(act.verb + ", " + act.subject); // debug

        switch (act.toString()) {
            case "check pocket", "check pockets" -> {
                if (state.cond.bound) {
                    return new Action("check", "pocketbound");
                } else {
                    return act;
                }
            }
        }

        switch (act.subject) {
            case "exit", "out" -> {
                if (!state.cond.bound) {
                    state.changeRoom(new Basement());
                    return new Action("try", "exit");
                } else {
                    return new Action("look", "bound");
                }
            }
        }

        switch (act.verb) {
            case "look" -> {
                if (state.cond.dizzy) {
                    act.subject = "dizzy";
                    state.cond.dizzy = false;
                    break;
                }
                if (!state.cond.acclimated) {
                    act.subject = "first";
                    state.cond.acclimated = true;
                    break;
                }
                // act.subject = "around";
            }
        }

        return act;
    }
}