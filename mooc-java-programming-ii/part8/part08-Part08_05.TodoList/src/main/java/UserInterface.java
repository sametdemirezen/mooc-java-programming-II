
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
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")){
                break;
            }
            if (command.equals("add")){
                System.out.println("To add: ");
                String task = scanner.nextLine();
                list.add(task);
            }
            if (command.equals("list")){
                list.print();
            }
            if (command.equals("remove")){
                System.out.println("Which one is removed?");
                int number = scanner.nextInt();
                list.remove(number);
            }
        }
    }
}
