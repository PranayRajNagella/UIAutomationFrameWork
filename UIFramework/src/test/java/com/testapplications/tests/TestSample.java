package com.testapplications.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.UIFramework.Utils.BaseTestUtil;


public class TestSample extends BaseTestUtil{
	
	
	@Test()
	public void testFilghts()
	{
		
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		//driver.findElement(By.xpath("//*[text()='Login or Create Account']")).click();
		driver.findElement(By.xpath("//nav//ul//li[@class='menu_Flights']//a")).click();
		System.out.println(driver.getCurrentUrl());
	}
	
	
	@Test()
	public void testhomestays()
	{
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		driver.findElement(By.xpath("//nav//ul//li[@class='menu_Homestays']//a")).click();
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test()
	public void testHotels()
	{
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		driver.findElement(By.xpath("//nav//ul//li[@class='menu_Hotels']//a")).click();
		System.out.println(driver.getCurrentUrl());
	}

}
