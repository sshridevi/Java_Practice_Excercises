// August 1st
package com.shri.java;

public class PermutationsString {
	
	static void printPermutn(String str, String ans, String tab)
	{
		tab += "\t";
		if(str.length()==0)
		{
			System.out.println(tab + "ans = " + ans);
			return; 
		}
		
		for(int i =0; i<str.length();i++)
		{
			System.out.println(tab + "i = " + i);
			char ch = str.charAt(i);
			String ros = str.substring(0,i)+str.substring(i+1);
			System.out.println(tab + "ros = " + ros + "\tans=" + ans + "\tch= " + ch);
			System.out.println(tab + "printPerm(\"" + ros + "\","+ "\"" + ans+ch + "\")");
			printPermutn(ros, ans+ch, tab);
		}
	}
	

	public static void main(String[] args)
	{
			String s ="abc";
			System.out.println("printPerm(\"" + s + "\","+"\" \")");
			printPermutn(s, "", "");      

	}

}
