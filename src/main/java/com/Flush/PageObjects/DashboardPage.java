package com.Flush.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
public WebDriver driver;
	
	public static WebElement element;

	public DashboardPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	public static WebElement Userdropdown(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@class='UserDropdownMenu__DropdownButton-sc-qt4bc8-2 khShiU']"));
	}
	
	public static WebElement Logout(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='Logout']"));
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
