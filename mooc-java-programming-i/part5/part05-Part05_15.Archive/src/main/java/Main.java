
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> list = new ArrayList<>();
        while (true) {
            String info = scanner.nextLine();
            if (info.isEmpty()) {
                break;
            }
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            if (!list.contains(new Archive(info, name))) {
                list.add(new Archive(info, name));
            }

        }
        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }

    }
}
