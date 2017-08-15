package entitiesService;

import entities.*;

public class CourseService {
    //constructor
    public CourseService(Course _course) {
        course = _course;
    }

    //attributes
    private Course course;

    //getters
    public Course getCourse() {
        return course;
    }

    //setter
    public void setCourse(Course _course) {
        course = _course;
    }
}
