package com.shri.java;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

	public static void main(String[] args) {
		int x=4 ;
	
		List<Integer> space= new ArrayList<Integer>();
		
		space.add(1);
		space.add(2);
		space.add(3);
		space.add(1);
		space.add(2);
		for(int i=0;i<=space.size()-x;i++)
			
		{
				List<Integer> subSpace= space.subList(i, i+1);
				 int num1 =subSpace.get(i);
				 int num2 =subSpace.get(i+1);
				 System.out.printf("%f,%f",num1,num2);
				 
				
				/*for(int j=0;j<subSpace.size();j++)
				{ int minima=0;
				if(subSpace.get(j).intValue()< subSpace.get((j+1).intValue())
				{
					 minima=subSpace.get(j);
				}
				else
					minima=subSpace.get(j+1);
				
				}*/

	}

}
}
