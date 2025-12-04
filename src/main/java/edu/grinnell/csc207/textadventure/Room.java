package edu.grinnell.csc207.textadventure;

public interface Room {
    // @return the name of the room
    public String getRoomName();

    // @return the room's single entrance
    public String getEntrance();

    // @return description of room from within it
    public String getDescripIn();

    // @return the room's single exit
    public String getExit();

    // @return description of room from outside of it
    public String getDescripOut();

    public class Crate implements Room {
        private String name = "crate";
        private String entrance = "You're folded up in an awkward position. Half your body's gone numb, your head feels fuzzy, and everything smells like tar.";
        private String descripIn = "You feel coarse, splintery wood grain beneath your fingers. You're in a sealed box of some sort. Hope you're not claustrophobic.";
        private String exit = "You push the hastily nailed-on box lid up and away. It crashes to the floor. You realize you were in a wooden shipping crate; when you stand up, it seems even smaller from the outside.";
        private String descripOut = "A wooden shipping crate, with the top lying a few feet away.";

        public Crate(String name, String entrance, String descripIn, String exit, String descripOut) {
            this.name = name;
            this.entrance = entrance;
            this.descripIn = descripIn;
            this.exit = exit;
            this.descripOut = descripOut;
        }

        @Override
        public String getRoomName() { return name; }
        @Override
        public String getEntrance() { return entrance; }
        @Override
        public String getDescripIn() { return descripIn; }
        @Override
        public String getExit() { return exit; }
        @Override
        public String getDescripOut() { return descripOut; }
    }

    public class Basement implements Room {
        private String name = "basement";
        private String entrance = "Concrete floor, walls, ceiling. You think you might be in a basement.";
        private String descripIn = "A small rectangular window at the top of a wall fills the room with dim light. Tfloor is stained, and there's a collection of odd metal circles in the corner.";
        private String exit = "A rusted metal panel on the ceiling, just above arms reach.";
        private String descripOut = "";

        public Basement(String name, String entrance, String descripIn, String exit, String descripOut) {
            this.name = name;
            this.entrance = entrance;
            this.descripIn = descripIn;
            this.exit = exit;
            this.descripOut = descripOut;
        }

        @Override
        public String getRoomName() { return name; }
        @Override
        public String getEntrance() { return entrance; }
        @Override
        public String getDescripIn() { return descripIn; }
        @Override
        public String getExit() { return exit; }
        @Override
        public String getDescripOut() { return descripOut; }
    }
}