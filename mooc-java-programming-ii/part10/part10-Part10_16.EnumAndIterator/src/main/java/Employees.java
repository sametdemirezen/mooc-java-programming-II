
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private ArrayList<Person> employees;
    
    public Employees(){
        employees = new ArrayList<>();
    }
    
    public void add(Person personToAdd){
        employees.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd){
        peopleToAdd.stream().forEach(person -> employees.add(person));
    }
    
    public void print(){
        employees.stream().forEach(person -> System.out.println(person));
    }
    
    public void print(Education education){
        Iterator<Person> iterator = employees.iterator();
        while(iterator.hasNext()){
            Person person = iterator.next();
            if(person.getEducation() == education){
                System.out.println(person);
            }
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = employees.iterator();
        
        while(iterator.hasNext()){
            if (iterator.next().getEducation() == education){
                iterator.remove();
            }
        }
    }
}
