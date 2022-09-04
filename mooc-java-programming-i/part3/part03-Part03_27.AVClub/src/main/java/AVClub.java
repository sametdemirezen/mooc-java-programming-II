
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        while (!str.equals("")) {
            String[] pcs = str.split(" ");
            int index = 0;
            while (index < pcs.length) {
                if (pcs[index].contains("av")) {
                System.out.println(pcs[index]);
            }
                index += 1;
            }
          
            str = scanner.nextLine();
        }
        
    }
}
