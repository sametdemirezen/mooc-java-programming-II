
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
public class MisplacingBox extends Box{
    private ArrayList<Item> box;
    
    public MisplacingBox(){
        box = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
       box.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
    
    
}
