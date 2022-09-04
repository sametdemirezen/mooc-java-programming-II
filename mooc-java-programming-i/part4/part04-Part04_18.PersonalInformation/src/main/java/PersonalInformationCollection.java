
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String fname = scanner.nextLine();
            if (fname.isEmpty()) {
                break;
            }
            String sname = scanner.nextLine();
            String number = scanner.nextLine();
            infoCollection.add(new PersonalInformation(fname,sname,number));
        }
         for (int i = 0; i < infoCollection.size(); i++){
             System.out.println(infoCollection.get(i).getFirstName() + " " + infoCollection.get(i).getLastName());
         }
        
    }
}
