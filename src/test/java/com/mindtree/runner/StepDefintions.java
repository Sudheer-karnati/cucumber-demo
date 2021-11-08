package com.mindtree.runner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.mindtree.PageObjects.HomePageOb;
import com.mindtree.reusable.WebDriverHelper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefintions extends WebDriverHelper{
	public WebDriver driver;
	@Given("^user is on browser$")
	public void user_is_on_browser() throws IOException  {
		WebDriverHelper w=new WebDriverHelper();
		driver=w.initializedriver();
	}


	@And("^user on Home page$")
	public void user_on_home_page()  {
		//driver.get(prop.getProperty("url"));
		driver.get("https://atlanticbooks.com/");
	}

	@When("^user enter credentials$")
	public void user_enter_credentials()  {
		HomePageOb h=new HomePageOb(driver);
		h.clickLoginBtn().click();
		h.clickusername().sendKeys("kskr@1234");
		h.clickpassword().sendKeys("12345678");
		h.clickenter().click();


	}

	@Then("^user should not navigate to Login page$")
	public void user_should_not_navigate_to_login_page(){
		System.out.println("user didnt logged in");

	}

}
