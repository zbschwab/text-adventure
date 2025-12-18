package edu.grinnell.csc207.textadventure;

import java.util.Scanner;

import edu.grinnell.csc207.textadventure.Parser.Action;

public class TextAdventure {
    

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        String intro = """
                \n\n\n

                T H E  R I G O R  O F  A N G E L S


                a text adventure. type 'help' for guidance. """;
        String instructions = """

                HINTS: give simple sentence commands.
                <verb>..other text..<subject>
                works best (ex. "look at the angel").
                you can percieve your environment with verbs like { LOOK, LISTEN, TOUCH, FEEL }
                you can interact with your environment with verbs like { GO, OPEN, PICK UP, USE }.
                
                ask for help by typing 'help'.
                end the game by typing 'q'. """;

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
            
            if (act != null) {
                System.out.print("\n");
                state.currentRoom.resolve(act, state);
            }
        }
        in.close();
    }
}
