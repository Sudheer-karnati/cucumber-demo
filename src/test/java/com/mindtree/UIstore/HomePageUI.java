package com.mindtree.UIstore;

import org.openqa.selenium.By;

public class HomePageUI {
	
	public static By login=By.xpath("/html/body/div[2]/div[1]/div/div[1]/div/div/div[2]/div/ul/li[4]/a");
	//public static By username=By.xpath("//*[@id=\'email\']");
	//public static By password=By.xpath("//*[@id=\'pass\']");
	//public static By enter=By.xpath("//*[@id=\'send2\']");
	
	public static By username=By.cssSelector("input[name='login[username]']");
	public static By password=By.cssSelector("input[name='login[password]']");
	public static By enter=By.id("send2");
}
