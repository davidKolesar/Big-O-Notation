package com.mycompany.constant;

import java.util.Random;

public class Constant {

	public void initConstantExample() {
		Random rand = new Random();

		int randomArraySize = rand.nextInt((99999999 - 0) + 1) + 0;
		int[] randomArray = new int[randomArraySize];
		constantExample(randomArray);
	}

	private void constantExample(int[] randomArray) {
		System.out.println("The array has " + randomArray.length + " elements."); 
	}
	
}
