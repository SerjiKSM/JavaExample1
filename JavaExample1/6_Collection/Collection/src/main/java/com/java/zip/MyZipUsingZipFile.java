package com.java.zip;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class MyZipUsingZipFile {

	public void unzipFile(String filePath){
        
        ZipEntry zipEntry = null;
        ZipFile zipfile = null;
        try {
            zipfile = new ZipFile(filePath);
            Enumeration enmu = zipfile.entries();
            while(enmu.hasMoreElements()){
                FileOutputStream fos = null;
                InputStream is = null;
                try{
                zipEntry = (ZipEntry) enmu.nextElement();
                is = zipfile.getInputStream(zipEntry);
                byte[] tmp = new byte[4*1024];
                String opFilePath = "D:/"+zipEntry.getName();
                System.out.println("Extracting file to "+opFilePath);
                fos = new FileOutputStream(opFilePath);
                int size = 0;
                while((size = is.read(tmp)) != -1){
                    fos.write(tmp, 0, size);
                }
                fos.flush();
                fos.close();
                is.close();
                } catch(Exception ex){
                     
                } finally{
                    try{
                        if(fos != null) fos.close();
                        if(is != null) is.close();
                    } catch (Exception ex){}
                }
            }
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }
     
    public static void main(String a[]){
         
        MyZipUsingZipFile mfe = new MyZipUsingZipFile();
        mfe.unzipFile("D:/TestZip/testing.zip");
    }
	
}
