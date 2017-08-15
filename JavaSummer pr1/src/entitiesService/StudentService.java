package entitiesService;

import entities.*;

public class StudentService {
    //constructor
    public StudentService(Student _student) {
        student = _student;
    }

    //attributes
    private Student student;

    //getters
    public Student getStudent() {
        return student;
    }

    //setter
    public void setStudent(Student _student) {
        student = _student;
    }
}