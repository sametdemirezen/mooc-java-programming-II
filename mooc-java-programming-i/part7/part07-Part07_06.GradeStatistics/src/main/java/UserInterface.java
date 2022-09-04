
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samet
 */
public class UserInterface {
    private Point points;
    private Scanner scanner;


    public UserInterface(Point point, Scanner scanner){
        this.points = point;
        this.scanner = scanner;
    }

    public void start(){
        readPoints();
        points.addGrades();
        printGradeDistribution();
    }

    public void readPoints(){
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1){
                break;
            }
            points.add(input);
        }
        System.out.println("Point average (all): " + points.pointAverages());
        System.out.println("Point average (passing): " + points.fiftyPlusAverages());
        System.out.println("Pass percentage: " + points.percentPassing());
    }

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = points.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        }

    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
