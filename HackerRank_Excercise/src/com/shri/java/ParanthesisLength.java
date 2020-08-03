package com.shri.java;

public class ParanthesisLength {

	public ParanthesisLength() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Test Case
		String s1 = "((()";
		// String s1 = ")()())";
		// String s1 = ")()())()()()((";

		int i=0;
		int start=0;
		int end = 0;
		boolean leftParanthesis = false;
		
		for(i=0; i<s1.length(); i++) {
			if(leftParanthesis == false ) {
				if(s1.charAt(i) == '(') {
					start = i;
					leftParanthesis = true;					
				}
			}
			if(leftParanthesis == true) {
				if(s1.charAt(i) == ')') {
					end = i;
				} else {
					start = i;
				}
				
			}			
		}
		
		System.out.println(end + "\t" + start + "\t" + ((end - start)+1));
		
	}

}
