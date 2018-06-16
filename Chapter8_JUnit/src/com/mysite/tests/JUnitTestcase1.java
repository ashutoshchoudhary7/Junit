package com.mysite.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnitTestcase1 {
	
// @Test – is used to specify a test 

// Test level annotations
// @Before – is used to specify pre test setup or actions for each test
// @After – is used to specify post test setup or actions for each test
// @Ignore – is used to ignore or skip a test.

// Test class level annotations
// @BeforeClass – is used to specify pre test setup or actions before any of your tests
// @AfterClass – is used to specify post test setup or actions after all your tests

	@BeforeClass
	public static void deployAndConfigureSite()
	{
		System.out.println("In deployAndConfigureSite() method");
	}
	
	@AfterClass
	public static void cleanUP()
	{
		System.out.println("In cleanUP() method");
	}
	
	@Before
	public void testPreSetup()
	{
		System.out.println("In testPreSetup() method");
	}
	
	@Before
	public void testPreSetup2()
	{
		System.out.println("In testPreSetup2() method");
	}
	
	@Test
	public void testHomePage()
	{
		System.out.println("In testHomePage() method");
		
		//assertEquals("Error: Title is wrong", "My Site Title", "My Site Title22");
		//assertTrue("Error: Title is wrong", "My Site Title".equals("My Site Title22"));
		
		
		if(!("My Site Title".equals("My Site Title22")))
		{
			fail("Error: Title is wrong");
			
			
		}

	}
	
	
	@Ignore
	@Test
	public void testLoginPage()
	{
		System.out.println("In testLoginPage() method");
	}
	
	
	public void testMyAcctPage()
	{
		System.out.println("In testMyAcctPage() method");
	}
	
	@After
	public void testPostSetup()
	{
		System.out.println("In testPostSetup() method");
	}
}

