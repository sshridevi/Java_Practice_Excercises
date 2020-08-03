package com.shri.java;

public class IsAnagram {
	
	public static boolean isAnagram(String s1,String s2)
	{
	
	if(s1.length()!=s2.length())
	{
		return false;
	}
	s1 =s1.replaceAll("\\s","").toLowerCase();
	s2 =s2.replaceAll("\\s","").toLowerCase();
	
	char[] c1 =s1.toCharArray();
	for(char c: c1)
		
	{
		System.out.println(c);
		int index=s2.indexOf(c);
		System.out.println(index);
		if(index==-1)
		{
			return false;
		}
		s2=s2.substring(0,index)+s2.substring(index+1,s2.length());
		System.out.println(s2);
		
	}
	return true;
	
	}

	public static void main(String[] args) {
		String s1="keep"; String s2="peekk";
		boolean result = isAnagram(s1,s2);
		System.out.println(result);
		
	}

}
