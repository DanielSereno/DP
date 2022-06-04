import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Defensive_down here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Defensive_up implements Order
{
    public void order(ArrayList<Character> character){
        Collections.sort(character, new Defensive_Comparator());
    }
}
