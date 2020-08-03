package com.shri.java;

public class MakingAnagram {
	public static int Number_Letters=26;
	
	public static int getDelta(int[] array1, int[] array2)
	
	{
		if(array1.length !=array2.length)
		{
			return -1;
		}
		int delta =0;
		for(int i =0;i<array1.length;i++)
		{
			
			int difference = Math.abs(array1[i]-array2[i]);
			delta+=difference;
		}
		return delta;
	}
	
	public static int[] getCharCount(String s) {
	int[] charCounts=new int[Number_Letters];
	
	for(int i =0; i<s.length();i++)
	{	char ch = s.charAt(i);
		//int offset = (int)'a';
		int code = ch -(int)'a';
		//System.out.println("code:"+ code);
		charCounts[code]++;
	}
	
	for(int k=0; k<charCounts.length; k++) {
		System.out.println("charCounts["+k+"] = " + charCounts[k]);
	}
	System.out.println();
		return charCounts;
	}

	public static int numberNeeded(String first, String second)
	{
		int[] charCount1= getCharCount(first);
		int[] charCount2= getCharCount(second);
		return getDelta(charCount1, charCount2);
	}
	
	
	public static void main(String[] args) {
		String str1 ="bbcdcgni" ;
		String str2 ="ccdefsesr" ;
		
		
		int result=numberNeeded(str1, str2);
		System.out.println(result);
	}

}
