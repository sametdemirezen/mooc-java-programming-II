
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        // write your test code here
        Person person = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        System.out.println(person);
    }
    
    public static void printPersons(ArrayList<Person> persons){
        for (Person person : persons){
            System.out.println(person);
        }
    }
}
