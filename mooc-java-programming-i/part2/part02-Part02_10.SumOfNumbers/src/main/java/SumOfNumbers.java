
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());
        while (num != 0){
            sum += num;
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("Sum of the numbers: " + sum);
    }
}
