
import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> status;
    
    public ChangeHistory(){
        
        status = new ArrayList<>();
    }
    
    public void add(double status){
        this.status.add(status);
    }
    
    public void clear(){
        this.status.clear();
    }
    
    public String toString(){
        return this.status.toString();
    }
    
    public double maxValue() {
        double max = 0.0;
        for (double doubles : status){
            if (doubles > max){
                max = doubles;
            }   
        }
        return max;
    }
    
    public double minValue(){
        if (status.isEmpty()){
            return 0.0;
        }
        double min = status.get(0);
        for (double doubles : status){
            if (doubles < min){
                min = doubles;
            }
        }
        return min;
    }
    
    public double average(){
        double sum = 0.0;
        for (Double doubles : status){
            sum += doubles;
        }
        return sum / status.size();
    }
}
