package com.Flush.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WelcomePopup {
	public WebDriver driver;

	public WelcomePopup(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public static WebElement Welcomeemail(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@placeholder='Email Or Username']"));
	}
	
	public static WebElement Welcomepassword(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@placeholder='Password']"));
	}
	
	public static WebElement Welcomeplaynow(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='Play Now']"));
	}

}
