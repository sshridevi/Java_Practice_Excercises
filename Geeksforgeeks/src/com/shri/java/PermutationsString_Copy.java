package com.shri.java;

import java.util.LinkedList;

public class PermutationsString_Copy {
	//static LinkedList<String> prevAns = new LinkedList<String>();
	
	static void printPermutn(String str, String ans)
	{
		if(str.length()==0)			
		{
				
				//prevAns.add(ans);
				System.out.println(ans);
				return ;
			
		}
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			String ros = str.substring(0,i)+str.substring(i+1);
			printPermutn(ros,ans+ch);
			
		}

	}

	public static void main(String[] args) {
		String str="JSP";
		printPermutn(str,"");

	}

}
