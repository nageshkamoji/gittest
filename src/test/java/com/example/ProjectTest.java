package com.example;

import junit.framework.TestCase;

public class ProjectTest extends TestCase {

    Actionwords action = new Actionwords();

    public void testGoogle() {
        System.out.println("inside testGoogle");
        
        if (action != null)
        {
            // Given  I open "http://www/google.com"
            action.iOpenP1("http://www/google.com");
            // When I search for "Hiptest"
            action.iSearchForP1("Hiptest");
        }
        else
        {
          Actionwords action1 = new Actionwords();
          action1.iOpenP1("http://www/google.com");
          // When I search for "Hiptest"
          action1.iSearchForP1("Hiptest");
            
        }
        
    }
}
