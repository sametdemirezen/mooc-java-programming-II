
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> list = new ArrayList<>();
        
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            list.add(num);
        }
        System.out.println("");
        double sum = 0;
        int index = 0;
        while (index < list.size()) {
            sum += list.get(index);
            index +=1;
        }
        System.out.println("Average: " + (sum / index));
       
    }
}
