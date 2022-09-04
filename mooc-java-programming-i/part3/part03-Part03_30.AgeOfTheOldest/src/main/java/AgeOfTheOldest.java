
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max =  0;
       
        while (true) {
            String str = scanner.nextLine();
            if (str.equals("")) {
                break;
            }
            String[] sp = str.split(",");
            int age = Integer.valueOf(sp[1]);
            if (age > max) {
                max = age;
            }       
        }
        System.out.println("Age of the oldest: " + max);

    }
}
