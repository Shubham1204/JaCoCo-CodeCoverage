package com.shubham;

public class Palindrome {

	public boolean isPalindrome(String input) {
		if (input.equalsIgnoreCase(reverseString(input))) {
			return true;
		} else {
			return false;
		}
	}

	public String reverseString(String input) {
		StringBuilder input1 = new StringBuilder();
		 
        input1.append(input);
		return input1.reverse().toString();
	}
}
