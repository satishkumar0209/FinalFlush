package com.Flush.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cashier {
public WebDriver driver;
	
	public static WebElement element;

	public Cashier(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public static WebElement CashierPopupCrossIcon(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@class='ModalMain__CloserBtn-sc-1xo7njg-0 icXoLY']"));
	}
	
	public static WebElement CashierDropdown(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@class='CustomDropdown__ButtonContent-sc-1hmifsq-4 fpNuZl']"));
	}
	
	public static WebElement Deposit(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='Deposit']"));
	}
	
	public static WebElement WithdrawAmount(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='WITHDRAW AMOUNT']"));
	}
	
	public static WebElement MaxButton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='Max']"));
	}
	
	
	public static WebElement Withdraw(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='Withdraw']"));
	}
	public static WebElement Buycurrency(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='BUY CURRENCY']"));
	}
	
	public static WebElement CurrencySubmitBitton(WebDriver driver)
	{
		return driver.findElement(By.xpath("SubmitButton"));
	}
	

}
