package edu.grinnell.csc207.textadventure;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import edu.grinnell.csc207.textadventure.Parser.Action;

public abstract class Room {
    private static final String STOP = "*";
    Map<String, String> text = new HashMap<>();

    final void loadText(String filename) {
        try (Scanner s = new Scanner(new File(filename));) {
            while (s.hasNextLine()) {
                String keyLine = s.nextLine().trim();
                if (!keyLine.endsWith(":")) { continue; }
                String key = keyLine.substring(0, keyLine.length() - 1);

                StringBuilder value = new StringBuilder();

                while (s.hasNextLine()) {
                    String line = s.nextLine();
                    if (line.equals(STOP)) {
                        break;
                    } 
                    value.append(line);
                }

                text.put(key, value.toString());
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

    public abstract Action route(Action act, GameState state);

    public void resolve(Action act, GameState state) {
        Action resolved_act = route(act, state);
        
        String response = text.get(keyBuilder(resolved_act));
        if (response != null) {
            System.out.println(response);
            state.turnCount++;
        } else {
            System.out.println("Try something else.");
        }
    }

}