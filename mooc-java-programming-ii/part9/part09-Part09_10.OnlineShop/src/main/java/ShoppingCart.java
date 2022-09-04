
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> hashmap;
    
    
    public ShoppingCart(){
        hashmap = new HashMap<>();
        
    }
    
    public void add(String product, int price){
        int qty = 1;
        if (hashmap.containsKey(product)){
            qty = hashmap.get(product).getQty();
            qty++;
        }
        Item item = new Item(product, qty, price);
        hashmap.put(product, item);
    }
    
    public int price(){
        int sum = 0;
        for(String key : hashmap.keySet()){
            sum += hashmap.get(key).price();
        }
        return sum;
    }
    
    public void print(){
        for (String key : hashmap.keySet()){
            System.out.println(key + ": " + hashmap.get(key).getQty());
        }        
    }
    

}
