package com.shri.java;

public class LongIndex {

	public static void main(String[] args) {
		int[] A ={34,8, 10, 3, 2, 80, 30, 33, 1};
		int i=0;
		int j=0;
		int diff=0;
		int idiff=0;
		int jdiff=0;
		for( i=0;i<A.length-1;i++)
		{
			for( j=A.length-1;j>=0;j--)
			{
				if(A[i] <= A[j])
				{
					// System.out.println(i + "\t" + j + "\t" + (j-i));
					if (diff < (j-i)) {
						diff = (j-i);
						idiff = i;
						jdiff=j;
					}
					break;
				}
				
			}
		}
		System.out.println(idiff + "\t" + jdiff + "\tMax Diff = " + diff);

	}

}
