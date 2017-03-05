package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyPasswordValidate {

	private static Pattern pswNamePtrn =
	        Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
	     
	    public static boolean validatePassword(String userName){
	         
	        Matcher mtch = pswNamePtrn.matcher(userName);
	        if(mtch.matches()){
	            return true;
	        }
	        return false;
	    }
	     
	    public static void main(String a[]){
	        System.out.println("Is 'java2novice' a valid password? "
	                            +validatePassword("java2novice"));
	        System.out.println("Is 'gabbarsingh' a valid password? "
	                            +validatePassword("gabbarsingh"));
	        System.out.println("Is 'Java2NOVICE$' a valid password? "
	                            +validatePassword("Java2NOVICE$"));
	        System.out.println("Is '234aBc#' a valid password? "
	                            +validatePassword("234aBc#"));
	    
	    }
	
}
