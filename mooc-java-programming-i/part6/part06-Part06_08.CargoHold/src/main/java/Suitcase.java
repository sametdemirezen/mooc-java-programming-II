
import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight){
        items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item){
        int weight = 0;
        for (Item count : items){
          weight += count.getWeight();
        }
        if (weight + item.getWeight() > maxWeight){
            
        } else {
            items.add(item);
        }
    }
    
    public String toString(){
        int count = 0;
        int weight = 0;
        if (items.isEmpty()){
            return "no items (0 kg)";
        }
        if (items.size() == 1){
            return "1" + " item " + "(" + items.get(0).getWeight() + " kg)";
        }
        for (Item item : items){
            count++;
            weight += item.getWeight();
        }
        
        return count + " items " + "(" + weight + " kg)";
    }
    
    public void printItems(){
        for (Item item : items) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }

    public int totalWeight() {
        int total = 0;
        for (Item item : items) {
            total += item.getWeight();
        }
        return total;
    }
    
    public Item heaviestItem(){
        if (items.isEmpty()){
            return null;
        }
        int index = 0;
        int heavy = items.get(0).getWeight();
        for (int i = 0; i < items.size(); i++) {
            if (heavy <= items.get(i).getWeight()){
                heavy = items.get(i).getWeight();
                index = i;
            }
        }

    return items.get(index);
    }
}
