package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MySyncList {
	public static void main(String a[]){
        
        List<String> li = new ArrayList<String>();
        List<String> sysLi = Collections.synchronizedList(li);
        System.out.println("Synchronized list got created...");
    }

}
