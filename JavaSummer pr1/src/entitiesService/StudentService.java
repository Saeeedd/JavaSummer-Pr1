package entitiesService;

import entities.*;
import java.util.*;

public class StudentService {
    //constructor
    public StudentService(Student _student) {
        student = _student;
    }

    //attributes
    private Student student;

    private Vector<Student> allStudents;

    //getters
    public Student getStudent() {
        return student;
    }

    public Vector<Student> getAllStudents() {
        return allStudents;
    }

    //setter
    public void setStudent(Student _student) {
        student = _student;
    }

    public void setAllStudents(Vector<Student> _allStudents) {
        allStudents = _allStudents;
    }

    //methods
    public void getData(String fileName) {

    }

    public void setData() {

    }
}