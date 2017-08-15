package entitiesService;

import entities.*;

public class SchoolService {
    //constructor
    public SchoolService(School _school) {
        school = _school;
    }

    //attributes
    private School school;

    //getters
    public School getSchool() {
        return school;
    }

    //setter
    public void setSchool(School _school) {
        school = _school;
    }
}
