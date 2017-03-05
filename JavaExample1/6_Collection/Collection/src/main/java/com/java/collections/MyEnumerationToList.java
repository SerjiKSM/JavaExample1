package com.java.collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class MyEnumerationToList {

	public static void main(String a[]){
        
        Vector<String> vct = new Vector<String>();
        vct.add("one");
        vct.add("two");
        vct.add("three");
        vct.add("four");
        vct.add("five");
        Enumeration<String> enm = vct.elements();
        List<String> ll = Collections.list(enm);
        System.out.println("List elements: "+ll);
    }
	
}
