package com.krishtech.str;

/**
 * convert the given string to int value
 * 
 * @author jpkrishna
 *
 */
public class StringToInt {
	private static int convertToInt(String str) {
		if(str == null || str.isEmpty()) return 0;
		boolean isNegative = str.charAt(0) == '-' ? true : false;
		
		int v = 0;
		for(int i = isNegative ? 1 : 0; i < str.length(); i++) {
			v = (v * 10)  + str.charAt(i) - '0';
		}
		
		if(isNegative) {
			v = v * -1;
		}
		return v;
	}
	
	public static void main(String []args) {
		System.out.println("Converted to Int :" + convertToInt("234556"));
	}
}
