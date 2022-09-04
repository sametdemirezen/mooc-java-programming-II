
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samet
 */
public class Warehouse {
    private Map<String,Integer> warehouse;
    private Map<String,Integer> warehouseStock;
    
    
    public Warehouse(){
        warehouse = new HashMap<>();
        warehouseStock = new HashMap<>();
    }
    
    
    
    public void addProduct(String product, int price, int stock){
            warehouse.put(product, price);
            warehouseStock.put(product, stock);
        
        
    }
    
    public int price(String product){
        if (!warehouse.containsKey(product)){
            return -99;
        }
        return warehouse.get(product);
    }
    
    public int stock(String product){
        if(warehouseStock.containsKey(product)){
            return warehouseStock.get(product);
        }
        return 0;
    }
    
    public boolean take(String product){
        if (warehouseStock.containsKey(product) && warehouseStock.get(product) > 0){
            int count = warehouseStock.get(product);
            count--;
            warehouseStock.remove(product);
            warehouseStock.put(product, count);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        Set<String> keyset = new HashSet<>();
        for (String key : warehouse.keySet()){
            keyset.add(key);
        }
        return keyset;
    }
    
    
}
