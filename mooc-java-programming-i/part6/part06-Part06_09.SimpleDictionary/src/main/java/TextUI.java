
import java.util.ArrayList;
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
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary sample;
    
    
    public TextUI(Scanner scanner,SimpleDictionary dictionary){
        this.scanner = scanner;
        sample = dictionary;
    }
    
    public void start(){
        while(true){
        System.out.println("Command: ");
        String word = scanner.nextLine();
        if (word.equals("end")){
            System.out.println("Bye bye!");
            break;
        }
        if (word.equals("add")){
            System.out.println("Word: ");
            String word1 = scanner.nextLine();
            System.out.println("Translation: ");
            String translation = scanner.nextLine();
            sample.add(word1, translation);
        }
        if (word.equals("search")){
            System.out.println("To be translated: ");
            String transword = scanner.nextLine();
            String translate = sample.translate(transword);
            if (translate == null){
                System.out.println("Word " + transword + " was not found");
            } else {
                System.out.println("Translation: " + translate);
            }
        }
        System.out.println("Unknown command");
        }    
    }
}
    
