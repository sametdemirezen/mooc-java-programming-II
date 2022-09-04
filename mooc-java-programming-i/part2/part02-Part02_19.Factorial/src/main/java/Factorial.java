
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = 1;
        int num = scanner.nextInt();
        if (num == 0) {
            System.out.println("Factorial: " + 1);
        } else {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial: " + factorial);
        }
        
    }
}
