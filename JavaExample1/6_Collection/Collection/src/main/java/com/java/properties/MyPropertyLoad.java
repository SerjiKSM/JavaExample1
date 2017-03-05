package com.java.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyPropertyLoad {

	 public static void main(String a[]){
         
	        InputStream is = null;
	        Properties prop = null;
	        try {
	            prop = new Properties();
	            is = new FileInputStream(new File("d:/sample.properties"));
	            prop.load(is);
	            System.out.println("db.host: "+prop.getProperty("db.host"));
	            System.out.println("db.user: "+prop.getProperty("db.user"));
	            System.out.println("db.password: "+prop.getProperty("db.password"));
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	
}
