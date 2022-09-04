/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samet
 */
public class Archive {
    private String name;
    private String info;
    
    public Archive(String info, String name){
        this.name = name;
        this.info = info;
    }
    
    public String getName(){
        return name;
    }
    
    public String getInfo(){
        return info;
    }
    
    public boolean equals(Object compared){
        if (this == compared){
            return true;
        }
        if(!(compared instanceof Archive)){
            return false;
        }
        Archive comparedArchive = (Archive) compared;
        
        return (this.info.equals(comparedArchive.info));
    }             
    
    
    public String toString(){
        return info + ": " + name;
    }
}
