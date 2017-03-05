package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyListRotate {
	
	 public static void main(String a[]){
         
	        List<String> list = new ArrayList<String>();
	        list.add("java");
	        list.add("c");
	        list.add("c++");
	        list.add("unix");
	        list.add("perl");
	        list.add("php");
	        list.add("javascript");
	        list.add("ruby");
	        list.add(".net");
	        System.out.println(list);
	        Collections.rotate(list, 2);
	        System.out.println("List after rotation:");
	        System.out.println(list);
	    
	 }
	
}
