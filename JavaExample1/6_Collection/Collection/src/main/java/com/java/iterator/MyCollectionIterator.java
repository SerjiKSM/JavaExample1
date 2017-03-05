package com.java.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class MyCollectionIterator {
	
	public static void main(String arg[]) {		
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Unix");
		list.add("Oracle");
		list.add("C++");
		list.add("Perl");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
		
			System.out.println(iterator.next());
			
		}
	}
	
}
