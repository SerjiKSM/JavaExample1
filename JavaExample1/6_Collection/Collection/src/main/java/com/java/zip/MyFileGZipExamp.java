package com.java.zip;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class MyFileGZipExamp {

	public void doGzip(String filePath){
        
        FileOutputStream fos = null;
        GZIPOutputStream gos = null;
        FileInputStream fis = null;
        try {
            fos = new FileOutputStream("D:/TestZip/myGzip.gzip");
            gos = new GZIPOutputStream(fos);
            fis = new FileInputStream(filePath);
            byte[] tmp = new byte[4*1024];
            int size = 0;
            while ((size = fis.read(tmp)) != -1) {
                gos.write(tmp, 0, size);
            }
            gos.finish();
            System.out.println("Done with GZip...");
        } catch (IOException e) {
             
        } finally{
            try{
                if(fis != null) fis.close();
                if(gos != null) gos.close();
            } catch(Exception ex){}
        }
    }
     
    public static void main(String a[]){
         
        MyFileGZipExamp mfg = new MyFileGZipExamp();
        mfg.doGzip("D:/TestZip/test.txt");
    }
	
}
