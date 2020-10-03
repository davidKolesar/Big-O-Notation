package com.mycompany.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InitBigO {

	public void init() {
		System.out.println("Constant Time Algorithm – O(1)");
		System.out.println("This is constant and does not depend on size of N");
		
		List<Integer> myList = new ArrayList<>();
		// Creating object of the 
        // class linked list 
        LinkedList<String> ll 
            = new LinkedList<String>(); 
  
        // Adding elements to the linked list 
        ll.add("A"); 
        ll.add("B"); 
        ll.addLast("C"); 
        ll.addFirst("D"); 
        ll.add(2, "E"); 
  
        System.out.println(ll); 
  
        ll.remove("B"); 
        ll.remove(3); 
        ll.removeFirst(); 
        ll.removeLast(); 
  
        System.out.println(ll);
        
		
	}
	
}
