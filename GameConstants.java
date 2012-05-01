public abstract class GameConstants {
    public static final int GUIWIDTH = 600;
    public static final int GUIHEIGHT = 620;
    
    public static final int MAPSIZE = 20;
    public static final int TILESIZE = 60;
    
    // START MOVE TYPES
    
    public static String[] none = {}; // not effective against nothing
    
    public static String[] waterWeakness = {"Grass", "Water", "Dragon"};
    public static String[] waterStrength = {"Fire", "Ground", "Rock"};
    // String[] waterNotEffective = {"Blah"};
    public static Type water = new Type("Water", waterWeakness, waterStrength, none);
    
    // START MOVES 
    
    // TYPE, NAME, POWER, ACCURACY, PP
    public static Move waterGun = new Move(water, "Water Gun", 40, 100, 25);
    
    
    } //end abstract class GameConstants