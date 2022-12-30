package com.qa.opencart.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.MyAccount;
import com.qa.opencart.pages.SearchPage;
import com.qa.opencart.pages.loginpage;

public class BaseTest {
	public WebDriver driver;
	public DriverFactory df;
	public loginpage loginpage;
	public Properties prop;
	public MyAccount myaccount;
	public SearchPage searchpage;

	@BeforeTest
	public void Setup() {
		df=new DriverFactory();
		
		prop=df.initProperties();
		
		driver=df.initDriver(prop);
		loginpage=new loginpage(driver);
		
	}
	
	@AfterTest()
		public void tearDown() {
		driver.quit();
		}
	

}
