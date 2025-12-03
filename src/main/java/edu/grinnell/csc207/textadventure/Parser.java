package edu.grinnell.csc207.textadventure;

public class Parser {
    public static class Action {
        String verb;
        String subject;

        public Action(String verb, String subject) {
            this.verb = verb;
            this.subject = subject;
        }
    }

    public static void parse(String input) {
        String[] phrase = input.split("\\s+");
        if (phrase.length >= 2) {
            String verb = phrase[0];
            String subject = phrase[phrase.length - 1];
            Action action = new Action(verb, subject);
            System.out.println("\naction created: " + action.verb + ", " + action.subject); // for debugging
        } else {    
            System.out.println("\nCommand is too short. Try something longer.");
        }
    }
}