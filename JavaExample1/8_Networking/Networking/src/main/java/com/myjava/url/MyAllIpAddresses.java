package com.myjava.url;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyAllIpAddresses {

	public static void main(String a[]){
	     
        try {
            //InetAddress[] myHost = InetAddress.getAllByName("www.google.com");
        	InetAddress[] myHost = InetAddress.getAllByName("www.ukr.net");
            for(InetAddress host:myHost){
                System.out.println(host.getHostAddress());
            }
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
	
}
