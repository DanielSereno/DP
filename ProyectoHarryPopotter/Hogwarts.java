import java.util.HashMap;
import java.util.TreeMap;
import java.util.ArrayList;
/**
 * Write a description of class Hogwarts here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hogwarts
{
    // instance variables - replace the example below with your own
    private ArrayList<House> houses;
    private ArrayList<Character> dungeon;
    private ArrayList<Character> duel;
    private Order orderEnergy;
    private TreeMap<String, Wand> wands;

    public Hogwarts(Energy_up orderEnergy){
        this.orderEnergy= orderEnergy;
    }

    public void Duel(){
        int cont=0;
        int i, j, k;
        Character fighter1, fighter2;
        while(duel.size()>1&& cont < 10){
            for(House house: houses){
                duel.add(house.sendCharacter());
            }
            orderEnergy.order(duel);
            j=0;
            while(j< duel.size()){
                fighter1= duel.get(j);
                if(fighter1.getEnergy()> 0){
                    k=0;
                    while(k< duel.size()){
                        fighter2= duel.get(k);
                        if(fighter1.getName()!= fighter2.getName() && fighter2.getEnergy()> 0){
                            fighter1.fight(fighter2);
                        }
                    }
                }
            }
            cont= cont + 1;
            for(Character character: duel){
                if(character.getEnergy()> 0){
                    if(wands.size()>0){
                        character.setWand(wands.get(0));
                        wands.remove(0);
                    }
                    for(House house: houses){
                        if(character.getHouse()== house.getName()){
                            house.insertCharacter(character);
                        }
                    }
                }
                else{
                    dungeon.add(character);
                }
                duel.remove(character);
            }
        }
    }

}
