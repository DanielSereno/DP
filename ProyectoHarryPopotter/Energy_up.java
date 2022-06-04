import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Energy_down here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Energy_up implements Order
{
    public void order(ArrayList<Character> character){
        Collections.sort(character, new Energy_Comparator());
    }
}
