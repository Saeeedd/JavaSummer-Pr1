package entities;

import java.util.*;


public class School {
	//constructors
	public School (String _name) {
		name = _name;
	};
	public School(String _name,String _location, ArrayList<House> _houses, ArrayList<Course> _courses,ArrayList<Integer> _years, Vector<Student> _students, Vector<Professor> _professors) {
		name = _name;
		houses= _houses;
		courses = _courses;
		years = _years;
		students= _students;
		professors = _professors;
		location = _location;
	}
	//attributes
	private String name;
	private int numOfStudents;
	private boolean housed;
	private ArrayList<House> houses;
	private Vector<Student> students;
	private Vector<Professor> professors;
	private ArrayList<Course> courses;
	private ArrayList<Integer> years;
	private String location;
	//getters
	public String getName() { return name; };
	public int getNumOfStudents() { return numOfStudents; };
	public boolean getHoused() { return housed; };
	public ArrayList<House> getHouseNames () {return houses; };
	public Vector<Student> getStudentNames () { return students; };
	public Vector<Professor> getProfessorNames () { return professors; };
	public ArrayList<Course> getCourseNames () {return courses; };
	public ArrayList<Integer> getYears () {return years; };
	public String getLocation () { return location; };
	//setters
	public void setName (String _name) { name = _name; };
	public void setNumOfStudents (int _numOfStudents) { numOfStudents = _numOfStudents; };
	public void setHoused (boolean _housed) { housed = _housed; };
	public void setHouseNames (ArrayList<House> _houses) { houses = _houses; };
	public void setStudentNames (Vector<Student> _students) { students = _students; };
	public void setProfessorNames (Vector<Professor> _professors) { professors = _professors; };
	public void setCourseNames (ArrayList<Course> _courses) { courses = _courses; };
	public void setYears (ArrayList<Integer> _years) { years = _years; };
	public void setLocation (String _location) { location = _location; };
}