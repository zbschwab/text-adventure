package edu.grinnell.csc207.textadventure;

import java.util.ArrayList;
import java.util.List;

public class GameState {
    public static class Condition {
        public boolean bound;
        public boolean dizzy;
        public boolean acclimated;

        public boolean angelCalm;
        public boolean angelFrightened;

        public Condition() {
            bound = true;
            dizzy = true;
            acclimated = false;

            angelCalm = false;
            angelFrightened = false;
        }
    }

    public Room currentRoom;
    public Condition cond = new Condition();
    public List<String> inventory;

    public GameState(Room room) {
        this.currentRoom = room;
        this.cond = new Condition();
        this.inventory = new ArrayList<>();
    }

    void changeRoom(Room next) {
        this.currentRoom = next;
    }
}
