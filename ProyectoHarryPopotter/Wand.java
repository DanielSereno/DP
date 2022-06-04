
/**
 * Write a description of class Wand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Wand
{
    
    /**
     * @return The attack points
     */
    public float offensiveUses (float energy, float offensive);
    
    /**
     * @return the resistance points
     */
    public float defensiveUses (float energy, float defensive);
}
