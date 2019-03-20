package com.GirishContractsADFAutomation.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		
	
		try {
			File src=new File("C:\\Users\\ginallap.ORADEV\\eclipse-workspace\\GirishContractsADFAutomation\\Configuration\\Config.properties");
			FileInputStream fis;
			fis = new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getConfigPropertyValue(String PropertyName) {
		System.out.println(PropertyName);
		String propertyValue=pro.getProperty(PropertyName);
		return propertyValue;
	}
	

}
