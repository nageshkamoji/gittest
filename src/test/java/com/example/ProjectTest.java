package com.example;

import junit.framework.TestCase;

public class ProjectTest extends TestCase {

     public void testGoogle() {
        System.out.println("inside testGoogle");
        
          Actionwords action1 = new Actionwords();
            System.out.println(action1);
        
          action1.iOpenP1("http://www/google.com");
          // When I search for "Hiptest"
          action1.iSearchForP1("Hiptest");
          
    }
}
