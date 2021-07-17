package com.shubham;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CodeCoverageApplicationTests {

	Palindrome palindrome = new Palindrome();
	
	@Test
	void isNotPalindromeTest() {
		assertEquals(false, palindrome.isPalindrome("abc"));
	}
	
	@Test
	void isPalindromeTest() {
		assertEquals(true, palindrome.isPalindrome("mam"));
	}
	

}
