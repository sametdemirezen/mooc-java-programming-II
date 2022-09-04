
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        Statistics st = new Statistics();
        Statistics steven = new Statistics();
        Statistics stodd = new Statistics();
        while (true) {
            System.out.println("Enter numbers:");
            int scan = scanner.nextInt();
            if (scan == -1) {
                break;
            }
            st.addNumber(scan);
            if (scan % 2 == 0) {
                steven.addNumber(scan);
            } else {
                stodd.addNumber(scan);
            }
        }
        System.out.println("Sum: " + st.sum());
        System.out.println("Sum of even numbers: " + steven.sum());
        System.out.println("Sum of odd numbers: " + stodd.sum());
    }
}
