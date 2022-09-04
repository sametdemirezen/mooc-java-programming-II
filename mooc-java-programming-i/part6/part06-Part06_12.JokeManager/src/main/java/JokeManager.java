
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samet
 */
public class JokeManager {
    private ArrayList<String> jokes;
            
    
    public JokeManager(){
        jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        jokes.add(joke);
    }
    
    public String drawJoke(){
        Random draw = new Random();
        if (jokes.isEmpty()){
            return "Jokes are in short supply.";
        }
        int index = draw.nextInt(jokes.size());
        return jokes.get(index);
    }
    
    public void printJokes(){
        for (String str : jokes){
            System.out.println(str);
        }
    }
}
