
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scan = Integer.valueOf(scanner.nextLine());
        if (scan < 0) {
            System.out.println(scan * -1);
        } else {
            System.out.println(scan);
        }

    }
}
