package edu.grinnell.csc207.textadventure;

import java.util.HashMap;
import java.util.Map;

public abstract class Room {
    Map<String, String> text = new HashMap<>();

    void loadText(String file) {

    } 

    public abstract void lookResponse(GameState state);


    public class Crate extends Room {
        public Crate() { loadText("data/crate-room.txt"); }

        @Override 
        public void lookResponse(GameState state) {
            
        }
    }

    public class Basement extends Room {
        public Basement() { loadText("data/basement-room.txt"); }

        @Override 
        public void lookResponse(GameState state) {
            
        }
    }
}