package com.java.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyPropInStaticBlock {

	private static Properties prop;
    
    static{
        InputStream is = null;
        try {
            prop = new Properties();
            //is = ClassLoader.class.getResourceAsStream("/sample.properties");
            is = new FileInputStream(new File("d:/sample.properties"));
            prop.load(is);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     
    public static String getPropertyValue(String key){
        return prop.getProperty(key);
    }
     
    public static void main(String a[]){
         
        System.out.println("db.host: "+getPropertyValue("db.host"));
        System.out.println("db.user: "+getPropertyValue("db.user"));
        System.out.println("db.password: "+getPropertyValue("db.password"));
    }
	
}
