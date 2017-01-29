package logic;

import java.util.ArrayList;

import data.PeopleDataHolder;
import people.Student;


public class SortData {

ArrayList<Student> students ;
	public SortData(){
		students = PeopleDataHolder.getListPeople();
	}

	public ArrayList<Student> sortingByName(String facul){
		ArrayList<Student> studyArr = new ArrayList<>();
       for(Student c : students){
	      if(c.getFacultet().equals(facul)){
	    	  studyArr.add(c);
		}
	}
       return studyArr;
	}
}

