package com.shri.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyCollectionIterator {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		myList.add("red");
		myList.add("blue");
		myList.add("yello");
		myList.add("green");
		System.out.println(myList);
		List<String> myList2 = new ArrayList<String>();
		for(int i=0;i<myList.size()-1;i++)
		{
			
			myList2.addAll(myList.subList(i, i+2));
			
		}
		System.out.println("myList2 " + myList2);
		ListIterator<String> itr = myList.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
				
					while(itr.hasPrevious())
					{
						System.out.println(itr.previous());
					}
					
					
				

}

}