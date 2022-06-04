
/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 class Character implements Comparable<Character>
{
    //Character`s name
    private String name;
    //Character`s energy
    private float energy;
    //Character`s offensive points
    private float offensive;
    //Character`s defensive points
    private float defensive;
    //Character`s wand
    private Wand wand;
    
    private String house;

    /**
     * Constructor for objects of class Character
     */
    public Character(String name)
    {
        this.name= name;
        energy= 20;
        wand= null;
    }
    
    /**
     * @return Character`s name
     */
    public String getName(){
        return name;
    }
    
    /**
     * @return Character`s house
     */
    public String getHouse(){
        return house;
    }
    
    /**
     * @return Character`s energy
     */
    public float getEnergy(){
        return energy;
    }
    
    /**
     * @return Character`s offensive points
     */
    public float getOffensive(){
        return offensive;
    }
    
    /**
     * @return Character`s defensive points
     */
    public float getDefensive(){
        return defensive;
    }
    
    /**
     * @return Character`s wand
     */
    public Wand getWand(){
        return wand;
    }
    
    /**
     * Set character`s name
     */
    public void setName(String name){
        this.name= name;
    }
    
    /**
     * Set character`s house
     */
    public void setHouse(String house){
        this.house= house;
    }
    
    /**
     * Set character`s energy
     */
    public void setEnergy(float energy){
        this.energy= energy;
    }
    
    /**
     * Set character`s offensive points
     */
    public void setOffensive(float offensive){
        this.offensive= offensive;
    }
    
    /**
     * Set character`s defensive points
     */
    public void setDefensive(float defensive){
        this.defensive= defensive;
    }
    
    /**
     * Set character`s wand
     */
    public void setWand(Wand wand){
        this.wand= wand;
    }

    /**
     * The character figths vs the opponet given
     */
    public void fight(Character opponet){
        float attackPoints= wand.offensiveUses(energy, offensive);
        float resistance= opponet.resistance();
        if(attackPoints > resistance){
            float energy= opponet.getEnergy() - (attackPoints - resistance);
            opponet.setEnergy(energy);
        }
    }
    
    /**
     * @return Character`s resistance when he uses his wand defensively
     */
    public float resistance(){
        return wand.defensiveUses(energy, defensive);
    }
    
    /**
     *compare the price of each products .
     *@param product The product that we are going to compare.
     */
    public int compareTo(Character character){
        int result=0;
        if(this.offensive> character.getOffensive()){
            result= -1;
        }
        else{
            if(this.offensive< character.getOffensive()){
                result= 1;
            }
        }
        return result;
    }
    
    
   
}