public class Pokemon {
    private Location m_location;
    private Move[] moves;
    private String name;
    private int pokeNum;
    private Stats stats;
    
    public Pokemon(String n, int num) {
        m_location = new Location();
        name = n;
        pokeNum = num;
        moves = new Move[4];
        } //end constructor Pokemon
        
    public Location getLocation() {
        return m_location;
        } //end method getLocation
    } //end class Pokemon