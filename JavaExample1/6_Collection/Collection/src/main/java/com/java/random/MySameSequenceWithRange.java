package com.java.random;

import java.util.Random;

public class MySameSequenceWithRange {

	public void generateSequence(){
        Random rnd = new Random(40);
        for(int i=0;i<5;i++){
            System.out.println(rnd.nextInt(100));
        }
    }
     
    public static void main(String a[]){
        MySameSequenceWithRange mss = new MySameSequenceWithRange();
        mss.generateSequence();
        System.out.println("====================");
        mss.generateSequence();
        System.out.println("====================");
        mss.generateSequence();
    }
	
}
