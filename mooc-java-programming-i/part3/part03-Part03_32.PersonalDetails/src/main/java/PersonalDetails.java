
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double count = 0;
        String name = "";
        while (true) {
            String str = scanner.nextLine();
            if (str.equals("")) {
                break;
            }
            String[] pcs = str.split(",");
            int year = Integer.valueOf(pcs[1]);
            sum += year;
            count++;
            if (pcs[0].length() > name.length()) {
                name = pcs[0];    
            }
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (sum / count));
    }
}
