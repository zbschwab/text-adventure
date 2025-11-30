package edu.grinnell.csc207.textadventure;

import java.util.ArrayList;

public class TextAdventure {

    public static class PlayerInfo {
        public Room room;
        public Condition condition;
        private Inventory inventory;

        public PlayerInfo(Room room, Condition cond, Inventory inv) {
            this.room = room;
            this.condition = cond;
            this.inventory = inv;
        }
    }

    ArrayList<String> history = new ArrayList<>();

    public static void main(String[] args) {

    }
}