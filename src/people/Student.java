package people;

import temples.People;

public class Student extends People{

	private int birthday;
	private String facultet;
	private String course;
	private String group;
	
	public Student(String secondName, String firstName, String lastName, int number, int adress , int birthday , String facultet , String course, String group) {
		super(secondName, firstName, lastName, number, adress);
		this.birthday = birthday;
		this.facultet = facultet;
		this.course = course;
		this.group = group;
		}

public void setBirthday(int birthday) {
	this.birthday = birthday;
}
public void setFacultet(String facultet) {
	this.facultet = facultet;
}
public void setCourse(String course) {
	this.course = course;
}
public void setGroup(String group) {
	this.group = group;
}
public int getBirthday() {
	return birthday;
}
public String getFacultet() {
	return facultet;
}
public String getCourse() {
	return course;
}
public String getGroup() {
	return group;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return getFirstName();
}
}
