package com.parealcrm.genericLib;

import java.io.FileInputStream;
import java.util.Properties;

public class FileLib {
	

	//public class FileLib {
	public static String readPropertyData(String proppath, String key) throws Throwable
	{
	FileInputStream fis=new FileInputStream(proppath);
	Properties prop = new Properties();
	prop.load(fis);
	String propValue = prop.getProperty(key, "Incorrect Key");
	return propValue;

}

	public static String readPropData(Object PROP_PATH, String key) {
		// TODO Auto-generated method stub
		return null;
	}
}