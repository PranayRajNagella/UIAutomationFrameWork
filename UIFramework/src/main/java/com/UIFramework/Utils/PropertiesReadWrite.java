package com.UIFramework.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReadWrite {
	
	public static Properties prop;
	private static FileInputStream fis;
	
	PropertiesReadWrite(String fileName) throws Exception
	{
		prop=new Properties();
		try
		{
			fis=new FileInputStream(new File(fileName));
			prop.load(fis);
		}
		catch (Exception e) {
			throw e;
		}
	}
	

	public static String readProperty(String propertyName) throws IOException
	{
		return prop.getProperty(propertyName);
	}
	
	public static void writePorerty(String key,String Value)
	{
		prop.setProperty(key,  Value);
	}
}
