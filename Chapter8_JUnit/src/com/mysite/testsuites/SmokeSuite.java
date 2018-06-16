package com.mysite.testsuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.mysite.tests.IndeedSiteTests;
import com.mysite.tests.IndeedSiteTests02;
import com.mysite.tests.JUnitTestcase1;


@RunWith(Suite.class)

@SuiteClasses({ 
	
		IndeedSiteTests.class, 
		IndeedSiteTests02.class,
		JUnitTestcase1.class 
		
			})


public class SmokeSuite {

}
