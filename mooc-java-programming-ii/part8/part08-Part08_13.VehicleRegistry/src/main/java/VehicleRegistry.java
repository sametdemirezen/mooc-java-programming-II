
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samet
 */
public class VehicleRegistry {
    private HashMap<LicensePlate, String> hashmap;
    
    public VehicleRegistry(){
        this.hashmap = new HashMap<>();
    }
    
    
    public boolean add(LicensePlate licensePlate, String owner){
        if (hashmap.containsKey(licensePlate)){
            return false;
        }
        hashmap.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate){
        if (!hashmap.containsKey(licensePlate)){
            return null;
        }
        return hashmap.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate){
        if (!hashmap.containsKey(licensePlate)){
            return false;
        }
        hashmap.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates(){
        for (LicensePlate lisans : hashmap.keySet() ){
            System.out.println(lisans);
        }
    }
    
    public void printOwners(){
        ArrayList<String> owners = new ArrayList<>();
        for (LicensePlate lisans : hashmap.keySet()){
            if(owners.contains(hashmap.get(lisans))){
                continue;
            }
            owners.add(hashmap.get(lisans));
            System.out.println(hashmap.get(lisans));
        }
    }
}
