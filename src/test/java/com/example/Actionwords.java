package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class Actionwords {
     
	WebDriver driver=null;

	public void Actionwords() 
	{
     driver = new FirefoxDriver();
	}
	public void iOpenP1(String p1) 
	{
		
     driver.get(p1);
	}
     public void iSearchForP1(String p1) 
	 {
     WebElement element = driver.findElement(By.name("q"));
     element.clear();
     element.sendKeys(p1);
     element.submit();
	}

}
