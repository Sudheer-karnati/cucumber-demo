package com.mindtree.reusable;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverHelper {
	public static WebDriver driver;
	public Properties prop;
	public WebDriver initializedriver() throws IOException {
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\karna\\eclipse-workspace\\homeCucumber\\testdata\\config.properties");
	    prop.load(fis);
	    String browserName=prop.getProperty("browser");
	    if(browserName.equalsIgnoreCase("chrome"))
	    {
	    	System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
	    }
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}

}
