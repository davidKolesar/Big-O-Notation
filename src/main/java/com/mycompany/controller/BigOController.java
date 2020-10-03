package com.mycompany.controller;

import com.mycompany.binarySearch.BinarySearch;
import com.mycompany.consoleIO.ConsoleIO;

public class BigOController {

	ConsoleIO consoleIO = new ConsoleIO();
	BinarySearch binarySearch = new BinarySearch();
	
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
		System.out.println("2. Big O Binary Search Demonstration -- O(log (m+n))");
		
		userSelection = consoleIO.getInt("Please make input a selection: ");

		String programResponse = "";
		
	        switch (userSelection ) { 

	        case 1: 
	            printProgramExplanation();
	            break; 
	        case 2: 
	        	binarySearch.conductBinarySearch();
	            break; 
	        default: 
	        	programResponse = "You have made an invalid selection. Please input a number and press return"; 
	        	break; 
	        } 
	        System.out.println(programResponse); 
	    }
	}
	
	private void printProgramExplanation() {
		// TODO Auto-generated method stub
		
	} 
	
}
