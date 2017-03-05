package com.java.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Set;

public class MyMapIterate {
	
	public static void main(String a[]){
        
        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
        lhm.put("one", "This is first element");
        lhm.put("two", "This is second element");
        lhm.put("four", "Element inserted at 3rd position");
        Set<String> keys = lhm.keySet();
        for(String k:keys){
            System.out.println(k+" -- "+lhm.get(k));
        }
    }
	
}
