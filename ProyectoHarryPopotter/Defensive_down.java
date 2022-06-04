import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Defensive_down here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Defensive_down implements Order
{
    public void order(ArrayList<Character> character){
        Collections.sort(character, Collections.reverseOrder(new Defensive_Comparator()));
    }
}
