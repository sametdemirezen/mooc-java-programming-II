
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        int games = 0;
        int win = 0;
        int lose = 0;
        System.out.println("Team: ");
        String team = scan.nextLine();
        try (Scanner scanner = new Scanner(Paths.get(file))){
            while (scanner.hasNextLine()){
                String str = scanner.nextLine();
                String[] ps = str.split(",");
                int ps2 = Integer.valueOf(ps[2]);
                int ps3 = Integer.valueOf(ps[3]);
                if (ps[0].equals(team) || ps[1].equals(team)){
                    games++;
                }
                if ((ps[0].equals(team) && ps2 > ps3)|| (ps[1].equals(team) && ps3 > ps2)){
                    win++;
                }
                if ((ps[0].equals(team) && ps2 < ps3)|| (ps[1].equals(team) && ps3 < ps2)){
                    lose++;
                }
                
            }  
        }catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Games: " + games);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + lose);
    }

}
