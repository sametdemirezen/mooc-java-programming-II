
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give a number:");
        String value = scanner.nextLine();
        double number = Double.valueOf(value);
        System.out.println("You gave the number " + number);

    }
}
