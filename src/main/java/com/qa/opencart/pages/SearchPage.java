package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
	
	private WebDriver driver;
	private By SearchButton= By.id("button-search");
	
	public SearchPage(WebDriver driver) {
		this.driver=driver;
		}
	
	public boolean searchButtonDisplayed() {
	boolean button_exist=driver.findElement(SearchButton).isDisplayed();
	return button_exist;
	}
	

}
