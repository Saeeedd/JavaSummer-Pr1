package entitiesService;

import entities.*;

import java.util.*;

public class SchoolService {
    //constructor
    public SchoolService(School _school) {
        school = _school;
    }

    //attributes
    private School school;

    private Vector<School> allSchools;

    //getters
    public School getSchool() {
        return school;
    }

    public Vector<School> getAllSchools() {
        return allSchools;
    }

    //setter
    public void setSchool(School _school) {
        school = _school;
    }

    public void setAllSchools(Vector<School> _allSchools) {
        allSchools = _allSchools;
    }

    //methods
     public void getData(String fileName) {

     }

     public void setData() {

     }
}
