public class Move
{
    // instance variables - replace the example below with your own
    private Type type;
    private String name;
    private int power;
    private int accuracy;
    private int pp;

    /**
     * Constructor for objects of class Move
     */
    public Move(Type tp, String n, int pwr, int acc, int p)
    {
        type = tp;
        name = n;
        power = pwr;
        accuracy = acc;
        pp = p;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Type getType()
    {
        return type;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getStr()
    {
        return strength;
    }
    
    public int getAcc()
    {
        return accuracy;
    }
}
