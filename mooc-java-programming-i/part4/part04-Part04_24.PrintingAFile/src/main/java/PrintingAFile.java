
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
      try (Scanner scan = new Scanner(Paths.get("data.txt"))){
          while (scan.hasNextLine()){
              String str = scan.nextLine();
              System.out.println(str);
          }
      } catch (Exception e) {
    System.out.println("Error: " + e.getMessage());

    }
}
}
