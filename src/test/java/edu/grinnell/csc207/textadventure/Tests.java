package edu.grinnell.csc207.textadventure;
import java.io.FileNotFoundException;

import org.junit.jupiter.api.DisplayName;

import net.jqwik.api.Property;

public class Tests {
    @Property(tries=10000000)
    @DisplayName("New test")
    public void Test() throws FileNotFoundException {
    }
}