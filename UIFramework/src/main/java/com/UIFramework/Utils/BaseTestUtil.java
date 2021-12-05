package com.UIFramework.Utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.UIFrameworks.BrowserUtils.BrowserFactory;
import com.UIFrameworks.BrowserUtils.DriverFactory;

public class BaseTestUtil {
    
	protected WebDriver driver;
	private static BrowserFactory browserFactory=new BrowserFactory(); 
	private static DriverFactory driverfactory=DriverFactory.getDriverFactoryinstance();
	
	@BeforeMethod()
	public void setBeforemethod()
	{
		driver=browserFactory.getBrowser(driver,"Chrome", "https://www.makemytrip.com/"); 
		driverfactory.setDriver(driver);	
		driver=driverfactory.getDriver();
	}
	
	@AfterMethod()
	public void setAftermethod()
	{
		System.out.println("AfterMethod");
		driverfactory.closeBrowser();
	}
	

	
}
