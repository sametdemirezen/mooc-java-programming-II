
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int end = scanner.nextInt();
        for (int i = 1; i <= end; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
