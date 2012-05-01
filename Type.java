public class Type
{
    // instance variables - replace the example below with your own
    private String name;
    private String[] lessEffective;
    private String[] superEffective;
    private String[] notEffective;

    /**
     * Constructor for objects of class Type
     */
    public Type(String n, String[] lE, String[] sE, String[] nE)
    {
        // initialise instance variables
        name = n;
        lessEffective = lE;
        superEffective = sE;
        notEffective = nE;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getName()
    {
        return name;
    }
    
    public String[] getWeakness()
    {
        return lessEffective;
    }
    
    public String[] getStrength()
    {
        return superEffective;
    }
    
    public String[] getNotEffective()
    {
        return notEffective;
    }
}
