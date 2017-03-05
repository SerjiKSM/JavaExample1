package com.java.collections;

import java.util.Collections;
import java.util.Map;

public class MyEmptyMap {
	
	public static void main(String a[]){
        
        Map<String, String> myEmptyMap = Collections.<String, String>emptyMap();
        System.out.println("Empty map: "+myEmptyMap);
        
    }
	
}
