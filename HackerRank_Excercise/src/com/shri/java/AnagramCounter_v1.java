//Not completed
//I did not do any changes
package com.shri.java;

import java.util.HashMap;
import java.util.Set;
public class AnagramCounter {
		static void anagramCheck(String str1, String str2) {
			
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		
		HashMap<Character, Integer> mapone=anagramCount(c1);
		HashMap<Character, Integer> maptwo=anagramCount(c2);
		
		System.out.println(countChar);
		Set<Character> s =countChar.keySet();
		int sum=0;
		for(char char3:s)
		{
			if(countChar.get(char3)==1)
				sum+=countChar.get(char3);
			else {
			    sum=sum+countChar.get(char3)%2;
			}
		}
		System.out.println(sum);

		public static HashMap<Character,Integer> anagramCount(char[] c)	
		{
			HashMap<Character,Integer> countChar = new HashMap<Character,Integer>();
			for(char char1 : c) 
			if(countChar.containsKey(char1))
		{
			countChar.put(char1,countChar.get(char1)+1);
		}else
	
		{
				countChar.put(char1,1);		
		}

		}
		 


	}

	public static void main(String[] args) {
		String str1="abccda", str2="abcdd";
		System.out.println(str1);
		System.out.println(str2);
	
		anagramCheck(str1, str2);
		
		
	}

}
