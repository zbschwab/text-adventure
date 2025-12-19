package edu.grinnell.csc207.textadventure;

import edu.grinnell.csc207.textadventure.Parser.Action;

public class Basement extends Room {
    public Basement() {
        loadText("data/basement-room.txt");
    }

    @Override
    public Action route(Action act, GameState state) {

        // transformation timer
        if (state.turnCount >= 10) {
            switch (state.turnCount) {
                case 10 -> {
                    return new Action("transformation", "one");
                }
                case 11 -> {
                    return new Action("call", "angel");
                }
                case 12 -> {
                    state.changeRoom(new FinalRoom());
                    state.turnCount = 0;
                    if (state.inventory.contains("their hand")) {
                        state.inventory.remove("their hand");
                    }
                    return new Action("transformation", "two");
                }
            }
        }

        // enter new room
        switch (act.toString()) {
            case "leave crate", "step out", "move out" -> {
                return new Action("leave", "crate");
            }
        }

        // observe surroundings
        if (act.verb.equals("look") || act.verb.equals("walk") || act.verb.equals("go") ) {
            switch (act.subject) {
                case "window" -> {
                    return act;
                }

                case "panel", "hatch", "trapdoor" -> {
                    return new Action("look", "hatch");
                }

                case "crate" -> {
                    return act;
                }

                default -> {
                    if (act.subject.equals("angel")) {
                        return new Action("look", "angel");
                    }
                    return new Action("look", "entrance");
                }
            }
        }

        // angel interactions
        if (act.subject.equals("angel")) {
            switch (act.verb) {
                case "hit", "strike", "yell", "hurt" -> {
                    state.cond.angelFrightened = true;
                    state.cond.angelCalm = false;
                    return new Action("hit", "angel");
                }

                case "comfort", "hug", "hold", "smile", "touch" -> {
                    if (!state.cond.angelFrightened) {
                        state.cond.angelCalm = true;
                        if (!state.inventory.contains("their hand")) {
                            state.inventory.add("their hand");
                        }
                    }
                    return new Action("comfort", "angel");
                }

                default -> {
                    if (state.cond.angelFrightened) {
                        return new Action("look", "angelscared");
                    }
                }
            }
        }

        return act;
    }
}