package entities;

import java.util.*;


public class School {
	//constructors
	public School (String _name) {
		name = _name;
	};
	public School(String _name, ArrayList<String> _houseNames, ArrayList<String> _courseNames,ArrayList<Integer> _years, Vector<String> _studentNames, Vector<String> _professorNames) {
		name = _name;
		houseNames= _houseNames;
		courseNames = _courseNames;
		years = _years;
		studentNames = _studentNames;
		professorNames = _professorNames;
	}
	//attributes
	private String name;
	private int numOfStudents;
	private boolean housed;
	private ArrayList<String> houseNames;
	private Vector<String> studentNames;
	private Vector<String> professorNames;
	private ArrayList<String> courseNames;
	private ArrayList<Integer> years;
	//getters
	public String getName() { return name; };
	public int getNumOfStudents() { return numOfStudents; };
	public boolean getHoused() { return housed; };
	public ArrayList<String> getHouseNames () {return houseNames; };
	public Vector<String> getStudentNames () { return studentNames; };
	public Vector<String> getProfessorNames () { return professorNames; };
	public ArrayList<String> getCourseNames () {return courseNames; };
	public ArrayList<Integer> getYears () {return years; };
	//setters
	public void setName (String _name) { name = _name; };
	public void setNumOfStudents (int _numOfStudents) { numOfStudents = _numOfStudents; };
	public void setHoused (boolean _housed) { housed = _housed; };
	public void setHouseNames (ArrayList<String> _houseNames) { houseNames = _houseNames; };
	public void setStudentNames (Vector<String> _studentNames) { studentNames = _studentNames; };
	public void setProfessorNames (Vector<String> _professorNames) { professorNames = _professorNames; };
	public void setCourseNames (ArrayList<String> _courseNames) { courseNames = _courseNames; };
	public void setYears (ArrayList<Integer> _years) { years = _years; };
}