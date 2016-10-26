package com.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import junit.framework.TestCase;

public class ProjectTest extends TestCase {
     
     WebDriver driver=null;
     
     public void testP1(String p1) 
	{
	     String url = "http://www.google.com";
          driver = new FirefoxDriver();
          driver.get(url);
	}
}
