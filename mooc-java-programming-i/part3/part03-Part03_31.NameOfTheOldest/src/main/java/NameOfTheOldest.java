
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAge =  0;
        String maxName = null;
        while (true) {
            String str = scanner.nextLine();
            if (str.equals("")) {
                break;
            }
            String[] sp = str.split(",");
            int age = Integer.valueOf(sp[1]);
            if (age > maxAge) {
                maxAge = age;
                maxName = sp[0].substring(0, sp[0].length());
            }       
        }
        System.out.println("Name of the oldest: " + maxName);
    }
}
