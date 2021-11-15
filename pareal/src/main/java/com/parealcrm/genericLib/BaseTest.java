package com.parealcrm.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest implements IAutoconsts{

	public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws Throwable
	{
		FileLib flib=new FileLib();
		String browser = flib.readPropertyData(PROP_PATH, "browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();	
		}
		
		else
		{
			//Reporter.log("Enter Proper Browser name",true);
			System.out.println("Enter Proper browser name");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		String appUrl = flib.readPropertyData(PROP_PATH, "url");
		driver.get(appUrl);
		Thread.sleep(3000);
//		driver.getTitle();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		//wlib.verify(wlib.getPageTitle(), fl.readPropData(PROP_PATH, "loginTitle"), " Home Page");
		wlib.verify(flib.readPropertyData(PROP_PATH,"loginTitle"),wlib.getPageTitle(),"loginTitle");
		//wlib.verify(flib.readPropData(PROP_PATH,"loginTitle"),wlib.getPageTitle(),"Login Title");
	}
	
	
	@AfterClass(enabled=false)
	public void closeBrowser()
	{
		driver.quit();
	}
}

