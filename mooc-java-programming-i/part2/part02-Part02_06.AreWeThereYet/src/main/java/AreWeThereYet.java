
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int value = Integer.valueOf(scanner.nextLine());
        while (value != 4) {
            System.out.println("Give a number:");
            value = Integer.valueOf(scanner.nextLine());
        }

    }
}
