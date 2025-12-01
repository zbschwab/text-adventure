package edu.grinnell.csc207.textadventure;

import java.util.Scanner;

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

    public static void main(String[] args) {
        String intro = """
                \n\n\n

                T H E  R I G O R  O F  A N G E L S


                a text adventure. type 'help' for guidance. """;
        String instructions = """

                HINTS: give simple commands. 
                perceive your environment using verbs like {LOOK, LISTEN, TOUCH, SMELL, TASTE}.
                interact with your environment using verbs like {CHECK, HOLD, }.
                wait in silence by pressing ENTER. 
                ponder matters by using THINK.
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

                default -> System.out.println("\nTry something else.");
            }
        }
        in.close();
    }
}
