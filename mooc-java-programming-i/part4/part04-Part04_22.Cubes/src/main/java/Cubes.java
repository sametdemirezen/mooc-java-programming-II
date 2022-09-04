
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
           String scan = scanner.nextLine();
           if (scan.equals("end")){
               break;
           }
           int i = Integer.valueOf(scan);
            System.out.println(i*i*i);
        }
    }
}
