
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int first = scanner.nextInt();
        int last = scanner.nextInt();
        for (int i = first; i <= last; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
