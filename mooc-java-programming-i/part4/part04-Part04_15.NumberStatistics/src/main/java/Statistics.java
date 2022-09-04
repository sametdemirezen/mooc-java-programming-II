
public class Statistics {
    private int count;
    private int sum;
    public Statistics() {
        this.count = 0;
    }
    
    public void addNumber(int number) {
        sum += number;
        this.count++;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public int sum () {
        return sum;
    }
    
    public double average(){
        if (count == 0) {
            return 0;
        } else {
            return (double)this.sum / this.count;
        }
        
    }
}
