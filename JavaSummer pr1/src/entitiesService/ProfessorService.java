package entitiesService;
import entities.*;
import java.util.*;

public class ProfessorService {
    //constructor
    public ProfessorService(Professor _Professor) {
        Professor = _Professor;
    }

    //attributes
    private Professor Professor;
    private Vector<Professor> allProfessors;

    //getters
    public Professor getProfessor() {
        return Professor;
    }

    public Vector<Professor> getAllProfessors() {
        return allProfessors;
    }

    //setters
    public void setProfessor(Professor _Professor) {
        Professor = _Professor;
    }

    public void setAllProfessors(Vector<Professor> _allProfessors) {
        allProfessors = _allProfessors;
    }

    //methods
    public void getData(String fileName) {

    }

    public void setData() {

    }
}
