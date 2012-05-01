import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class GUI extends JFrame {
    private Game m_game;
    private Location m_viewingLoc;
    private Location m_cursorLoc;
    
    public GUI( Game game ) {
        m_game = game;
        m_viewingLoc = new Location( 0, 0 );
        m_cursorLoc = new Location( 0, 0 );
        
        setSize( GameConstants.GUIWIDTH, GameConstants.GUIHEIGHT );
        setTitle( "PokemonFBGM" );
        
        setResizable( false );
        setContentPane( new Painter( this ) );
        addKeyListener( new Controller( this ) );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        setVisible( true );
        } //end constructor GUI
        
    public class Painter extends JLayeredPane {
        private GUI m_gui;
        private Map m_map;
        private GridSpace[][] m_spaces;
        private GridSpace tempGS;
        
        public Painter( GUI gui ) {
            m_gui = gui;
            m_map = m_gui.getGame().getMap();
            m_spaces = m_map.getSpaces();
            } //end constructor Painter
            
        public void paint( Graphics g ) {
            for( int r = 0; r < GameConstants.GUIWIDTH / GameConstants.TILESIZE; r++ ) {
                for( int c = 0; c < GameConstants.GUIWIDTH / GameConstants.TILESIZE; c++ ) {
                    tempGS = m_spaces[ m_gui.getViewingLoc().getY() + r ][ m_gui.getViewingLoc().getX() + c ];
                    
                    g.drawImage( tempGS.getImage(), c * GameConstants.TILESIZE, 
                                 r * GameConstants.TILESIZE, GameConstants.TILESIZE, 
                                 GameConstants.TILESIZE, this );
                    } //end for
                } //end for
                
            g.drawImage( new ImageIcon( "./Pics/Cursor.png" ).getImage(), 
                                        m_gui.getCursorLoc().getX() * GameConstants.TILESIZE,
                                        m_gui.getCursorLoc().getY() * GameConstants.TILESIZE,
                                        GameConstants.TILESIZE, GameConstants.TILESIZE, this );
            
            } //end method paint
        } //end class Painter
        
    public Game getGame() {
        return m_game;
        } //end method getGame
        
    public void setViewingLoc( int x, int y ) {
        m_viewingLoc.setLocation( x, y );
        } //end method setViewingLoc
    public Location getViewingLoc() {
        return m_viewingLoc;
        } //end method getViewingLoc
        
    public void setCursorLoc( int x, int y ) {
        m_cursorLoc.setLocation( x, y );
        } //end method setCursorLocation
    public Location getCursorLoc() {
        return m_cursorLoc;
        } //end method getCursorLoc
    } //end class GUI