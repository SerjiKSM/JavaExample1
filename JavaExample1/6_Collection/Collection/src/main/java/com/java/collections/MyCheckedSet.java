package com.java.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MyCheckedSet {

	public static void main(String a[]){
        
        Set mySet = new HashSet();
        mySet.add("one");
        mySet.add("two");
        mySet.add("three");
        mySet.add("four");
        mySet.add(20);
        Set chkSet = Collections.checkedSet(mySet, String.class);
        System.out.println("Checked set content: "+chkSet);
        //you can add any type of elements to mySet object
        mySet.add(10);
        //you cannot add any type of elements to chkSet object, doing so
        //throws ClassCastException
        chkSet.add(10); //throws ClassCastException
    }
	
}
