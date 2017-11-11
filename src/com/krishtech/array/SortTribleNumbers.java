package com.krishtech.array;

/**
 * 	sort triple no (0, 1, 2) array should be O(n).
 * 
 * @author jpkrishna
 *
 */
public class SortTribleNumbers {
	private static void sortTribles(int arr[]) {
		int l = 0, m = 0, r = arr.length -1;
		
		while(m < r) {
			if(arr[m] == 0) {
				int temp  = arr[m];
				arr[m] = arr[l];
				arr[l] = temp;
				l++;
				m++;
			}else if(arr[m] == 1) {
				m++;
			}else {
				int temp  = arr[m];
				arr[m] = arr[r];
				arr[r] = temp;
				r--;
			}
		}
	}
	
	public static void main(String []args) {
		int arr[] = {2, 0, 1, 1, 2, 0, 2};
		sortTribles(arr);
		for(int v : arr) {
			System.out.print(v);
		}
		
	}
}
