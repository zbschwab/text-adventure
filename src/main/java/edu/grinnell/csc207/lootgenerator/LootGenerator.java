package edu.grinnell.csc207.lootgenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LootGenerator {
    /** The path to the dataset (either the small or large set). */
    private static final String DATA_SET = "data/small";

    // pre-loaded objects
    public static class Monster {
        public String monsterClass;
        public String type;
        public String level;
        public String tc;

        public Monster(String monsterClass, String type, String level, String tc) {
            this.monsterClass = monsterClass;
            this.type = type;
            this.level = level;
            this.tc = tc;
        }

        @Override
        public String toString() {  // TEST
            return monsterClass + ", " + type + ", " + level + ", " + tc;
        }
    }

    public static class TreasureClass {
        String name;
        String[] items;

        public TreasureClass(String name, String[] items) {
            this.name = name;
            this.items = items;
        }

        @Override
        public String toString() {  // TEST
            return name + ", " + items[0] + ", " + items[1] + ", " + items[2] + "\n";
        }
    }

    public class Prefix {
        String name;
        String mod1code;
        int mod1min;
        int mod1max;

        public Prefix(String name, String mod1code, int mod1min, int mod1max) {
            this.name = name;
            this.mod1code = mod1code;
            this.mod1min = mod1min;
            this.mod1max = mod1max;
        }
    }

    public class Suffix {
        String name;
        String mod1code;
        int mod1min;
        int mod1max;

        public Suffix(String name, String mod1code, int mod1min, int mod1max) {
            this.name = name;
            this.mod1code = mod1code;
            this.mod1min = mod1min;
            this.mod1max = mod1max;
        }
    }

    public class BaseItem {
        String name;
        int minac;
        int maxac;

        public BaseItem(String name, int minac, int maxac) {
            this.name = name;
            this.minac = minac;
            this.maxac = maxac;
        }
    }

    // generated objects
    public class Item {
        BaseItem base;
        int defense;
        Prefix prefix;
        Suffix suffix;

        public Item(BaseItem base, int defense, Prefix prefix, Suffix suffix) {
            this.base = base;
            this.defense = defense;
            this.prefix = prefix;
            this.suffix = suffix;
        }
    }

    public static ArrayList<Monster> loadMonsters(String filePath) throws FileNotFoundException {
        ArrayList<Monster> monsters = new ArrayList<>();
        Scanner s = new Scanner(new File(filePath)).useDelimiter("\t");

        while (s.hasNextLine()) {
            String line = s.nextLine();
            String[] row_data = line.split("\t");

            Monster m = new Monster(row_data[0], row_data[1], row_data[2], row_data[3]);
            monsters.add(m);
        }
    
        s.close();
        System.out.println(monsters.toString());  // TEST
        return monsters;
    }

    public static void loadTCs(String filePath) throws FileNotFoundException {
        HashMap<String, TreasureClass> TCmap = new HashMap<>();
        Scanner s = new Scanner(new File(filePath)).useDelimiter("\t");

        while (s.hasNextLine()) {
            String line = s.nextLine();
            String[] row_data = line.split("\t");
            String[] item_data = new String[3];
            System.arraycopy(row_data, 1, item_data, 0, 3);

            TreasureClass tc = new TreasureClass(row_data[0], item_data);
            TCmap.put(row_data[0], tc);
        }

        s.close();
        System.out.println(TCmap.toString());  // TEST
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("This program kills monsters and generates loot!");
    

        // testing
        ArrayList<Monster> monsters = loadMonsters(DATA_SET + "/monstats.txt");
        loadTCs(DATA_SET + "/TreasureClassEx.txt");

        Scanner s = new Scanner(System.in);
        System.out.print("Fight again [y/n]? ");
        if ("y".equalsIgnoreCase(s.next())) {
            // regenerate
        } else if ("n".equalsIgnoreCase(s.next())) {
            // exit program
        } else {
            System.out.print("Fight again [y/n]? ");
        }
        
    }
}
