package com.java.regex;

import java.util.regex.Pattern;

public class MyTokens {

	public static void main(String a[]){
        
        String str = "I have a cat. I play cricket with bat. I dont like rat,"+
            "i hate mats, now break it";
        Pattern ptn = Pattern.compile("(cat|rat|mat|bat)");
        String[] parts = ptn.split(str);
        for(String p:parts){
            System.out.println(p);
        }
    }
	
}
