package main;

import logic.SortData;
import ui.UI;

import logic.InputData;

public class Main {
	public static void main(String [] args){
		new InputData();
		
		SortData sorts= new SortData();
		UI ui = new UI();
		ui.show(sorts.sortingByName("IT"));	
	
	}
	
}
