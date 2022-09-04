
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samet
 */
public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        int weight = 0;
        for (Suitcase bag : suitcases){
            weight += bag.totalWeight();
        }
        if (weight+ suitcase.totalWeight() > maxWeight){

        } else {
            suitcases.add(suitcase);
        }
    }

    public String toString(){
        int weight = 0;
        for (Suitcase bag : suitcases){
            weight += bag.totalWeight();
        }
        return suitcases.size() + " suitcases (" + weight + " kg)";
    }

    public void printItems(){
        for (Suitcase bag: suitcases) {
            bag.printItems();
        }
    }
}
