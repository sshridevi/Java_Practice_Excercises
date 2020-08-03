/**
 * 
 */
package com.shri.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shashrik-Laptop
 *
 */
public class PermDistinctStrings {

	static List<String> prevAns = new ArrayList<String>();
	/**
	 * 
	 */
	public PermDistinctStrings() {
		// TODO Auto-generated constructor stub
	}

	static void printPermutn(String str, String ans, String tab)
	{
		tab += "\t";
		if(str.length()==0)
		{	
			if(!prevAns.contains(ans)) {
				prevAns.add(ans);
				System.out.println(tab + "-----------------------");
				System.out.println(tab + "Premutation = " + ans);
				System.out.println(tab + "-----------------------");
				return; 				
			}
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
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="abb";
		System.out.println("printPerm(\"" + s + "\","+"\" \")");
		printPermutn(s, "", "");      

	}

}
