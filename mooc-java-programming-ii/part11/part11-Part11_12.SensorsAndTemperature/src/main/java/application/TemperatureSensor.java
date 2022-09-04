
package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{
       private boolean bool;

    public TemperatureSensor() {
        this.bool = false;
    }
    
    
    @Override
    public boolean isOn() {
        return bool;
    }

    @Override
    public void setOn() {
        bool = true; 
    }

    @Override
    public void setOff() {
        bool = false;
    }

    @Override
    public int read() {
        if(bool){
            return new Random().nextInt(61)-30;
       }
        throw new IllegalStateException();
  
    }
    
}
