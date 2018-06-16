package com.mysite.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IndeedSiteTests {
	
	public WebDriver driver;
	public String baseUrl;
	
	@Before
	public void setUp()
	{
		//Assume.assumeTrue(false);
		driver = new FirefoxDriver();
		baseUrl = "http://www.indeed.co.uk";
	}
	
	@Test
	public void testIndeedJobSearch()
	{
		driver.get(baseUrl);
		driver.findElement(By.id("what")).sendKeys("Selenium");
		driver.findElement(By.id("where")).clear();
		driver.findElement(By.id("where")).sendKeys("London");
		driver.findElement(By.id("fj")).click();
		
		String expectedTitle = "Selenium Jobs, vacancies in London | Indeed.co.uk22";
		String actualTitle=driver.getTitle();
		
		assertEquals("ERROR: Job search title is wrong", expectedTitle, actualTitle);
	}	
	
	@Test
	public void testHomePageLogoDisplayed()
	{
		driver.get(baseUrl);
		
		assertTrue("ERROR: Logo is not displayed", 
		driver.findElement(By.xpath("//img[@alt='Indeed job search']")).isDisplayed());
	}
	
	@After
	public void tearDown()
	{
		if(driver!=null){
		driver.quit();
		}
	}
}
