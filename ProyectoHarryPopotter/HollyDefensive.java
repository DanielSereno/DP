
/**
 * Write a description of class HollyDefensive here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HollyDefensive implements Wand
{
    
    /**
     * @return The attack points
     */
    public float offensiveUses (float energy, float offensive){
        float attack = 0.7f * energy + 0.3f * offensive;
        return attack;
    }
    
    /**
     * @return the resistance points
     */
    public float defensiveUses (float energy, float defensive){
        float resistance = 0.9f * energy + 1.1f * defensive;
        return resistance;
    }
}
