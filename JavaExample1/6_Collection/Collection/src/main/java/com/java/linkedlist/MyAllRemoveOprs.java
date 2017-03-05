package com.java.linkedlist;

import java.util.LinkedList;

public class MyAllRemoveOprs {

    public static void main(String a[]){

        LinkedList<String> arrl = new LinkedList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        arrl.add("four");
        arrl.add("five");
        arrl.add("six");
        arrl.add("seven");
        arrl.add("eight");
        arrl.add("nine");
        System.out.println(arrl);
        System.out.println("Remov() method:"+arrl.remove());
        System.out.println("After remove() method call:");
        System.out.println(arrl);
        System.out.println("remove(index) method:"+arrl.remove(2));
        System.out.println("After remove(index) method call:");
        System.out.println(arrl);
        System.out.println("Remov(object) method:"+arrl.remove("six"));
        System.out.println("After remove(object) method call:");
        System.out.println(arrl);
        System.out.println("removeFirst() method:"+arrl.removeFirst());
        System.out.println("After removeFirst() method call:");
        System.out.println(arrl);
        System.out.println("removeFirstOccurrence() method:"
                +arrl.removeFirstOccurrence("eight"));
        System.out.println("After removeFirstOccurrence() method call:");
        System.out.println(arrl);
        System.out.println("removeLast() method:"+arrl.removeLast());
        System.out.println("After removeLast() method call:");
        System.out.println(arrl);
        System.out.println("removeLastOccurrence() method:"
                +arrl.removeLastOccurrence("five"));
        System.out.println("After removeLastOccurrence() method call:");
        System.out.println(arrl);
    }

}
