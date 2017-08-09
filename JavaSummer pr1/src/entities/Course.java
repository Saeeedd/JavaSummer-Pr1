package entities;

import java.util.*;

public class Course {
    //constructor
    public Course(String _name, Professor _professor, Grade _minGrade, int _year) {
        name = _name;
        minGrade = _minGrade;
        professor = _professor;
        year = _year;
    }

    public Course(String _name) {
        name = _name;
    }

    //attributes
    protected String name;
    protected Grade minGrade;
    protected Professor professor;
    protected int year;
    protected Vector<Student> students;

    //getters
    public String getName() {
        return name;
    }

    public Grade getMinGrade() {
        return minGrade;
    }

    public Professor getProfessor() {
        return professor;
    }

    public int getYear() {
        return year;
    }

    ;

    public Vector<Student> getStudents() {
        return students;
    }

    //setters
    public void setName(String _name) {
        name = _name;
    }

    public void setMinGrade(Grade _minGrade) {
        minGrade = _minGrade;
    }

    public void setProffesor(Professor _professor) {
        professor = _professor;
    }

    public void setYear(int _year) {
        year = _year;
    }

    public void setStudents(Vector<Student> _students) {
        students = _students;
    }
}