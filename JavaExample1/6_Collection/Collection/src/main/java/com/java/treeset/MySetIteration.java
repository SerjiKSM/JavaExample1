package com.java.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class MySetIteration {
	
	public static void main(String a[]){
        
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("one");
        ts.add("two");
        ts.add("three");
        Iterator<String> itr = ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
	
}
