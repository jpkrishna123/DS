package com.krishtech.array;

import java.util.Arrays;

/**
 * Find triple zero sum is exist or not
 *  
 * @author jpkrishna
 *
 */
public class TripleZeroSum {
	private static boolean findTripleZeroSum(int []arr) {
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			int l = i+1;
			int r = arr.length-1;
			int x = arr[i];
			
			while(l < r) {
				if(x + arr[i] + arr[i] == 0) {
					return true;
				}else if( + arr[i] + arr[i] < 0) {
					l++;
				}else {
					r++;
				}
			}
		}
		
		return false;
	}
	public static void main(String []args) {
		int arr[] = {3, 5, 1, 7, 10, 2, 8};
		System.out.println("Is Trible Zero Sum Exist : " + findTripleZeroSum(arr));
	}
}
