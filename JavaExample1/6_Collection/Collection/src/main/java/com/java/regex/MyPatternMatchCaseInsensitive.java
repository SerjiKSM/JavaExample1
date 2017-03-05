package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyPatternMatchCaseInsensitive {

	public boolean isPatternMatching(String line){
        
        Pattern ptn = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
        Matcher mtch = ptn.matcher(line);
        if(mtch.find()){
            return true;
        }
        return false;
    }
     
    public static void main(String a[]){
        MyPatternMatchCaseInsensitive msp = new MyPatternMatchCaseInsensitive();
        System.out.println(msp.isPatternMatching("This line contains java, lets see"));
        System.out.println(msp.isPatternMatching("Here JAVA is in capital leters, lets see"));
        System.out.println(msp.isPatternMatching("Here C++ is in capital leters, lets see"));
    }
	
}
