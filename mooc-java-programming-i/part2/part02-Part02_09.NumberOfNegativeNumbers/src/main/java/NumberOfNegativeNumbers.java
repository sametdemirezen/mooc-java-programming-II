
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        while (number != 0) {
            if (number != 0 && number < 0){
                count += 1;
            }
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("Number of negative numbers: " + count);
    }
}
