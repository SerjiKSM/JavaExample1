package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MySubListIndex {

	public static void main(String a[]){
        
        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("c");
        list.add("c++");
        list.add("unix");
        list.add("perl");
//        list.add("perl2");
        list.add("php");
        list.add("javascript");
        list.add("ruby");
        list.add(".net");
        list.add("jdbc");
        list.add("servlets");
        List<String> subList = new ArrayList<String>();
        subList.add("php");
        subList.add("javascript");
        subList.add("ruby");
        System.out.println("Index of sublist: "+Collections.indexOfSubList(list, subList));
    }
	
}
