
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
public class RecipeSearch {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        RecipeList list = new RecipeList();
         ArrayList<String> ingredients = new ArrayList();
        System.out.println("File to read: ");
        String text = scanner.nextLine();
        try (Scanner scan = new Scanner(Paths.get(text))){
            while (scan.hasNextLine()){
                String name = scan.nextLine();
                int time = Integer.valueOf(scan.nextLine());
                while(scan.hasNextLine()){
                    String ingredient = scan.nextLine();
                    if (ingredient.isEmpty()){
                        break;
                    }
                    ingredients.add(ingredient);
                }
               list.add(new Recipe(name,time,ingredients));
               ingredients = new ArrayList<>();
            }
        }  catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Commands:\n" +
                "list - lists the recipes\n" +
                "stop - stops the program\n" +
                "find name - searches recipes by name\n" +
                "find cooking time - searches recipes by cooking time\n" +
                "find ingredient - searches recipes by ingredient");
        while (true){
            System.out.println("Enter command: ");
            String input = scanner.nextLine();
            if (input.equals("stop")){
                break;
            }
            if (input.equals("list")){
                list.writeList();
            }
            if (input.equals("find name")){
                System.out.println("Searched word: ");
                String word = scanner.nextLine();
                list.findName(word);
            }
            if (input.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int max = scanner.nextInt();
                list.findCooking(max);
            }
            if (input.equals("find ingredient")){
                System.out.println("Ingredient: ");
                String word = scanner.nextLine();
                list.findIngredients(word);
            }
        }
    }

}
