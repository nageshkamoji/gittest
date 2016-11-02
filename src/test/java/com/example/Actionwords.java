package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class Actionwords {
     
     WebDriver driver;
	
	public void iOpenP1(String p1) 
	{
	   driver = new FirefoxDriver();
	   System.out.println("inside iOpenP1"+p1);	
     	  driver.get(p1);
	  System.out.println("after driver get");	
	}
    }
