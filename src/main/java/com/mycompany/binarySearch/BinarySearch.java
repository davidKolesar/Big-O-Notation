package com.mycompany.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class BinarySearch {

	public void conductBinarySearch() {

		int[] firstArray = generateRandomArray();
		int[] secondArray = generateRandomArray();

		findMedianSortedArrays(firstArray, secondArray);
	}

	/**
	 * 
	 * @return
	 */
	public int[] generateRandomArray() {
		Random rand = new Random();

		int randomArraySize = rand.nextInt((99999999 - 0) + 1) + 0;
		int[] randomArray = new int[randomArraySize];

		for (int i = 0; i < randomArraySize; i++) {
			randomArray[i] = rand.nextInt((9 - 0) + 1) + 0;
		}

        Arrays.sort(randomArray); 
		return randomArray;
	}

	/**
	 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return
	 * the median of the two sorted arrays.
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		boolean isFirstArrayEmpty = false;
		boolean isSecondArrayEmpty = false;
		boolean isFirstArrayEven = false;
		boolean isSecondArrayEven = false;
		int firstArraySize = nums1.length;
		int secondArraySize = nums2.length;
		
		
		//null check
		if(nums1 == null && nums2 == null) {
			System.out.println("Both arrays are null. Returning 0."); 
			return 0;
		}
        
        if(nums1 == null) {
            System.out.println("First array is null."); 
        }
        
        if(nums2 == null) {
            System.out.println("Second array is null."); 
        }
        
        
		
		//check for empty
		if(nums1 == null || nums1.length == 0 ) {
			isFirstArrayEmpty = true;
			System.out.println("First array is empty or null. Finding median of second Array.");
		}

		if(nums2 == null || nums2.length == 0 ) {
			isSecondArrayEmpty = true;
			System.out.println("Second array is empty. Finding median of second Array.");
		}
	
		if(isFirstArrayEmpty && isSecondArrayEmpty ) {
			System.out.println("both arrays are empty. ");
			return 0;
		}
			
		//both are not empty
		isFirstArrayEven = isArrayEven(firstArraySize);
		isSecondArrayEven = isArrayEven(secondArraySize);
		

		//if one is empty, find the median of the other 
		int index = Integer.MAX_VALUE;
				    
				    while (nums1.length <= nums2.length) {
				        int mid = (low + high) / 2;
				        if (sortedArray[mid] < key) {
				            low = mid + 1;
				        } else if (sortedArray[mid] > key) {
				            high = mid - 1;
				        } else if (sortedArray[mid] == key) {
				            index = mid;
				            break;
				        }
				    }
				    return index;
				}
		
		
		
		
		
		
		
		

		//one is even, one is odd	
		if(isFirstArrayEven == true && isSecondArrayEven == false) {

			//the median is the max of the pair to the left of both partitions  
			int firstPartition = firstArraySize / 2;
            System.out.println("first partition is at : " + firstPartition);
            
            int indexToPick = (firstPartition -1);
			System.out.println("The index to the left of the first partition is : " + indexToPick);
            
            int numberToLeftOfFirstPartition = nums1[indexToPick];
            
			if (secondArraySize == 1){ 
				//also satisfies condition where firstPartition == b[0]
				if(numberToLeftOfFirstPartition > nums2[0]) {
					return numberToLeftOfFirstPartition;
				} else {
					return nums2[0];
				}
    		}
        }
        
        if(isFirstArrayEven == false && isSecondArrayEven == true) {
            
            int firstPartition = firstArraySize / 2;
            int indexToTheLeft = (firstPartition -1);
            int numberToLeftOfFirstPartition = nums2[indexToTheLeft];
            
            
			if (secondArraySize == 1){ 
				//also satisfies condition where firstPartition == b[0]
				if(numberToLeftOfFirstPartition > nums1[0]) {
					return numberToLeftOfFirstPartition;
				} else {
					return nums1[0];
				}
    		}
        }
            return 0;
    }
    		//determine if each is odd or even 
		public boolean isArrayEven(int size) {
			if(size % 2 == 0 ) {
				return  true;
			} else {
				return false;
			}
		}	
}