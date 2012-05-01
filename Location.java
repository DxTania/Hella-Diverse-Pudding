public class Location {
    private int m_x;
    private int m_y;
    
    public Location() {
        m_x = 0;
        m_y = 0;
        } //end 0-argument constructor Location
    public Location( int x, int y ) {
        
        } //end 2-argument constructor Location
    public Location( Location loc ) {
        m_x = loc.getX();
        m_y = loc.getY();
        } //end 1-argument constructor Location
        
    public void setX( int x ) {
        m_x = x;
        } //end method setX
    public void setY( int y ) {
        m_y = y;
        } //end method setY
    public void setLocation( int x, int y ) {
        m_x = x;
        m_y = y;
        } //end method setLocation
        
    public int getX() {
        return m_x;
        } //end method getX
    public int getY() {
        return m_y;
        } //end method getY
    } //end class Location