package com.qa.opencart.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.constants.AppConstants;

public class LoginPageTest extends BaseTest {
	
	@Test
	public void checkURL() {
		String URL=loginpage.getLoginPageURL();
		Assert.assertEquals(URL.contains(AppConstants.URL_fraction),true);
	}
	
	@Test
	public void checkPageTitle() {
		String title=loginpage.getLoginPageTitle();
		Assert.assertEquals(title, AppConstants.login_title);
	}
	
	@Test
	public void checkForgetPswdDisplayed() {
		
	Assert.assertEquals(loginpage.IsFgtPswdDisplayed(), true);
	
	}
	
	@Test
	public void doLogin() {
		myaccount=loginpage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
		
	}

}
