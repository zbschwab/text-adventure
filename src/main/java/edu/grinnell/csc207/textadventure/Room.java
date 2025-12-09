package edu.grinnell.csc207.textadventure;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import edu.grinnell.csc207.textadventure.Parser.Action;

public abstract class Room {
    Map<String, String> text = new HashMap<>();

    final void loadText(String filename) {
        try (Scanner s = new Scanner(new File(filename));) {
            while (s.hasNextLine()) {
                String keyLine = s.nextLine().trim();
                if (!keyLine.endsWith(":")) { continue; }
                String key = keyLine.substring(0, keyLine.length() - 1);

                if (s.hasNextLine()) {
                    String value = s.nextLine().trim();
                    text.put(key, value);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Error loading room from " + filename, e);
        }
    } 

    String keyBuilder(Action act) {
        String verb = act.verb.toUpperCase();
        String subject = act.subject.toUpperCase();
        
        String key = verb + "_" + subject;

        return key;
    }

    public abstract void route(Action act, GameState state);

}