package com.java.regex;

public class MyStringMatches {

	 public void isStringNumber(String no){
		 
	        System.out.println(no.matches("(\\d+)"));
	    }
	     
	    public static void main(String a[]){
	        MyStringMatches msm = new MyStringMatches();
	        msm.isStringNumber("345");
	        msm.isStringNumber("34we");
	        msm.isStringNumber("345w12");
	        msm.isStringNumber("956");
	    }
	
}
