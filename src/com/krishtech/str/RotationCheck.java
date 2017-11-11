package com.krishtech.str;

/**
 *  check the string has rotation.
 *  
 * @author jpkrishna
 *
 */
public class RotationCheck {
	
	public static boolean isRotation(String s1, String s2) {
		int len = s1.length();
		// both string has same length and not null
		if(len == s2.length() && len > 0) {
			String s1s1 = s1 + s1;
			return s1s1.indexOf(s2) > 0 ? true : false;
		}

		return false;
	}
	
	public static void main(String []args) {
		System.out.println("Is rotate string :" + isRotation("efabcd", "ef"));
	}
}
