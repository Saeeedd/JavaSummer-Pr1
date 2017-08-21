package entitiesService;
import entities.*;
import java.util.*;

public class PersonService {
    //constructor
    public PersonService(Person _person) {
        person = _person;
    }

    //attributes
    private Person person;
    private Vector<Person> allPersons;

    //getters
    public Person getPerson() {
        return person;
    }

    public Vector<Person> getAllPersons() {
        return allPersons;
    }

    //setters
    public void setPerson(Person _person) {
        person = _person;
    }

    public void setAllpersons(Vector<Person> _allPersons) {
        allPersons = _allPersons;
    }

    //methods
    public void getData(String fileName) {

    }

    public void setData() {

    }
}
