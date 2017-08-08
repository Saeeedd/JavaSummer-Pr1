package entities;

import java.util.Date;
import java.util.Vector;

public class Student extends Person {
    public Student(String _name, House _house, BloodStatus _bloodStatus, School _school, Date _birthday, Vector <Course> _courses, Vector<FinishedCourse> _reportCard ) {
        super();
        Person(String _name, House _house, BloodStatus _bloodStatus, School _school, Date _birthday);


    }
}
