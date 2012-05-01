import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Controller implements KeyListener {
    private GUI m_gui;
    
    public Controller( GUI gui ) {
        m_gui = gui;
        } //end constructor Controller
        
    public void keyPressed( KeyEvent ke ) {
        //Move the cursor around the map
        if( getGame().getPartOfGame() == "Battle" ) {
            if( ke.getKeyCode() == KeyEvent.VK_UP ) {
                if( getCursorLocY() != 0 && 
                    getGrid()[ getCursorLocX() ][ getCursorLocY() - 1 ].getType() != "Null" ) {
                    setCursorLoc( getCursorLocX(), getCursorLocY() - 1 );
                    } //end if
                else if( getViewingLocY() != 0 ) {
                    setViewingLoc( getViewingLocX(), getViewingLocY() - 1 );
                    } //end else if
                } //end if
             
            if( ke.getKeyCode() == KeyEvent.VK_DOWN ) {
                if( getCursorLocY() != GameConstants.GUIWIDTH / GameConstants.TILESIZE - 1 && 
                    getGrid()[ getCursorLocX() ][ getCursorLocY() + 1 ].getType() != "Null" ) {
                    setCursorLoc( getCursorLocX(), getCursorLocY() + 1 );
                    } //end if
                else if( getViewingLocY() != GameConstants.MAPSIZE - GameConstants.GUIWIDTH / GameConstants.TILESIZE ) {
                    setViewingLoc( getViewingLocX(), getViewingLocY() + 1 );
                    } //end else if
                } //end if
             
            if( ke.getKeyCode() == KeyEvent.VK_RIGHT ) {
                if( getCursorLocX() != GameConstants.GUIWIDTH / GameConstants.TILESIZE - 1 && 
                    getGrid()[ getCursorLocX() + 1 ][ getCursorLocY() ].getType() != "Null" ) {
                    setCursorLoc( getCursorLocX() + 1, getCursorLocY() );
                    } //end if
                else if( getViewingLocX() != GameConstants.MAPSIZE - GameConstants.GUIWIDTH / GameConstants.TILESIZE - 1 ) {
                    setViewingLoc( getViewingLocX() + 1, getViewingLocY() );
                    } //end else if
                } //end if
             
            if( ke.getKeyCode() == KeyEvent.VK_LEFT ) {
                if( getCursorLocX() != 0 && 
                    getGrid()[ getCursorLocX() - 1 ][ getCursorLocY() ].getType() != "Null" ) {
                    setCursorLoc( getCursorLocX() - 1, getCursorLocY() );
                    } //end if
                else if( getViewingLocX() != 0 ) {
                    setViewingLoc( getViewingLocX() - 1, getViewingLocY() );
                    } //end else if
                } //end if
            } //end if
         
        if( ke.getKeyCode() == KeyEvent.VK_X ) {
            System.out.println( "Select" );
            } //end if
            
        if( ke.getKeyCode() == KeyEvent.VK_Z ) {
            System.out.println( "Deselect" );
            } //end if
         
        m_gui.repaint();
        } //end method keyPressed
      
    public void keyTyped( KeyEvent ke ) {
      
        } //end method keyTyped
      
    public void keyReleased( KeyEvent ke ) {
        
        } //end method keyReleased
        
    public void setCursorLoc( int x, int y ) {
        m_gui.setCursorLoc( x, y );
        } //end method setCursorLoc
    public int getCursorLocX() {
        return m_gui.getCursorLoc().getX();
        } //end method getCursorLocX
    public int getCursorLocY() {
        return m_gui.getCursorLoc().getY();
        } //end method getCursorLocY
        
    public void setViewingLoc( int x, int y ) {
        m_gui.setViewingLoc( x, y );
        } //end method setViewingLoc
    public int getViewingLocX() {
        return m_gui.getViewingLoc().getX();
        } //end method getViewingLocX
    public int getViewingLocY() {
        return m_gui.getViewingLoc().getY();
        } //end method getViewingLocY
        
    public GridSpace[][] getGrid() {
        return getGame().getMap().getSpaces();
        } //end method getGrid
      
    public Game getGame() {
        return m_gui.getGame();
        } //end method getGame
    } //end class Controller