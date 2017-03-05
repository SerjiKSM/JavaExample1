package com.java.random;

import java.util.Random;

public class MyRandomSeedChange {

	public static void main(String a[]){
        Random rnd = new Random(40);
        for(int i=0;i<5;i++){
            System.out.println(rnd.nextInt(100));
        }
        System.out.println("Changing seed to change to sequence");
        rnd.setSeed(45);
        for(int i=0;i<5;i++){
            System.out.println(rnd.nextInt(100));
        }
        System.out.println("Changing seed to change to sequence");
        rnd.setSeed(50);
        for(int i=0;i<5;i++){
            System.out.println(rnd.nextInt(100));
        }
        System.out.println("Setting seed 40 to produce the previous sequence");
        rnd.setSeed(40);
        for(int i=0;i<5;i++){
            System.out.println(rnd.nextInt(100));
        }
    }
	
}
