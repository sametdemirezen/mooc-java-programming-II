
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samet
 */
public class StorageFacility {
    private HashMap<String,ArrayList<String>> hashmap;
    
    public StorageFacility(){
        this.hashmap = new HashMap<>();
    }
    
    public void add(String unit, String item){
        hashmap.putIfAbsent(unit,new ArrayList<>());
        hashmap.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        ArrayList<String> list = hashmap.getOrDefault(storageUnit, new ArrayList<>());
        
        return list;
    }
    
    public void remove(String storageUnit, String item){
        if (hashmap.get(storageUnit).isEmpty()){
            hashmap.remove(storageUnit);
        }
        hashmap.get(storageUnit).remove(item);
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> names = new ArrayList<>();
        for(String key : hashmap.keySet()){
            if (!hashmap.get(key).isEmpty()){
                names.add(key);
            }
        }
        return names;
    }
}
