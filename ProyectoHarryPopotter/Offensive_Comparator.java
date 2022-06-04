import java.util.Comparator;
/**
 * Write a description of class Offensive_up here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Offensive_Comparator implements Comparator<Character>
{
   public int compare(Character character1, Character character2){
       if(character1.getOffensive()==character2.getOffensive()){
           return 0;
        }
        else{
           if(character1.getOffensive()>character2.getOffensive()){
               return 1;
            }
            else{
                return -1;
            }
        }
            
    }
}
