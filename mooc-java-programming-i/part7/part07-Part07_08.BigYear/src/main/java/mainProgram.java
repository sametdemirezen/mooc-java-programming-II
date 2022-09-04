
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        BirdList birds = new BirdList();
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("?");
            String input = scan.nextLine();
            if (input.equals("Quit")){
                break;
            }
            if(input.equals("Add")){
                System.out.println("Name: ");
                String name = scan.nextLine();
                System.out.println("Name in Latin: ");
                String latin = scan.nextLine();
                birds.add(new Bird(name,latin));
            }
            if (input.equals("Observation")){
                System.out.println("Bird?");
                String bird = scan.nextLine();
                birds.observation(bird);
            }
            if (input.equals("All")){
                birds.all();
            }
            if (input.equals("One")){
                System.out.println("Bird?");
                String bird = scan.nextLine();
                birds.one(bird);
            }
        }
    }

}
