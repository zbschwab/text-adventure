package edu.grinnell.csc207.textadventure;

import edu.grinnell.csc207.textadventure.Parser.Action;

public class Crate extends Room {
    public Crate() {
        loadText("data/crate-room.txt");
    }

    @Override
    public void route(Action act, GameState state) {
        System.out.println(text.get(keyBuilder(act)));
    }
}