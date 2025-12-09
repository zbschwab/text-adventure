package edu.grinnell.csc207.textadventure;

import java.util.Scanner;

import edu.grinnell.csc207.textadventure.Parser.Action;

public class TextAdventure {
    

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
                end the game with Q. """;

        Scanner in = new Scanner(System.in);
        GameState state = new GameState(new Crate());

        System.out.println(intro);

        boolean running = true;
        while (running) {
            System.out.print("\n> ");
            String input = in.nextLine().trim().toLowerCase();
            
            if (input.equals("help")) {
                System.out.println(instructions);
                continue;
            }

            if (input.equals("q")) {
                running = false;
                continue;
            }

            Action act = Parser.parse(input);
            while (act == null) {
                System.out.print("\n> ");
                input = in.nextLine().trim();
                act = Parser.parse(input);
            }

            Room room = state.currentRoom;
            room.route(act, state);
        }
        in.close();
    }
}
