package edu.grinnell.csc207.textadventure;

public class Basement extends Room {
    public Basement() {
        loadText("data/basement-room.txt");
    }

    @Override
    public void lookResponse(GameState state) {

    }
}