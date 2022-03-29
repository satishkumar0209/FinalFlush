package com.Flush.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WithoutLogin {
public WebDriver driver;
	
	public static WebElement element;

	public WithoutLogin(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public static WebElement FlushOriginals(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
	}
	public static WebElement Dice(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
	}
	public static WebElement Crash(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
	}
	public static WebElement Mines(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
	}
	public static WebElement Wheel(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
	}
	public static WebElement Hilo(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
	}


}
