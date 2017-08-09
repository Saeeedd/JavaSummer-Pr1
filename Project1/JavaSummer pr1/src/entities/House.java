package entities;

import java.util.*;

public class House {
    //cunstructors
    public House(String _name, School _school, Vector<Student> _students, Professor _headTecher, ArrayList<String> _qualities, Map<Integer, Student> _prefects) {
        name = _name;
        school = _school;
        students = _students;
        headTeacher = _headTecher;
        qualities = _qualities;
        prefects = _prefects;
    }

    //attributes
    private String name;
    private School school;
    private Vector<Student> students;
    private Professor headTeacher;
    private ArrayList<String> qualities;
    private Map<Integer, Student> prefects;

    //getters
    public String getName() {
        return name;
    }

    public School getSchool() {
        return school;
    }

    public Vector<Student> getStudents() {
        return students;
    }

    public Professor getHeadTeacher() {
        return headTeacher;
    }

    public ArrayList<String> getQualities() {
        return qualities;
    }

    public Map<Integer, Student> getPrefects() {
        return prefects;
    }

    //setters
    public void setName(String _name) {
        name = _name;
    }

    public void setSchool(School _school) {
        school = _school;
    }

    public void setStudents(Vector<Student> _students) {
        students = _students;
    }

    public void setHeadTeacher(Professor _headTeacher) {
        headTeacher = _headTeacher;
    }

    public void setQualities(ArrayList<String> _qualities) {
        qualities = _qualities;
    }

    public void setName(Map<Integer, Student> _prefects) {
        prefects = _prefects;
    }
}
