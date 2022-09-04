
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        while (true) {
          String  scan = scanner.nextLine();
          if (scan.isEmpty()) {
              break;
          }
          items.add(new Item(scan));
            System.out.println(items.get(index));
            index++;
        }

    }
}
