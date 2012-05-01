public class Game {
    private Map m_map;
    private String m_partOfGame;
    
    public Game() {
        m_map = new Map();
        m_partOfGame = "Battle";
        } //end constructor Game
        
    public Map getMap() {
        return m_map;
        } //end method getMap
        
    public String getPartOfGame() {
        return m_partOfGame;
        } //end method getPartOfGame
    } //end class Game