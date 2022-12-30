package com.qa.opencart.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class SearchPageTest extends BaseTest {
	
	@BeforeClass
	public void SearchPageSetup() {
		myaccount=loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test
	public void Searchtext() {
		searchpage=myaccount.doCLickSearch();
	}
	
	@Test
	public void verifyButton() 
	
	{
		Assert.assertEquals(searchpage.searchButtonDisplayed(),true);
	
	}

	
}
