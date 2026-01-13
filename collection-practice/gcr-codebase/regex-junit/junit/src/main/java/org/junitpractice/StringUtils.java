package org.junitpractice;

public class StringUtils {
	public String reverseString(String str) {
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		return sb.reverse().toString();
	}
	public boolean isPalindrom(String str) {
		for(int i = 0;i<str.length()/2;i++) {
			if(str.charAt(i) != str.charAt(str.length()-1 - i)) {
				return false;
			}
		}
		return true;
	}
	public String toUpperCase(String str) {
		return str.toUpperCase();
	}
}
