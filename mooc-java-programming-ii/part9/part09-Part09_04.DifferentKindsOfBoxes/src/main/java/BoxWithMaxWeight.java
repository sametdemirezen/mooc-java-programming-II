
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
public class BoxWithMaxWeight extends Box{
    private ArrayList<Item> box;
    private int capacity;

    public BoxWithMaxWeight(int capacity) {
        box = new ArrayList<>();
        this.capacity = capacity;
    }
    
    public void add(Item item){
        if (item.getWeight() + weight() > capacity){
            return;
        }
        box.add(item);
    }
    
    public int weight(){
        int weight = 0;
        for (Item item : box){
            weight += item.getWeight();
        }
        return weight;
    }
    
     public boolean isInBox(Item item){
         for (Item items : box){
             if (items.equals(item)){
                 return true;
             }
         }
         return false;
     }
    
}
