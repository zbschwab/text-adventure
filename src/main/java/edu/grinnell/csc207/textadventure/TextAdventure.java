package edu.grinnell.csc207.textadventure;

import java.util.Scanner;

import edu.grinnell.csc207.textadventure.Parser.Action;

public class TextAdventure {
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

    public static class PlayerInfo {
        public Room room;
        public Condition condition;
        public Inventory inventory;

        public PlayerInfo(Room room, Condition cond, Inventory inv) {
            this.room = room;
            this.condition = cond;
            this.inventory = inv;
        }
    }

    Condition playerCond = new Condition();
    Condition otherCond = new Condition();

    public static void main(String[] args) {
        String intro = """
                \n\n\n

                T H E  R I G O R  O F  A N G E L S


                a text adventure. type 'help' for guidance. """;
        String instructions = """

                HINTS: give simple sentence commands. 
                starting with a verb and ending with a subject works best; ex. "Look at the water"
                perceive your environment using verbs like {LOOK, LISTEN, TOUCH, SMELL, TASTE}.
                interact with your environment using verbs like {CHECK, HOLD, SING, HIT}.
                end the game with EXIT. """;

        Scanner in = new Scanner(System.in);
        boolean running = true;
        System.out.println(intro);
        while (running) {
            System.out.print("\n> ");
            String input = in.nextLine().trim();
            switch (input.toLowerCase()) {
                case "help" -> System.out.println(instructions);
                case "exit" -> running = false;

                default -> {
                    Action act = null;
                    while (act == null) {
                        act = Parser.parse(input);
                        if (act == null) {
                            System.out.print("\n> ");
                            input = in.nextLine().trim();
                        }
                    }
                }
            }
        }
        in.close();
    }
}
