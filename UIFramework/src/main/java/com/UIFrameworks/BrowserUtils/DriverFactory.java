package com.UIFrameworks.BrowserUtils;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
	
	private static DriverFactory driverFactory;
	
	ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();

	private DriverFactory()
	{
		
	}

	public static DriverFactory getDriverFactoryinstance()
	{
		if(driverFactory==null)
		{
			driverFactory=new DriverFactory();
		}
		return driverFactory;
	}
	
	public WebDriver getDriver()
	{
		return driver.get();
	}
	
	public void setDriver(WebDriver driverParms)
	{
		driver.set(driverParms);
	}
	
	public void closeBrowser()
	{
		driver.get().close();
		driver.remove();
	}

}
