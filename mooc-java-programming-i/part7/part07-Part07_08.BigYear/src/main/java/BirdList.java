
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
public class BirdList {
    ArrayList<Bird> birds;
    
    public BirdList(){
        birds = new ArrayList<>();
    }
    
    public void add(Bird bird){
        birds.add(bird);
    }
    
    public void observation(String name){
        boolean x = true;
        for (Bird bird : birds){
            if(bird.getName().equals(name)){
                bird.setObservations();
                x = false;
                
            }
        }
        if(x){
            System.out.println("Not a bird!");
        }
    }
    
    public void all(){
        for (Bird bird : birds){
            System.out.println(bird);
        }
    }
    
    public void one(String name){
        for(Bird bird : birds){
            if (bird.getName().equals(name)){
                System.out.println(bird);
            }
        }
    }
}
