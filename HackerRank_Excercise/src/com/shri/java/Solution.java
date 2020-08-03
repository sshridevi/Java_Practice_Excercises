package com.shri.java;

import java.util.List;
import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
		int x=2 ;
		List<Integer> space= new ArrayList<Integer>();
		
		space.add(1);
		space.add(2);
		space.add(3);
		space.add(1);
		space.add(2);
		
		if(x==0 || x>=space.size()) {
			System.out.println("Incorrect value for x, exiting program ..");
			System.exit(0);
		}

		int max = 0;
		for(int i=0;i<space.size()-(x-1);i++) {
			int min=0;
			for(int j=i;j<i+x;j++) {
				if(j==i) {

					min = space.get(j).intValue();
				} else {
					ArrayList<Integer> subSpace= new ArrayList<Integer>(space.subList(i, j+1));
					System.out.println(subSpace);
					int temp = space.get(j).intValue();
					if(temp < min) {
						min = temp;
					}					
				}
			}
			if(max < min) {
				max=min;
			}
			System.out.println("Min = "+ min);		
		}
		
		System.out.println("Max = " + max);
		
		
	}

}
