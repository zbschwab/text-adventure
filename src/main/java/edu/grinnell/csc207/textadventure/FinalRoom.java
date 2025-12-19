package edu.grinnell.csc207.textadventure;

import edu.grinnell.csc207.textadventure.Parser.Action;

public class FinalRoom extends Room {
    public FinalRoom() {
        loadText("data/final-room.txt");
    }

    @Override
    public Action route(Action act, GameState state) {
        if (state.turnCount == 3) {
            if (state.cond.angelCalm) {
                return new Action("frightened", "angel");
            } else if (state.cond.angelFrightened) {
                return new Action("calm","angel");
            } else {
                return new Action("neutral", "angel");
            }
        }

        if (act.verb.equals("pick") && (act.subject.equals("feather") || act.subject.equals("feather"))) {
            if (state.cond.angelCalm) {
                return new Action("pick", "feathercalm");
            } else {
                return new Action("pick", "feather");
            }
        }

        return act;
    }
}
