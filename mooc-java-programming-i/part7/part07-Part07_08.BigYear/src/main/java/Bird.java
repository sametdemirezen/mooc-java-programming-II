/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samet
 */
public class Bird {
    private String name;
    private String latinName;
    private int observations;
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getLatinName(){
        return this.latinName;
    }
    
    public int getObservations(){
        return this.observations;
    }
    
    public void setObservations(){
        this.observations += 1;
    }
    
    @Override
    public String toString(){
        return this.name + " (" + this.latinName + "): " + this.observations + " observations";
    }
}
