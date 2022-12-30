package com.qa.opencart.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class MyAccountTest extends BaseTest {
	
	@BeforeClass
	
	public void accSetup() {
		myaccount=loginpage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test
	public void IsSearchExist() {
		
		Assert.assertEquals(myaccount.isSearchExist(), true);
		
	}
	

}
