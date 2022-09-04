
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        
    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        int index = 0;
        while (index < numbers.size()) {
            if (numbers.get(index) >= lowerLimit && numbers.get(index) <= upperLimit) {
                System.out.println(numbers.get(index));
            }
            index +=1;
        }
    }
}
