
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
    }
    public static int sum(ArrayList<Integer> numbers) {
        int index = 0;
        int sum = 0;
        while (index < numbers.size()) {
            sum += numbers.get(index);
            index += 1;
        }
        return sum;
    }
}
