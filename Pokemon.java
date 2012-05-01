public class Pokemon {
    private Location m_location;
    private Move[] moves;
    private String name, type;
    private int pokeNum;
    private Stats stats;
    
    public Pokemon(String n, int num, String t) {
        m_location = new Location();
        name = n;
        pokeNum = num;
        moves = new Move[4];
        type = t;
        } //end constructor Pokemon
        
    public Location getLocation() {
        return m_location;
        } //end method getLocation
    } //end class Pokemon