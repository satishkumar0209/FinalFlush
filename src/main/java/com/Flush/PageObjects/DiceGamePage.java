package com.Flush.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DiceGamePage {
public WebDriver driver;
	
	public static WebElement element;

	public DiceGamePage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	public static WebElement BetAmountinputField(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[@class='LabelInput__MainInput-sc-zkip7h-6 jMmTxe'])[1]"));
	}
	
	public static WebElement BetButton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='BET']"));
	}
	
	
	
	
	
	
	
	

}
