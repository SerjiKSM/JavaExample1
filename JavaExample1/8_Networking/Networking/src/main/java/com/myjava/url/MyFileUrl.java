package com.myjava.url;

import java.net.MalformedURLException;
import java.net.URL;

public class MyFileUrl {

	public static void main(String a[]) {

		try {
			URL url = new URL("file://d:/Perl");
			System.out.println(url.toString());
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		}

	}

}
