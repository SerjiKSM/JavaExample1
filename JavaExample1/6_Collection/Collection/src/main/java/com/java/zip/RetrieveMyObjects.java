package com.java.zip;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.zip.GZIPInputStream;

public class RetrieveMyObjects {

	public static void main(String a[]){
		 
        FileInputStream fis = null;
        GZIPInputStream gs = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("D:/TestZip/MyObjectStore");
            gs = new GZIPInputStream(fis);
            ois = new ObjectInputStream(gs);
            Mobile m1 = (Mobile) ois.readObject();
            System.out.println(m1.getNumber()+"   "+m1.getOwner());
            Mobile m2 = (Mobile) ois.readObject();
            System.out.println(m2.getNumber()+"   "+m2.getOwner());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try{
                if(ois != null) ois.close();
                if(fis != null) fis.close();
            } catch (Exception ex){}
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
