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
                you can interact with your environment with verbs like { USE, CHECK, COMFORT, HOLD, HIT }.
                sometimes, things will happen if you 'wait quietly'.

                ask for help by typing 'help'.
                see your inventory at any time by typing 'i'.
                end the game by typing 'q'. """;

        Scanner in = new Scanner(System.in);
        GameState state = new GameState(new Crate());

        System.out.println(intro);

        boolean running = true;
        int inv_size = state.inventory.size();

        while (running) {
            if (state.finalRoom) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }

                switch (state.turnCount) {
                    case 0 -> {
                        Action a = new Action("change", "one");
                        state.currentRoom.resolve(a, state);
                        continue;
                    }
                    case 1 -> {
                        Action a = new Action("change", "two");
                        state.currentRoom.resolve(a, state);
                        continue;
                    }
                    case 2 -> {
                        Action a = new Action("change", "three");
                        state.currentRoom.resolve(a, state);
                    }
                    // allow user reaction for turn 3
                    case 4 -> {
                        Action a = new Action("change", "four");
                        state.currentRoom.resolve(a, state);
                    }
                    // allow user reaction for turn 5
                    case 6 -> {
                        Action a = new Action("hatch", "opens");
                        state.currentRoom.resolve(a, state);
                        continue;
                    }
                    case 7 -> {
                        Action a = new Action("climb", "out");
                        state.currentRoom.resolve(a, state);
                        continue;
                    }
                    case 8 -> {
                        if (state.cond.angelCalm) {
                            Action a = new Action("response", "calm");
                            state.currentRoom.resolve(a, state);
                        } else {
                            Action a = new Action("response", "default");
                            state.currentRoom.resolve(a, state);
                        }
                        
                        running = false;
                        continue;
                    }
                }

                
            }

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

            if (input.equals("i")) {
                System.out.println(state.inventory.toString());
                continue;
            }

            Action act = Parser.parse(input);

            if (act != null) {
                System.out.print("\n");
                state.currentRoom.resolve(act, state);
            }

            if (state.inventory.size() != inv_size) {
                System.out.println("current inventory: " + state.inventory.toString());
            }
        }
        in.close();
    }
}
