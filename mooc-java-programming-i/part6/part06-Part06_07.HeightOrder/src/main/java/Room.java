
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
public class Room {

    private ArrayList<Person> personList;

    public Room() {
        this.personList = new ArrayList<>();
    }

    public void add(Person person) {
        personList.add(person);
    }

    public boolean isEmpty() {
        return personList.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return personList;
    }

    public Person shortest() {
        if (isEmpty()) {
            return null;
        }
        Person shortPerson = personList.get(0);

        for (Person person : personList) {
            if (shortPerson.getHeight() > person.getHeight()) {
                shortPerson = person;
            }
        }
        return shortPerson;
    }

    public Person take() {
        if (personList.isEmpty()) {
            return null;
        }
        Person taken = shortest();
        int index = 0;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).equals(taken)) {
                index = i;
            }
        }
        return personList.remove(index);
    }

}
