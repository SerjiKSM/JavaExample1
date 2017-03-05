package com.java.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MyCheckedMap {

	public static void main(String a[]) {
		Map myMap = new HashMap();
		myMap.put("one", 1);
		myMap.put("two", 2);
		myMap.put("three", 3);
		myMap.put("four", 4);
		Map chkMap = Collections.checkedMap(myMap, String.class, Integer.class);
		System.out.println("Checked map content: " + chkMap);
		// you can add any type of elements to myMap object
		myMap.put(10, "ten");
		// you cannot add any type of elements to chkMap object, doing so
		// throws ClassCastException
		chkMap.put(10, "ten"); // throws ClassCastException
	}

}
