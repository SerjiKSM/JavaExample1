package com.java.zip;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class MyDecomGzip {

	public void doUnGzipFile(String filePath) {
		 
        GZIPInputStream gis = null;
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(filePath);
            gis = new GZIPInputStream(fis);
            fos = new FileOutputStream("D:/TestZip/test.txt");
            byte[] tmp = new byte[4*1024];
            int size = 0;
            while ((size = gis.read(tmp)) > 0) {
                fos.write(tmp, 0, size);
            }
            fos.flush();
            System.out.println("Done with uncompressng GZip file.");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try{
                if(gis != null) gis.close();
                if(fos != null) fos.close();
            } catch(Exception ex){}
        }
    }
 
    public static void main(String a[]) {
 
        MyDecomGzip mfg = new MyDecomGzip();
        mfg.doUnGzipFile("D:/TestZip/myGzip.gzip");
    }

	
}
