
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        while (true){
            int sayi = scanner.nextInt();
            if (sayi == 0){
                break;
            }
            if (sayi < 0){
                continue;
            }
            sum += sayi;
            count++;
        }
        if (count == 0){
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sum / count);
        }
        
    }
}
