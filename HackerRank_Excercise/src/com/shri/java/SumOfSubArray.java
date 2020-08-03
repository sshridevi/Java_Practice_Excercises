package com.shri.java;

import java.util.Arrays;

public class SumOfSubArray {

	public static void main(String[] args) {
		
		// Test Case
		int[] A = {1, 2, 3, 4,5,6,7,8,9,10};
		int S=15;
		
		SumOfSubArray s = new SumOfSubArray();
		s.subArrayPositions(A,S);		

	}
	
	private void subArrayPositions(int A[], int S) {
		int cur_sum=0;
		
		int i=0;
		int j=0;
		for(i=0;i < A.length;i++) {
			cur_sum=0;
			for(j=i;j < A.length;j++)
			{
				cur_sum = cur_sum + A[j];
				
				if(cur_sum >= S)
				{
					break;
				}
			} // end of inner for loop
			
			if(cur_sum == S) {
				System.out.println("Original Array = " + Arrays.toString(A));
				System.out.println("1st Position=" + (i+1) + "\t Second Position = " + (j+1));
				int start =i+1;
				int end=j+1;
				int[] subA= new int[end];
				
				for(int m =start ; m<end;m++)
				{
					subA[m]=A[m];
					
				}
				System.out.println("sub array that equals sum:  " + Arrays.toString(subA));
				
			}
			
		}
		
		
	}

}
