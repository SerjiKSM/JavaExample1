package com.java.nested.classes;

public class MyStaticMemberInterfaceTest implements MyStaticMemberInterface.MyStaticInterface{

	public void implementMe(){
        System.out.println("Hey I have implemented successfully!!!");
    }
     
    public static void main(String a[]){
        MyStaticMemberInterfaceTest msi = new MyStaticMemberInterfaceTest();
        msi.implementMe();
    }
	
}

class MyStaticMemberInterface {
	public static interface MyStaticInterface{
        public void implementMe();
    }
}