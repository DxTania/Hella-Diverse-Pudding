import java.awt.Image;
import javax.swing.ImageIcon;

public class GridSpace {
    private Location m_loc;
    //private Pokemon m_pokeOnSpace
    private String m_type;
    
    //To indicate spaces outside the boundary of the map, type = "Null"
    public GridSpace( int x, int y, String type ) {
        m_loc = new Location( x, y );
        m_type = type;
        } //end constructor GridSpace
        
    public void addPokemonTo( /*Pokemon poke, */int x, int y ) {
        //m_pokeOnSpace
        } //end method addPokemonTo
        
    public String getType() {
        return m_type;
        } //end method getType
        
    public Image getImage() {
        return new ImageIcon( "./Pics/" + m_type + "Space.png" ).getImage();
        } //end method getImage
        
    public Location getLocation() {
        return m_loc;
        } //end method getLocation
    } //end class GridSpace