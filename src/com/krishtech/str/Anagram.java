package com.krishtech.str;

import java.util.HashMap;
import java.util.Map;

/** check both strings are anagram 
 * 
 * @author jpkrishna
 *
 */
public class Anagram {
	
	public static boolean isAnagram(String srcStr, String vStr) throws Exception {
		if(srcStr == null || srcStr == null || srcStr.equals("") 
				|| vStr.equals("") || srcStr.length() != vStr.length())
			return false;
		
		// here populate chars and count
		Map<Character, Integer> charMap = new HashMap<>();
		for(int i = 0; i < srcStr.length(); i++) {
			char c = srcStr.charAt(i);
			if(!charMap.containsKey(c)) {
				charMap.put(c, 1);
			}else {
				int count = charMap.get(c);
				charMap.put(c, ++count);
			}
			
		}
		
		for(int i = 0; i < vStr.length(); i++) {
			char c = vStr.charAt(i);
			if(!charMap.containsKey(c)) 
				return false;
		
			int count = charMap.get(c);
			if(count == 0) return false;
			
			charMap.put(c, --count);
		}
		
		;
		
		for(int v : charMap.values()) {
			if(v > 0) return false;
		}
		
		return true;
	}
	
	public static void main(String []args) throws Exception {
		boolean isAngram = isAnagram("abc", "bac");
		System.out.println(isAngram);
	}
}
