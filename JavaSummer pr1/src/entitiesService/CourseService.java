package entitiesService;

import entities.*;

import java.util.Vector;

import java.io.*;

public class CourseService {
    //constructor
    public CourseService(Course _course) {
        course = _course;
    }

    public CourseService(){ course = null; }

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
        fileName = "CourseDB.txt";

        BufferedReader br = null;
        FileReader fr = null;

        try {

            //br = new BufferedReader(new FileReader(FILENAME));
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);

            String sCurrentLine ="1";

            while (sCurrentLine  != "*") {
                String name = br.readLine();

                String minGrade = br.readLine();
                String prName = br.readLine();
                int year = Integer.parseInt(br.readLine());
                int numOfStudents = Integer.parseInt(br.readLine());
                System.out.println(numOfStudents);
                Course tempCourse = new Course(name, new Professor(prName), Grade.returnGrade(minGrade), year);
                for(int i = 0; i < numOfStudents; i++) {
                    System.out.println(name);
                    tempCourse.addStudent(new Student(br.readLine()));
                }
                course = tempCourse;
                sCurrentLine = br.readLine();
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }
    }

    public void setData() {

    }

}
