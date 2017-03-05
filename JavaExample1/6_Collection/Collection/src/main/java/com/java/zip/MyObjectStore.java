package com.java.zip;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.zip.GZIPOutputStream;

public class MyObjectStore {

	public static void main(String a[]){
	     
        Mobile m1 = new Mobile("1234566778", "JOCK");
        Mobile m2 = new Mobile("7686291729", "Mike");
        FileOutputStream fos = null;
        GZIPOutputStream gos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("D:/TestZip/MyObjectStore");
            gos = new GZIPOutputStream(fos);
            oos = new ObjectOutputStream(gos);
            oos.writeObject(m1);
            oos.writeObject(m2);
            oos.flush();
            System.out.println("Done... Objects are compressed and stored");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try{
                if(oos != null) oos.close();
                if(fos != null) fos.close();
            } catch(Exception ex){
                 
            }
        }
    }
	
}

class Mobile implements Serializable{
    
    private String number;
    private String owner;
     
    public Mobile(String num, String own){
        this.number = num;
        this.owner = own;
    }
     
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
     
}
