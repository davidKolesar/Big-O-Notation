package com.mycompany.binarySearch;

import java.util.Arrays;
import java.util.Random;

import org.apache.commons.lang3.ArrayUtils;

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
		// both are null
		if (nums1 == null && nums2 == null) {
			System.out.println("Both arrays were null.");
			return 0;
		}

		// First array is null
		if (nums1 == null && nums2 != null) {
			if (nums2.length > 1) {
				System.out.println("First array is null, second array has more than one element.");
				// return median of second array
				return (nums2[0] - nums2[nums2.length - 1]) / 2;
			}
			System.out.println("First array is null, second array has one element.");
			return nums2[0];
		}

		// Second array is null
		if (nums2 == null && nums1 != null) {
			if (nums1.length > 1) {
				System.out.println("Second array is null, first array has more than one element.");
				// return median of second array
				return (nums1[0] - nums1[nums1.length - 1]) / 2;
			}
			System.out.println("Second array is null, first array has one element.");
			return nums1[0];
		}
		return 0;
	}

	/**
	 * @param firstArrayToDivide
	 * @param secondArrayToDivide
	 */
	public void combineArray(int[] firstArrayToDivide, int[] secondArrayToDivide) {

		// copy first half of first array
		int middleNumberOfFirstArray = (firstArrayToDivide.length / 2);
		int[] firstHalf = Arrays.copyOfRange(firstArrayToDivide, 0, middleNumberOfFirstArray);

		// copy second half of second array
		int middleNumberOfSecondArray = (secondArrayToDivide.length / 2);
		int[] secondHalf = Arrays.copyOfRange(secondArrayToDivide, middleNumberOfSecondArray, secondArrayToDivide.length);

		//Simply put, the algorithm compares the key value with the middle element of the array; 
		//if they are unequal, 
		//the half in which the key cannot be part of is eliminated, 
		//and the search continues for the remaining half until it succeeds.
		
		
		//do we need to combine these? 
		int[] both = ArrayUtils.addAll(firstHalf, secondHalf);

	}
}

