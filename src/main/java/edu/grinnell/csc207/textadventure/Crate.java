package edu.grinnell.csc207.textadventure;

import edu.grinnell.csc207.textadventure.Parser.Action;

public class Crate extends Room {
    public Crate() {
        loadText("data/crate-room.txt");
    }

    @Override
    public void route(Action act, GameState state) {
        System.out.println(act.verb + ", " + act.subject);

        // if (act.verb.equals("check") && act.subject.equals("pocket")) {

        // }

        switch (act.subject) {
            case "exit", "out" -> {
                if (!state.cond.bound) {
                    state.changeRoom(new Basement());
                    act = new Action("try", "exit");
                } else {
                    act = new Action("look", "bound");
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

        String response = text.get(keyBuilder(act));
        if (response != null) {
            System.out.println(response);
        } else {
            System.out.println("Try something else.");
        }
    }
}