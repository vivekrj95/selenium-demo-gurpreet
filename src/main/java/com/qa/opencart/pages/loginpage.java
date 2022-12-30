package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	
	private WebDriver driver;
	
	private By email= By.id("input-email");
	private By password= By.id("input-password");
	private By loginbtn= By.xpath("//input[@value='Login']");
	private By forgotpass=By.linkText("Forgotten Password");
	
	public loginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getLoginPageTitle() {
		String Title=driver.getTitle();
		return Title;

	}
	public String getLoginPageURL() {
		String URL=driver.getCurrentUrl();
		System.out.println("Your URL is: " +URL);
		return URL;
	}
	
	public MyAccount doLogin(String Username,String pwd) {
		driver.findElement(email).sendKeys(Username);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginbtn).click();
		
		return new MyAccount(driver);
		
	}
	public Boolean IsFgtPswdDisplayed() {
		return driver.findElement(forgotpass).isDisplayed();
	
		
	}
	
	

}
