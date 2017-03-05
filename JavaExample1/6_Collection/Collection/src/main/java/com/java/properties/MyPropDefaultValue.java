package com.java.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyPropDefaultValue {
	
	private Properties prop = null;
    
    public MyPropDefaultValue(){
         
        InputStream is = null;
        try {
            this.prop = new Properties();
            //is = this.getClass().getResourceAsStream("/sample.properties");
            is = new FileInputStream(new File("d:/sample.properties"));
            prop.load(is);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     
    public String getPropertyValue(String key){
        return this.prop.getProperty(key, "Its Default Value");
    }
     
    public static void main(String a[]){
         
        MyPropDefaultValue mpc = new MyPropDefaultValue();
        System.out.println("db.host: "+mpc.getPropertyValue("db.tables"));
        System.out.println("db.user: "+mpc.getPropertyValue("db.user"));
    }
	
}
