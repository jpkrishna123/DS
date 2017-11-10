package com.krishtech.str;

/**
 * convert the given string to int value
 * 
 * @author jpkrishna
 *
 */
public class IntToString {
	
	private static String convertToInt(int v) {
		boolean isNegative = v < 0 ? true : false;
		StringBuffer buffer = new StringBuffer();
		
		do {
			buffer.append((char) ('0' + v%10));
			v = v/10;
		}while (v != 0);
		
		if(isNegative) {
			buffer.append("-");
		}
		return buffer.reverse().toString();
	}
	
	public static void main(String []args) {
		System.out.println("Converted to String :" + convertToInt(234556));
	}
}
