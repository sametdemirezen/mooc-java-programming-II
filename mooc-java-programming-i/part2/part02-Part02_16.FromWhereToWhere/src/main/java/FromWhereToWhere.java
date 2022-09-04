
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int first = scanner.nextInt();
        System.out.println("Where from?");
        int second = scanner.nextInt();
        if (second > first) {
            System.out.println("");
        } else {
            for (int i = second; i <= first; i++) {
                System.out.println(i);
            }
        }
        
    }
}
