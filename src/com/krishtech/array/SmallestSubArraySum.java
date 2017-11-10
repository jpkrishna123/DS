package com.krishtech.array;

/**
 *  Smallest subarray sum greater than a given value (X)

 * @author jpkrishna
 *
 */
public class SmallestSubArraySum {

	private static int smallestSubArraySum(int arr[], int x) {
		if(arr == null || arr.length == 0) return 0;
		
		int min = arr.length +1, currSum = 0;
		int start = 0, end = 0;
		
		while(end < arr.length) {
			// add array value to current sum upto X
			while(currSum <= x && end < arr.length) {
				currSum += arr[end++];
			}
			
			// reduce array value to current sum upto X
			while(currSum >= x && start < arr.length) {
				// update  min sum
				if(end - start < min) {
					min = end - start;
				}
				currSum -= arr[start++];
			}
		}
		
		return min;
		
		
	}
	public static void main(String []args) {
		int arr[] = {3, 5, 1, 7, 10, 2, 8};
		int count = smallestSubArraySum(arr, 15);
		System.out.println("Sub Array Elements Count : " + count);
	}
}
