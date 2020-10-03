package com.mycompany.controller;

import com.mycompany.binarySearch.BinarySearch;
import com.mycompany.consoleIO.ConsoleIO;
import com.mycompany.constant.Constant;

public class BigOController {

	ConsoleIO consoleIO = new ConsoleIO();
	BinarySearch binarySearch = new BinarySearch();
	Constant constant = new Constant();
	
	public void init() {
		boolean isInputValid= false;
		int userSelection = 0;

		
		consoleIO.printASCIIArt("Big O Notation");
		System.out.println("Programmed by David Kolesar");
		System.out.println("October 2020");
		System.out.println("");

		
		while (isInputValid== false) {
			isInputValid = consoleIO.pressEnterToContinue();
		} 
				
		while (isInputValid == true) { 
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("1. Program explanation");
		System.out.println("2. Constant Time Algorithms -- O(1)");
		System.out.println("3. Logarithmic Time Algorithm [Binary Search Demonstration] -- O(log (m+n))");
		
		userSelection = consoleIO.getInt("Please make input a selection: ");

		String programResponse = "";
		
	        switch (userSelection ) { 

	        case 1: 
	            printProgramExplanation();
	            break;
	        case 2:
	        	constant.initConstantExample();
	        	break;
	        case 3: 
	        	binarySearch.conductBinarySearch();
	            break; 
	        default: 
	        	programResponse = "You have made an invalid selection. Please input a number that corresponds to an option and press return"; 
	        	break; 
	        } 
	        System.out.println(programResponse); 
	    }
	}
	
	private void printProgramExplanation() {
		// TODO Auto-generated method stub
	} 
	
}
