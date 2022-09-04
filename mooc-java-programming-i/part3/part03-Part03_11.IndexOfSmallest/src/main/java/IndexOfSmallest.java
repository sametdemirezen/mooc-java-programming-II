
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = scanner.nextInt();
            if (input == 9999) {
                break;
            }
            list.add(input);
        }
        System.out.println("");
        int index = 0;
        int count = 0;
        int small = list.get(0);
        while (index < list.size()) {
            if (small > list.get(index)) {
                small = list.get(index);
                count = index;
            }
            index += 1;
        }
        System.out.println("Smallest number: " + small);
        System.out.println("Found at index: " + count);
    }
}
