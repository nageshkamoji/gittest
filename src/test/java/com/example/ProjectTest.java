package com.example;

import junit.framework.TestCase;

public class ProjectTest extends TestCase 
{

    Actionwords actionwords = new Actionwords();

    public void testFindingASiteOnGoogle() 
	{
        actionwords.iOpenP1("http://google.com");
        actionwords.iSearchForP1("Hiptest");
       actionwords.aLinkToP1IsShownInTheResults("Hiptest - Agile test management tool");
     }
}
