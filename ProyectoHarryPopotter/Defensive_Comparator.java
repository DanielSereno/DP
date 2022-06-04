import java.util.Comparator;
/**
 * Write a description of class Defensive_up here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Defensive_Comparator implements Comparator<Character>
{
   public int compare(Character character1, Character character2){
       if(character1.getDefensive()==character2.getDefensive()){
           return 0;
        }
        else{
           if(character1.getDefensive()>character2.getDefensive()){
               return 1;
            }
            else{
                return -1;
            }
        }
            
    }
}
