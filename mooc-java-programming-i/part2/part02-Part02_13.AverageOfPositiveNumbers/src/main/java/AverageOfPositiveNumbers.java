
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        while (number != 0) {
            if (number > 0) {
                sum += number;
                count++;
            }
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
        }
        if (number == 0 && count == 0) {
            System.out.println("Cannot calculate the average");
        }
        System.out.println((double)sum/count);
        
    }
}
