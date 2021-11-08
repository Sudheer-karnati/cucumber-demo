package com.mindtree.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIstore.HomePageUI;


public class HomePageOb {
	public WebDriver driver;



	public HomePageOb(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement clickLoginBtn() {
		return driver.findElement(HomePageUI.login);
	}
	public WebElement clickusername() {
		return driver.findElement(HomePageUI.username);
	}
	public WebElement clickpassword() {
		return driver.findElement(HomePageUI.password);
	}
	public WebElement clickenter() {
		return driver.findElement(HomePageUI.enter);
	}
	
}