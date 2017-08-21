package entitiesService;

import entities.*;

import java.util.Vector;

public class CourseService {
    //constructor
    public CourseService(Course _course) {
        course = _course;
    }

    //attributes
    private Course course;
    private Vector<Course> allCourses;
    //getters
    public Course getCourse() {
        return course;
    }

    public Vector<Course> getAllCourses() {
        return allCourses;
    }

    //setter
    public void setCourse(Course _course) {
        course = _course;
    }

    public void setAllCourses(Vector<Course> _allCourses) {
        allCourses = _allCourses;
    }

    //methods

    public void getData(String fileName) {

    }

    public void setData() {

    }

}
