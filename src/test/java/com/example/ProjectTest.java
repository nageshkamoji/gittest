package com.example;

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
