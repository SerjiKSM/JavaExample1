package com.java.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class MySetWithCompr {
	
	public static void main(String a[]){
        
        TreeSet<String> ts = new TreeSet<String>(new MyComp());
        ts.add("RED");
        ts.add("ORANGE");
        ts.add("BLUE");
        ts.add("GREEN");
        
        System.out.println(ts);
    }
	
}

class MyComp implements Comparator<String>{
	 
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
     
}
