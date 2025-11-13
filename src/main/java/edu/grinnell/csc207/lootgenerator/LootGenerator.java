package edu.grinnell.csc207.lootgenerator;

import java.util.ArrayList;

public class LootGenerator {
    /** The path to the dataset (either the small or large set). */
    private static final String DATA_SET = "data/small";
    
    // pre-loaded objects
    public class Monster {
        public String monsterClass;
        public String type;
        public String level;
        public String tc;
    }

    public class TreasureClass {
        String name;
        ArrayList<String> items;
    }

    public class Prefix {
        String name;
        String mod1code;
        int mod1min;
        int mod1max;
    }

    public class Suffix {
        String name;
        String mod1code;
        int mod1min;
        int mod1max;
    }

    public class baseItem {
        String name;
        int minac;
        int maxac;
    }

    // generated objects
    public class Item {
        // baseItem();
        int defense;
        // Prefix;
        // Suffix;
    }

    public static void main(String[] args) {
        System.out.println("This program kills monsters and generates loot!");
        // TOOD: Implement me!
    }
}
