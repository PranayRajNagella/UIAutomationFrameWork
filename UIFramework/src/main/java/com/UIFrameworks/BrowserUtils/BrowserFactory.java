package com.UIFrameworks.BrowserUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	
	//public WebDriver driver;
	
	public WebDriver getBrowser(WebDriver driver,String Browser,String Url)
	{
		
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--incognito");
			driver=new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get(Url);
		}
		else if(Browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.get(Url);
		}
		else if(Browser.equalsIgnoreCase("ie"))
		{
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			driver.get(Url);
		}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.iedriver().setup();
			driver=new FirefoxDriver();
			driver.get(Url);
		}
		return driver;
	}
	
	
	

}
