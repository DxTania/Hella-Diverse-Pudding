public class Map {
    private GridSpace[][] m_spaces;
    
    public Map() {
        m_spaces = new GridSpace[ GameConstants.MAPSIZE ][ GameConstants.MAPSIZE ];
        initializeMap();
        loadMap1();
        } //end constructor Map
        
    public void initializeMap() {
        for( int r = 0; r < GameConstants.MAPSIZE; r++ ) {
            for( int c = 0; c < GameConstants.MAPSIZE; c++ ) {
                m_spaces[ r ][ c ] = new GridSpace( r, c, "Null" );
                } //end for loop
            } //end for loop
        } //end method initializeMap
        
    public void loadMap1() {
        for( int r = 0; r < GameConstants.MAPSIZE; r++ ) {
            for( int c = 0; c < GameConstants.MAPSIZE; c++ ) {
                if( r < 5 && c < 7 ) {
                    m_spaces[ r ][ c ] = new GridSpace( r, c, "Grass" );
                    } //end if
                else {
                    m_spaces[ r ][ c ] = new GridSpace( r, c, "Water" );
                    } //end else
                } //end for loop
            } //end for loop
        } //end method loadMap1
        
    public GridSpace[][] getSpaces() {
        return m_spaces;
        } //end method getSpaces
    } //end class Map