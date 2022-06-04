
/**
 * Write a description of class Offensive here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Offensive extends Character implements Comparable<Character>
{
    /**
     * Constructor for objects of class Offensive
     */
    public Offensive(String name)
    {
        super(name);
        super.setOffensive(25);
        super.setDefensive(20);
    }
}
