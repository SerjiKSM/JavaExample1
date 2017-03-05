package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyMinNumber {
	
	public static void main(String a[]){
        
        List<Integer> li = new ArrayList<Integer>();
        li.add(23);
        li.add(44);
        li.add(12);
        li.add(45);
        li.add(2);
        li.add(16);
        System.out.println("Minimum element from the list: "+Collections.min(li));
    }
	
}
