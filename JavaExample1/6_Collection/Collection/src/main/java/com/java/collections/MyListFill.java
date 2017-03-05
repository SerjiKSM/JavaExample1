package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyListFill {
	
	public static void main(String a[]){
        
        List<String> ll = new ArrayList<String>();
        ll.add("one");
        ll.add("two");
        ll.add("three");
        ll.add("four");
        System.out.println("Original List: "+ll);
        Collections.fill(ll, "TEMP_STRING");
        System.out.println("After fill: "+ll);
    }
	
}
