
import java.util.ArrayList;

public class Box implements Packable{
    private ArrayList<Packable> box;
    private double capacity;

    public Box(double capacity) {
        this.box = new ArrayList<>();
        this.capacity = capacity;
    }
    
    @Override
     public double weight(){
         double weight = 0;
         for (Packable packable : box){
             weight += packable.weight();
         }
         return weight;    
     }
     
     public void add(Packable packable){
         if (weight() + packable.weight() > capacity){
             return;
         }
         box.add(packable);
     }
     
     public String toString(){
        return "Box: " + box.size() + " items, total weight " + weight() + " kg"; 
     }
}
