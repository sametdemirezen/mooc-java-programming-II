
import java.util.ArrayList;

public class Herd implements Movable{
    private ArrayList<Movable> movables;
    

    public Herd() {
        this.movables = new ArrayList<>();
        
    }
    
    public String toString(){
        String str = "";
        for (Movable move : movables){
            
            str += move.toString() + "\n";
        }
        return str;
    }
    
    public void addToHerd(Movable movable){
        this.movables.add(movable);
    }
    
    public void move(int dx, int dy){
        for (Movable move : movables){
            
            move.move(dx, dy);
        }
            
    }
    
    
}
