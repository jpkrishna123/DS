package com.krishtech.array;

import java.util.Arrays;

/**
 * count the no of pair difference equal to the given k value.
 * 
 * @author jpkrishna
 *
 */
public class CountPairDifference {
	
	private static int countPairDiff(int []arr, int k) {
		int count = 0;
		
		if(arr == null || arr.length == 0) return 0;
		Arrays.sort(arr);
		
		int l = 0, r = 1;
		while(r < arr.length) {
			if((arr[r] - arr[l]) == k) {
				count++;
				l++;
				r++;
			}else if((arr[r] - arr[l]) < k) {
				r++;
			}else {
				l++;
			}
		}
		
		
		return count;
	}
	
	public static void main(String []args) {
		int arr[] = {3, 5, 1, 7, 10, 2, 8};
		int count = countPairDiff(arr, 5);
		System.out.println("No of pairs : " + count);
	}

}
