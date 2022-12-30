package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccount {
	
	private WebDriver driver;
	private By SearchLink=By.name("search");
	private By searchIcon = By.cssSelector("div#search button");
	
	public MyAccount(WebDriver driver) {
	
		this.driver=driver;
		
	}
	
	public boolean isSearchExist() {
		return driver.findElement(SearchLink).isDisplayed();
		
	}
	public SearchPage doCLickSearch() {
		
		driver.findElement(SearchLink).sendKeys("Macbook");
		driver.findElement(searchIcon).click();
		
		return new SearchPage(driver);
		
	}

}
