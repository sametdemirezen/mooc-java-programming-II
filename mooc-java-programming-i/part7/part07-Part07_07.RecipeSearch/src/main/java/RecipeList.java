
import java.util.ArrayList;

public class RecipeList {
     ArrayList<Recipe> list;

    public RecipeList(){

        list = new ArrayList<>();
    }

    public void add(Recipe recipe){

        list.add(recipe);
    }

    public void writeList(){
        for (Recipe recipe : list){
            System.out.println(recipe);
        }
    }

    public void findName(String name){
        for (int i=0; i<list.size(); i++){
            if (list.get(i).getName().contains(name)){
                System.out.println(list.get(i));
            }
        }  
    }

    public void findCooking(int time){
        for (Recipe recipe:list) {
            if (recipe.getCookingTime() <= time){
                System.out.println(recipe);
            }
        }
    }

    public void findIngredients(String ingredient){
        for (Recipe recipe : list){
            for (int i = 0; i < recipe.getIngredients().size(); i ++){
                if (recipe.getIngredients().get(i).equals(ingredient)){
                    System.out.println(recipe);
                }
            }
        }
    }
}
