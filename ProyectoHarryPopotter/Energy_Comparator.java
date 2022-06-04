import java.util.Comparator;
/**
 * Write a description of class Energy_up here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Energy_Comparator implements Comparator<Character>
{
    public int compare(Character character1, Character character2){
       if(character1.getEnergy()==character2.getEnergy()){
           return character1.getName().compareTo(character2.getName());
        }
        else{
           if(character1.getEnergy()>character2.getEnergy()){
               return 1;
            }
            else{
                return -1;
            }
        }
            
    }
}
