package edu.grinnell.csc207.textadventure;

import edu.grinnell.csc207.textadventure.Parser.Action;

public class FinalRoom extends Room {
    public FinalRoom() {
        loadText("data/final-room.txt");
    }

    @Override
    public Action scriptedAction(GameState state) {
        return switch (state.turnCount) {
            case 0 -> new Action("change", "one");
            case 1 -> new Action("change", "two");
            case 2 -> new Action("change", "three");
            // allow user reaction for turn 3
            case 4 -> new Action("change", "four");
            // allow user reaction for turn 5
            case 6 -> new Action("hatch", "opens");
            case 7 -> new Action("climb", "out");
            case 8 -> {
                if (state.cond.angelCalm) {
                    yield new Action("end", "calm");
                } else {
                    yield new Action("end", "default");
                }
            }
            default -> null;
        };
    }

    @Override
    public Action route(Action act, GameState state) {
        if (state.turnCount == 3) {
            if (state.cond.angelCalm) {
                return new Action("frightened", "angel");
            } else if (state.cond.angelFrightened) {
                return new Action("calm", "angel");
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
