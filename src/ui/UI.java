package ui;

import java.util.ArrayList;

import people.Student;

public class UI {
	
	public void show(ArrayList<Student> students){
		for(Student c : students){
			System.out.println(c.getFirstName());
		}
		
	}

}
