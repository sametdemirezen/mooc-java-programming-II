
import java.util.ArrayList;

public class Recipe {
        String name;
    int cookingTime;
    ArrayList<String> ingredients;

    public Recipe(String name, int time, ArrayList<String> ingredients){
        this.name = name;
        this.cookingTime = time;
        this.ingredients = ingredients;
    }

    public String getName(){
        return this.name;
    }

    public int getCookingTime(){
        return this.cookingTime;
    }

        @Override
    public String toString(){
        return this.name + ", cooking time: " + this.cookingTime;
    }

    public ArrayList<String> getIngredients(){
        return this.ingredients;
    }
}
