import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class House here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class House 
{
    private ArrayList<Character>character;
    private String name;
    private Order order;
    /**
     * Constructor for objects of class House
     */
    public House(String name)
    {
        character= new ArrayList<Character>();
        this.name= name;
    }
    
    /**
     * @return House`s name
     */
    public String getName(){
        return name;
    }
    
    /**
     * Set house`s name
     */
    public void setName(String name){
        this.name= name;
    }
    
    public void setOrder(Order order){
        this.order= order;
    }
    
    /**
     * Insert the character AT THE END OF THE LIST
     */
    public void insertCharacter (Character character){
        this.character.add(character);
        character.setHouse(name);
    }
    /**
     * 
     */
    public ArrayList<Character> getCharacter(){
        return character;
    }
    
    /**
     * Send the first character of the list and delete it from 
     * the list
     */
    public Character sendCharacter(){
        Character aux=character.get(0);
        character.remove(0);
        return aux;
    }
    
}
