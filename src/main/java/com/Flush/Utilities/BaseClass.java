package com.Flush.Utilities;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {
	public WebDriver driver;
	public static Logger log;
	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL = readconfig.getApplicationURL();
	public String username1 =  readconfig.getUsername1();
	public String password1 = readconfig.getPassword1();
	public String username2 =  readconfig.getUsername2();
	public String password2 = readconfig.getPassword2();
	public String username3 =  readconfig.getUsername3();
	public String password3 = readconfig.getPassword3();
	public String username4 =  readconfig.getUsername4();
	public String password4 = readconfig.getPassword4();

	public WebDriver Setup() throws IOException
	{
		log = Logger.getLogger("flush");
		PropertyConfigurator.configure("log4j.properties");
			
		String browserName = readconfig.getBrowserName();
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
	        ChromeOptions options = new ChromeOptions();
	        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("gecko"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	public WebDriver teardown()
	{
	   driver.close();
	   log.info("Browser closed");
	   return driver;
	}
	
	public String getScreenshotPath(String testCaseName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\Screenshots\\"+testCaseName+".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
	}

}
