package entities;

import java.util.*;

public class Course {
	//constructor
	public Course(String _name, String _professorName, char _minGrade, int _year) {
		name = _name;
		minGrade = _minGrade;
		professorName = _professorName;
		year = _year;
	};
	public Course(String _name) {
		name = _name;
	};
	//attributes
	private String name;
	private char minGrade;
	private String professorName;
	private int year;
	private Vector<String> studentNames;
	//getters
	public String getName() { return name; };
	public char getMinGrade() { return minGrade; };
	public String getProfessorName() { return professorName; };
	public int getYear() { return year; };
	public Vector<String> getStudentNames() { return studentNames; };
	//setters
	public void setName(String _name) { name = _name; };
	public void setMinGrade(char _minGrade) { minGrade = _minGrade; };
	public void setProffesorName(String _professorName) { professorName = _professorName; };
	public void setYear(int _year) { year = _year; };
	public void setStudentNames(Vector<String> _studentNames) { studentNames = _studentNames; };
}