package com.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import junit.framework.TestCase;

public class ProjectTest extends TestCase {
     
        Actionwords actionwords = new Actionwords();
	
	 System.out.println("BEFORE test FindingASiteOnGoogle");
     
     public void testFindingASiteOnGoogle(String p1) 
	{
	     System.out.println("inside testFindingASiteOnGoogle");
		actionwords.iOpenP1("http://www/google.com");
	  System.out.println("after iOpenP1");
	}
}
