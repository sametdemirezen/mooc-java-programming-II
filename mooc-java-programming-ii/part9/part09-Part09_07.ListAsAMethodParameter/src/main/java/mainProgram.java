
import java.util.ArrayList;
import java.util.List;



public class mainProgram {

    public static void main(String[] args) {
        // test your method here
        List<String> list = new ArrayList<>();
        list.add("samet");
        list.add("demirezen");
        list.add("bursa");
        System.out.println(returnSize(list));

    }

    // Implement here a method returnSize
    // which returns the size of the list given to it
    //as a parameter
    public static int returnSize(List list){
        return list.size();
    }
}
