import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hands;

    public Hand() {
        this.hands = new ArrayList<>();
    }
    
    public void add(Card card){
        hands.add(card);
    }
    
    public void print(){
        hands.stream().forEach(card -> System.out.println(card));
    }
    
    public void sort(){
        Collections.sort(hands);
    }
    
    public int getSum(){
        int sum = 0;
        for(Card hand : hands){
            sum += hand.getValue();
            
        }
        return sum;
    }

    @Override
    public int compareTo(Hand o) {
       return this.getSum() - o.getSum();
    }
    
    public void sortBySuit(){
       
            Collections.sort(hands,new BySuitInValueOrder());
    }
    
   
}

    
