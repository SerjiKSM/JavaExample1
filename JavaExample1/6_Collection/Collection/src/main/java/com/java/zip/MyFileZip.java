package com.java.zip;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class MyFileZip {

	public void zipFile(String filePath){
        
        FileOutputStream fos = null;
        ZipOutputStream zipOut = null;
        FileInputStream fis = null;
        try {
            fos = new FileOutputStream("D:/testing.zip");
            zipOut = new ZipOutputStream(new BufferedOutputStream(fos));
            File input = new File(filePath);
            fis = new FileInputStream(input);
            ZipEntry ze = new ZipEntry(input.getName());
            System.out.println("Zipping the file: "+input.getName());
            zipOut.putNextEntry(ze);
            byte[] tmp = new byte[4*1024];
            int size = 0;
            while((size = fis.read(tmp)) != -1){
                zipOut.write(tmp, 0, size);
            }
            zipOut.flush();
            zipOut.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try{
                if(fos != null) fos.close();
                if(fis != null) fis.close();
            } catch(Exception ex){
                 
            }
        }
    }
     
    public static void main(String a[]){
         
        MyFileZip mfe = new MyFileZip();
        mfe.zipFile("D:/test.txt");
    }
	
}
