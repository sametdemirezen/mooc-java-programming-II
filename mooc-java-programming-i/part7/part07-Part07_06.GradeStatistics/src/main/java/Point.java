
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samet
 */
public class Point {
    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;
    private double passing;
    
    public Point(){
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
        this.passing = 0;
    }
    
    public void add(int point){
        if (point >= 0 && point <= 100){
            points.add(point);
        }
    }
    
    public double sumPoints(){
        int sum = 0;
        for (Integer point : points){
            sum += point;
        }
        return sum;
    }
    
    public double pointAverages(){
        return sumPoints()/points.size();
    }
    
    public double fiftyPlusAverages(){
        int sum = 0;
        for (Integer integer : points){
            if (integer >= 50){
                sum += integer;
                this.passing++;
            }
        }
        return sum / this.passing;
    }
    
    public double percentPassing(){
        return 100 * (this.passing / points.size());
    }
    
    public void addGrades(){
        for(Integer point : points){
            int grade = 0;
            if (point <= 50){
                grade = 0;
            }else if (point < 60){
                grade = 1;
            } else if (point < 70){
                grade = 2;
            } else if (point < 80){
                grade = 3;
            } else if (point < 90){
                grade = 4;
            } else{
                grade = 5;
            }
            grades.add(grade);
        } 
    }
     public int numberOfGrades(int grade){
        int count = 0;
        for (int i=0; i < grades.size(); i++){
            if (grades.get(i) == grade){
                count++;
            }
        }
        return count;
    }  
}
