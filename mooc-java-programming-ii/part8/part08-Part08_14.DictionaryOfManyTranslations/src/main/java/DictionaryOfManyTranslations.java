
import java.util.ArrayList;
import java.util.HashMap;


public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> hashmap;

    public DictionaryOfManyTranslations() {
        this.hashmap = new HashMap<>();
        
        
    }
    
    public void add(String word, String translation){
        hashmap.putIfAbsent(word, new ArrayList<>());
        hashmap.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word){
       ArrayList<String> list = this.hashmap.getOrDefault(word, new ArrayList<>());
        return list;
    }
    
    public void remove(String word){
        hashmap.remove(word);
    }
}
