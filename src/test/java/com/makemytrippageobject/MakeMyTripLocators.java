package com.makemytrippageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.makemytripbaseclass.makemytripbaseclass;

public class MakeMyTripLocators extends makemytripbaseclass {

	public static WebElement Closepopup() {
		return driver.findElement(By.xpath("//span[@class='commonModal__close']"));		
	}
	public static WebElement FromScearch() {
		return driver.findElement(By.xpath("(//input[@type='text'])[2])"));		
	}
	public static WebElement ToSearch() {
		return driver.findElement(By.xpath("(//input[@type='text'])[3]"));		
	}
	public static WebElement Search	() {
		return driver.findElement(By.xpath("(//a [text()='Search']"));		
	}
	
}
