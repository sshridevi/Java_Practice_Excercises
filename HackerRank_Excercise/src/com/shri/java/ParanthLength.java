package com.shri.java;

import java.util.Stack;

public class ParanthLength {

	public static void main(String[] args) {
	String str =")()())";
	int n = str.length();
	Stack<Integer> stk = new Stack<Integer>();
	stk.push(-1);
	int results=0;
	
	for(int i=0;i<n;i++)
	{
		if(str.charAt(i)=='(')
		{
			stk.push(i);
		}else
		{
			stk.pop();
			if(!stk.isEmpty())
			{
				results=Math.max(results, i-stk.pop());
			}else
			{
				stk.push(i);
			}
		}
		System.out.println(results);
	}
	}

}
