package entities;

import java.util.Date;
import java.util.Vector;

public class Student extends Person {
    public Student(String _name, House _house, BloodStatus _bloodStatus, School _school, Date _birthday, Vector<Course> _courses, Vector<FinishedCourse> _reportCard) {
        super(_name, _house, _bloodStatus, _school, _birthday);
        reportCard = _reportCard;
        courses = _courses;
    }

    public Student(String _name) {
        super(_name, null, null, null, null);
        reportCard = null;
        courses = null;
    }

    //attributes
    private Vector<FinishedCourse> reportCard;
    private Vector<Course> courses;

    //getters
    public Vector<Course> getCourses() {
        return courses;
    }

    public Vector<FinishedCourse> getReportCard() {
        return reportCard;
    }

    //setters
    public void setCourses(Vector<Course> _courses) {
        courses = _courses;
    }

    public void setReportCard(Vector<FinishedCourse> _reportCard) {
        reportCard = _reportCard;
    }

}
