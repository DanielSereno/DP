
/**
 * Write a description of class OffensiveHawthorm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OffensiveHawthorm implements Wand
{
    
    /**
     * @return The attack points
     */
    public float offensiveUses (float energy, float offensive){
        float attack = 0.6f * energy + 1.4f * offensive;
        return attack;
    }
    
    /**
     * @return the resistance points
     */
    public float defensiveUses (float energy, float defensive){
        float resistance = 0.8f * energy + 0.2f * defensive;
        return resistance;
    }
}
