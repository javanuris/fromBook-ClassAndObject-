package data;

import java.util.ArrayList;

import people.Student;

public class PeopleDataHolder {
	
	private static ArrayList<Student> peoples = new ArrayList<>();
	
	public static void addPeopleList(Student people){
		peoples.add(people);
	}
	
	public static ArrayList<Student> getListPeople(){
		return peoples;
	}
}
