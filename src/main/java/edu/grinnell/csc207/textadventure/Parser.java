package edu.grinnell.csc207.textadventure;

public class Parser {
    public static class Action {
        String verb;
        String subject;

        public Action(String verb, String subject) {
            this.verb = verb;
            this.subject = subject;
        }

        @Override
        public String toString() {
            return this.verb + " " + this.subject;
        }
    }

    public static Action parse(String input) {
        String[] phrase = input.split("\\s+");
        if (phrase.length >= 2) {
            String verb = phrase[0];
            String subject = phrase[phrase.length - 1];
            return new Action(verb, subject);
        } else {    
            System.err.println("\nCommand is too short. Try something longer.");
            return null;
        }
    }
}