
package application;

import java.util.ArrayList;
import java.util.List;


public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors;
    private List<Integer> list;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.list =   new ArrayList<>();
    }
    
    public void addSensor(Sensor toaAdd){
        sensors.add(toaAdd);
    }

    @Override
    public boolean isOn() {
        int count = 0;
        for(Sensor sensor : sensors){
            if(sensor.isOn() == true){
                count++;
            }
        }
        return count == sensors.size();    
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors){
            sensor.setOn();
        }
     }

    @Override
    public void setOff() {
        sensors.get(0).setOff();
         }

    @Override
    public int read() {
        if(isOn() == false || sensors.isEmpty()){
            throw new IllegalStateException();
        }
        double sum = 0;
        for(Sensor sensor : sensors){
            int num = sensor.read();
            sum += num;
        }
        int average = (int)sum/sensors.size();
        list.add(average);
        return average;
       }
    
    public List<Integer> readings(){
       
     return list;
    
    } 
    
}
