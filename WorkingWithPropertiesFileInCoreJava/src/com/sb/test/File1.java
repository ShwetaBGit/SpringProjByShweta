package com.sb.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class File1 {
	
 public static void main(String[] args) throws IOException {
	
	 
	 
	 FileInputStream fis = new FileInputStream("abc.properties");
	 FileOutputStream fos = new FileOutputStream("xyz.properties");
	 Properties prop = new Properties();
	 
	 prop.load(fis);
	 System.out.println(prop);
	 
	 prop.setProperty("shweta","aman");

	 prop.store(fos, "by shweta");
	System.out.println(prop.getProperty("shweta"));
	}
  }