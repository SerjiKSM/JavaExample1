package com.java.linkedhashset;

import java.util.LinkedHashSet;

public class MyLhsToArrayEx {

	public static void main(String a[]){
        
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        //add elements to LinkedHashSet
        lhs.add("first");
        lhs.add("second");
        lhs.add("third");
        System.out.println("LinkedHashSet content: ");
        System.out.println(lhs);
        String[] strArr = new String[lhs.size()];
        lhs.toArray(strArr);
        System.out.println("Copied array content:");
        for(String str:strArr){
            System.out.println(str);
        }
    }
	
}
