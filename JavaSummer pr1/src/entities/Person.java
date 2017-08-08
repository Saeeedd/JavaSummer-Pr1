package entities;

import java.util.*;

public class Person {
	//constructors
	public Person(String _name, House _house, BloodStatus _bloodStatus, School _school, Date _birthday) {
		name = _name;
		house = _house;
		bloodStatus = _bloodStatus;
		school = _school;
		birthday = _birthday;
	}
	public Person(String _name) {
		name = _name;
	}
	//attributes
	private String name;
	private House house;
	private BloodStatus bloodStatus;
	private School school;
	private Date birthday;
	//getters
	public String getName() {return name;};
	public House getHouse() {return house;};
	public BloodStatus getBloodStatus() {return bloodStatus;};
	public School getSchool() {return school;};
	public Date getBirthday() {return birthday;};
	//setters
	public void setName(String _name) {name = _name; };
	public void setHouse(House _house) {house = _house; };
	public void setBloodStatus(BloodStatus _bloodStatus) {bloodStatus = _bloodStatus; };
	public void setSchool(School _school) {school = _school; };
	public void setBirthday(Date _birthday) {birthday = _birthday; };
}