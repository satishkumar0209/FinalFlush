package com.Flush.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VIP {
	
	
	
	public static WebElement DropdownVipLink(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[@class='UserDropdownMenu__DropdownItem-sc-qt4bc8-5 iLdCch'])[2]"));
	} 

	public static WebElement Loyalitytext(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='Loyality']"));
	} 
	
	public static WebElement ClaimFreeSpin(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='CLAIM FREE SPIN']"));
	} 
	
	public static WebElement Claim(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='CLAIM']"));
	} 
	
	public static WebElement ClaimRewardstab(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='CLAIM REWARDS']"));
		
	} 
	
	public static WebElement Rewards(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='REWARDS']"));
	} 
	
	
	
	public static WebElement TotalPointsSection(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@class='Header__HeadEl3-sc-jdyd2k-4 kRAglQ']"));
	} 
}
