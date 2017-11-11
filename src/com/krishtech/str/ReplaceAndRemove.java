package com.krishtech.str;

/**
 * remove char 'a' and 'd' replace by 2 'b'
 * 
 * @author jpkrishna
 *
 */
public class ReplaceAndRemove {
	
	private static char[] replaceAndRemove(char []chars) {
		int c = 0;
		int writeIdx = 0;
		
		char []s = new char[100];
		for(int i = 0; i < chars.length; i++) {
			if(chars[i] != 'a') {
				s[writeIdx++] = chars[i];
			}
			
			if(chars[i] == 'd') {
				c++;
			}
		}
		
		int currIndex = writeIdx - 1;
		writeIdx = writeIdx + c - 1;

		 while(currIndex >= 0) {
			 if(s[currIndex] == 'd') {
				 s[writeIdx--] = 'b'; 
				 s[writeIdx--] = 'b'; 
			 }
			 currIndex--; 
		 }
		return s;
	}
	public static void main(String []args) {
		String s = "abcd";
		char []chars = s.toCharArray();
		char []sc = replaceAndRemove(chars);
		System.out.println(sc);
	}
}
