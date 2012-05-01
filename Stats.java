import java.util.ArrayList;

public class Stats
{
    private int level;
    private int attack, spAttack;
    private int defense, spDefense;
    private int speed;
    private Type[] types;

    /**
     * Constructor for objects of class Stats
     */
    public Stats(int lvl, int attk, int spAttk, int def, int spDef, int spd, Type[] typ)
    {
        level = lvl;
        attack = attk;
        spAttack = spAttk;
        defense = def;
        spDefense = spDef;
        speed = spd;
        types = typ;
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return 0;
    }
}
