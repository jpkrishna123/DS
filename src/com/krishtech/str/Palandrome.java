package com.krishtech.str;

/**
 * this program will check the string is palandrome
 * 
 * @author jpkrishna
 *
 */
public class Palandrome {
	private static boolean isPalndrome(String str) {
		
		if(str == null || str.isEmpty()) return false;
		
		int l = 0, r = str.length() - 1;
		while(l < r) {
			if(str.charAt(l) != str.charAt(r)) {
				return false;
			}
			
			l++;
			r--;
		}
		return true;
	}
	
	public static void main(String []args) {
		System.out.println("Is Palandrome : " + isPalndrome("abdda"));
	}
}
