package com.java.random;

import java.util.Random;

public class MyBasicRandom {

	public static void main(String a[]){
        Random rand = new Random();
        System.out.println("Random Integers:");
        System.out.println(rand.nextInt());
        System.out.println(rand.nextInt());
        System.out.println(rand.nextInt());
        System.out.println("Random Double Numbers:");
        System.out.println(rand.nextDouble());
        System.out.println(rand.nextDouble());
        System.out.println(rand.nextDouble());
        System.out.println("Random Long Numbers:");
        System.out.println(rand.nextLong());
        System.out.println(rand.nextLong());
        System.out.println(rand.nextLong());
    }
	
}
