package com.krishtech.array;

/**
 * Largest sum subarray with at least k items/numbers

 * @author jpkrishna
 *
 */
public class LarestSumSubArray {
	
	private static int maxSumWithK(int []arr, int k) {
		int maxSum[] = new int[arr.length];
		maxSum[0] = arr[0];
		int result = 0, currMax = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			currMax = Math.max(arr[i], currMax+arr[i]);
			maxSum[i] = currMax;
		}
		
		int sum = 0;
		for(int i = 0; i < k; i++) {
			sum += arr[i];
		}
		result = sum;
		for(int i = k; i < arr.length; i++) {
			sum = sum + arr[i] - arr[i-k];
			result = Math.max(sum, result);
			result = Math.max(result, sum + maxSum[i-k]);
		}
		return result;
	}
	
	public static void main(String []args) {
		int arr[] = {3, 5, 1, 7, 10, 2, 8};
		int count = maxSumWithK(arr, 3);
		System.out.println("Largest sum subarray : " + count);
	}
}
