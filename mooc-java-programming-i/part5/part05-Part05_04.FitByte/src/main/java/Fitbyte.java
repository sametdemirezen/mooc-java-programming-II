/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samet
 */
public class Fitbyte {
    private int age;
    private int heartRate;
    
    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.heartRate = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum) {
        double maximumHeartRate = 206.3 - (0.711 * age);
        double target = ((maximumHeartRate - heartRate)*(percentageOfMaximum) + heartRate);
        return target; 
    }
    
    
}
