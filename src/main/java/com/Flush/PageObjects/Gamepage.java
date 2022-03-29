package com.Flush.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Gamepage {
public WebDriver driver;
	
	public static WebElement element;

	public Gamepage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	public static WebElement BetButton(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[text()='BET'])[1]"));
	}
	
	public static WebElement HiloBetButton(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[text()='Bet'])[1]"));
	}
	
	
	public static WebElement CrashBetNextroungButton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='BET (NEXT ROUND)']"));
	}
	
	

}
