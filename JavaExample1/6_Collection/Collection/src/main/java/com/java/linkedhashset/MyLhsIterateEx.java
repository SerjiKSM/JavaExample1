package com.java.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class MyLhsIterateEx {
	
	public static void main(String a[]){
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        //add elements to HashSet
        lhs.add("first");
        lhs.add("second");
        lhs.add("third");
        Iterator<String> itr = lhs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
