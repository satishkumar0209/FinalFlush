package com.Flush.PageObjects;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Homepage {
	public WebDriver driver;
	
	public static WebElement element;

	public Homepage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	public static WebElement Loginbutton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='LOG IN']"));
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
	
	public static WebElement FlushOriginals(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[text()='Flush Originals'])[3]"));
	}
	public static WebElement Dice(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[text()='Dice'])[1]"));
	}
	public static WebElement Crash(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[text()='Crash'])[1]"));
	}
	public static WebElement Mines(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[text()='Mines'])[1]"));
	}
	public static WebElement Wheel(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[text()='Wheel'])[1]"));
	}
	public static WebElement Hilo(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[text()='HiLo'])[1]"));
	}
	public void Scroll(WebDriver driver) throws IOException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 
	       //specify the WebElement till which the page has to be scrolled
	       WebElement element = driver.findElement(By.xpath("(//*[text()='Flush Originals'])[3]"));
	 
	       js.executeScript("arguments[0].scrollIntoView();", element);
		
		
	}
	
public void Login(WebDriver driver) throws IOException {
		
	WelcomePopup.Welcomeemail(driver).sendKeys("satishkumar@rapidinnovation.dev");

	WelcomePopup.Welcomepassword(driver).sendKeys("Satvik@123");

	WelcomePopup.Welcomeplaynow(driver).click();


		
		
	}
	
	
	
	
	
}
