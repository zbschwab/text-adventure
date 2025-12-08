package edu.grinnell.csc207.textadventure;

import java.util.ArrayList;
import java.util.List;

public class GameState {
    public static class Condition {
        public boolean bound;
        public boolean dizzy;
        public boolean calm;
        public boolean frightened;

        public Condition() {
            bound = true;
            dizzy = true;
            calm = false;
            frightened = false;
        }
    }

    public Room currentRoom;
    public Condition condition = new Condition();
    public List<String> inventory;

    public GameState(Room room, Condition cond) {
        this.currentRoom = room;
        this.condition = cond;
        this.inventory = new ArrayList<>();
    }
}
