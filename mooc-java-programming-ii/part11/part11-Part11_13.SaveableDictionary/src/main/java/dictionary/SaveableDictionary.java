package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {

    private HashMap<String, String> dictionaryto;
    private HashMap<String, String> dictionaryfrom;
    private String filename;

    public SaveableDictionary() {
        this.dictionaryto = new HashMap<>();
        this.dictionaryfrom = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.filename = file;
    }

    public boolean load() {
        boolean bool = true;
        try (Scanner scanner = new Scanner(Paths.get(filename))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                add(parts[0], parts[1]);
            }
        } catch (Exception e) {
            bool = false;
            System.out.println("Message" + e);
        }
        return bool;
    }

    public void add(String words, String translation) {
        if (!dictionaryto.containsKey(words)) {
            this.dictionaryto.put(words, translation);
        }
        if (!dictionaryfrom.containsKey(translation)) {
            this.dictionaryfrom.put(translation, words);
        }
    }

    public String translate(String word) {
        if (this.dictionaryto.containsKey(word)) {
            return this.dictionaryto.get(word);
        }
        if (this.dictionaryfrom.containsKey(word)) {
            return this.dictionaryfrom.get(word);
        }

        return null;
    }

    public void delete(String word) {
        
        if(dictionaryto.containsKey(word)){
            String str = dictionaryto.get(word);
            dictionaryto.remove(word);
            dictionaryfrom.remove(str);
        }
        if(dictionaryfrom.containsKey(word)){
            String str = dictionaryfrom.get(word);
            dictionaryfrom.remove(word);
            dictionaryto.remove(str);
        }

    }

    public boolean save() {
        boolean result = true;
        try (PrintWriter writer = new PrintWriter(this.filename)) {
            for (String str : dictionaryfrom.keySet()) {
                writer.println(dictionaryfrom.get(str) + ":" + dictionaryto.get(dictionaryfrom.get(str)));
            }
        } catch (Exception e) {
            result = false;
            System.out.println("Message" + e);
        }
        return result;
    }
}
