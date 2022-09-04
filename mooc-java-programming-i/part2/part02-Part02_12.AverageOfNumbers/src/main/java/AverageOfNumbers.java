
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        while (number != 0) {
            sum += number;
            count++;
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
            
        }
        System.out.println("Average of the numbers: " + ((double)sum / count));
    }
}
