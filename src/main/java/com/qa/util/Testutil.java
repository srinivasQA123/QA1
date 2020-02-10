package com.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Testutil {

	Properties pro;
	
	public  Testutil() 
	{
		File fs = new File("./Configuration/config.properties");
		try {
			
			FileInputStream fis=new FileInputStream(fs);
			pro = new Properties();
			pro.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println("print the message "+e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String getApplicationurl()
	{
		pro.getProperty("baseurl");
		return null;
		
	}
	public String getusername()
	{
		
				pro.getProperty("username");
				return null;
	}
	public String getPassword()
	{
		
				pro.getProperty("Password");
				return null;
	}

	public String getchromepath()
	{
		
				pro.getProperty("chromepath");
				return null;
	}
	public String getIEpath() {
		pro.getProperty("IE");
		return null;
		
	}
	public String getMozilla()
	{
		
				pro.getProperty("Mozilla");
				return null;
	}
	

	
	}



