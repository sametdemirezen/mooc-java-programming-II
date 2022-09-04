

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))   
                    .map(line -> line.split(","))
                    .sorted((p1,p2) -> Double.valueOf(p1[5]).compareTo(Double.valueOf(p2[5])))
                    
                   .forEach(part -> System.out.println(part[3] + " (" + part[4] + "), " +  part[2].replace("(%)", " ").trim() + ", " + part[5] ));
                    
            
        }  catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        } 
    }

