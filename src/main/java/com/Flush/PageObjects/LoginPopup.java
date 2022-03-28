package com.Flush.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPopup {
	public WebDriver driver;

	public LoginPopup(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	By loginbtn = By.xpath("//*[@class='Header__LoginButton-sc-15su922-5 hSXNQP']/div/span");
	By txtUserName = By.name("username");
	By txtPassword = By.name("password");
	By btnLogin = By.xpath("//*[@class='CustomButton-sc-1np6xc3-0 kMevzE']");
	By path = By.xpath("(//*[name()='path'][@fill='currentColor'])[2]");
	By getError = By.xpath("//img[@alt='error']");
	
	public WebElement Login()
	{
		return driver.findElement(loginbtn);
	}
	public WebElement EmailOrUsername()
	{
		return driver.findElement(txtUserName);
	}
	public WebElement Password()
	{
		return driver.findElement(txtPassword);
	}
	public WebElement PlayNow()
	{
		return driver.findElement(btnLogin);
	}
	public WebElement UserPath()
	{
		return driver.findElement(path);
	}
	public WebElement Error()
	{
		return driver.findElement(getError);
	}

}
