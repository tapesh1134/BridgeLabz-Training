package org.junitpractice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringUtilsTest {
	@Test
	void testReverse(){
		StringUtils stringUtils = new StringUtils();
		String result = stringUtils.reverseString("abcd");
		assertEquals("dcba", result);
	}
	
	@Test
	void testIsPalindrom() {
		StringUtils stringUtils = new StringUtils();
		boolean result = stringUtils.isPalindrom("abcdcba");
		assertEquals(true, result);
	}
	
	@Test
	void testToUpperCase() {
		StringUtils stringUtils = new StringUtils();
		String result = stringUtils.toUpperCase("abcd");
		assertEquals("ABCD", result);
	}
}
