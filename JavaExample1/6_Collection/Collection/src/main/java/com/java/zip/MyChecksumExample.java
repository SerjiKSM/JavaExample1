package com.java.zip;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Adler32;
import java.util.zip.CheckedInputStream;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class MyChecksumExample {

	public static void main(String a[]){
        
        //Create a zip file using checksum
        MyChecksumZip mfe = new MyChecksumZip();
        List<String> files = new ArrayList<String>();
        files.add("D:/TestZip/test.txt");
        files.add("D:/TestZip/test.sh");
        files.add("D:/TestZip/port-chn.txt");
        mfe.zipFiles(files);
        //Unzip the file using checksum
        MyChecksumUnzip mcu = new MyChecksumUnzip();
        mcu.unzipFile("D:/TestZip/testing.zip");
    }
	
}

class MyChecksumZip{
    
    public void zipFiles(List<String> files){
         
        FileOutputStream fos = null;
        ZipOutputStream zipOut = null;
        FileInputStream fis = null;
        CheckedOutputStream checksumOs = null;
        try {
            fos = new FileOutputStream("D:/TestZip/testing.zip");
            checksumOs = new CheckedOutputStream(fos, new Adler32());
            zipOut = new ZipOutputStream(new BufferedOutputStream(checksumOs));
            for(String filePath:files){
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
                fis.close();
            }
            zipOut.close();
            System.out.println("checksum: "+checksumOs.getChecksum().getValue());
            System.out.println("Done... Zipped the files...");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try{
                if(fos != null) fos.close();
            } catch(Exception ex){
                 
            }
        }
    }
}
 
class MyChecksumUnzip{
     
    public void unzipFile(String filePath){
         
        FileInputStream fis = null;
        ZipInputStream zipIs = null;
        ZipEntry zEntry = null;
        try {
            fis = new FileInputStream(filePath);
            CheckedInputStream checksumIs = new CheckedInputStream(fis, new Adler32());
            zipIs = new ZipInputStream(new BufferedInputStream(checksumIs));
            while((zEntry = zipIs.getNextEntry()) != null){
                try{
                    byte[] tmp = new byte[4*1024];
                    FileOutputStream fos = null;
                    String opFilePath = "D:/"+zEntry.getName();
                    System.out.println("Extracting file to "+opFilePath);
                    fos = new FileOutputStream(opFilePath);
                    int size = 0;
                    while((size = zipIs.read(tmp)) != -1){
                        fos.write(tmp, 0 , size);
                    }
                    fos.flush();
                    fos.close();
                } catch(Exception ex){
                     
                }
            }
            zipIs.close();
            System.out.println("Checksum: "+checksumIs.getChecksum().getValue());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}