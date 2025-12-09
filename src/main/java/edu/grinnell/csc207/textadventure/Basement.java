package edu.grinnell.csc207.textadventure;

import edu.grinnell.csc207.textadventure.Parser.Action;

public class Basement extends Room {
    public Basement() {
        loadText("data/basement-room.txt");
    }

    @Override
    public void route(Action act, GameState state) {
        System.out.println(text.get(keyBuilder(act)));
    }
}