package edu.grinnell.csc207.textadventure;

import edu.grinnell.csc207.textadventure.Parser.Action;

public class FinalRoom extends Room {
    public FinalRoom() {
        loadText("data/final-room.txt");
    }

    @Override
    public Action route(Action act, GameState state) {
        
        throw new UnsupportedOperationException("Unimplemented method 'route'");
    }
    
}
