package com.makemytripbaseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class makemytripbaseclass {

public static WebDriver driver = null;
	
	
	public static void browserLaunch(){

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
	}
	public static void inputdata(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void clickData(WebElement element) {
		element.click();
	}
}

	
