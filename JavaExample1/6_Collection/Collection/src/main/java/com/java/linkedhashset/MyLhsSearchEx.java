package com.java.linkedhashset;

import java.util.LinkedHashSet;

public class MyLhsSearchEx {
	
	public static void main(String a[]){
        
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        //add elements to HashSet
        lhs.add("first");
        lhs.add("second");
        lhs.add("third");
        System.out.println(lhs);
        System.out.println("Does set contains 'first'? "+lhs.contains("first"));
    
	}
	
}
