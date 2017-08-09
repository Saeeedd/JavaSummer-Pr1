package entities;

import java.util.Date;
import java.util.Map;

public class Professor extends Person {
    //constructors
    public Professor(String _name, House _house, BloodStatus _bloodStatus, School _school, Date _birthday, Map<Integer, Course> _courses, String _notes) {
        super(_name, _house, _bloodStatus, _school, _birthday);
        courses = _courses;
        notes = _notes;
    }

    //attributes
    private Map<Integer, Course> courses;
    private String notes;
    //getters

    public Map<Integer, Course> getCourses() {
        return courses;
    }

    public String getNotes() {
        return notes;
    }

    //setters

    public void setNotes(String _notes) {
        notes = _notes;
    }

    public void setCourses(Map<Integer, Course> _courses) {
        courses = _courses;
    }
}
