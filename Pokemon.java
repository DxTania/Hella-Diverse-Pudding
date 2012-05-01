public class Pokemon {
    private Location m_location;
    private Move moves[4];
    private String name;
    private int pokeNum;
    
    public Pokemon(String n, int num) {
        m_location = new Location();
        name = n;
        pokeNum = num;
        } //end constructor Pokemon
        
    public Location getLocation() {
        return m_location;
        } //end method getLocation
    } //end class Pokemon