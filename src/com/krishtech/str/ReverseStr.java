package com.krishtech.str;

/**
 * Reverse the words 
 * 
 * @author jpkrishna
 *
 */

public class ReverseStr {

	private static void reverseWords(char []chars) {
		int start = 0, end = chars.length;
		reverse(chars, start, end);
		while((end = find(chars, ' ', start)) != -1) {
			reverse(chars, start, end);
			start = end + 1;
		}
		
		reverse(chars, start, chars.length);
	}
	
 private static void reverse(char []chars, int start, int end) {
	 if(start >= end) return;
	 
	 int last = end - 1;
	 for(int i = start; i <= start + (last - start) / 2; i++) {
		 char temp = chars[i];
		 chars[i] = chars[last - i + start];
		 chars[last - i + start] = temp;
	 }
 }
 
 private static int find(char []chars, char c, int start) {
	 for(int i = start; i < chars.length; i++) {
		 if(chars[i] == c) {
			 return i;
		 }
	 }
	 
	 return -1;
 }
	
	
	public static void main(String []args) {
		String str = "my name is boss";
		char []chars = str.toCharArray();
		reverseWords(chars);
		System.out.println(chars);
	}
}
