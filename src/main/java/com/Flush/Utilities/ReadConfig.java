package com.Flush.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties prop;

	public ReadConfig() {
		File src = new File("./configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e){
			System.out.println("Exception is "+e.getMessage());
		}
	}
	
	public String getApplicationURL() {
		String url = prop.getProperty("baseURL");
		return url;
	}
	public String getBrowserName() {
		String browser = prop.getProperty("browser");
		return browser;
	}
	public String getUsername1() {
		String username1 = prop.getProperty("user1");
		return username1;
	}
	public String getPassword1() {
		String password = prop.getProperty("pass1");
		return password;
	}
	public String getUsername2() {
		String username1 = prop.getProperty("user2");
		return username1;
	}
	public String getPassword2() {
		String password = prop.getProperty("pass2");
		return password;
	}
	public String getUsername3() {
		String username1 = prop.getProperty("user3");
		return username1;
	}
	public String getPassword3() {
		String password = prop.getProperty("pass3");
		return password;
	}
	public String getUsername4() {
		String username1 = prop.getProperty("user4");
		return username1;
	}
	public String getPassword4() {
		String password = prop.getProperty("pass4");
		return password;
	}
	


}
