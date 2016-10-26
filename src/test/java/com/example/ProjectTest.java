package com.example;

import junit.framework.TestCase;

public class ProjectTest extends TestCase {

    public Actionwords actionwords = new Actionwords();

    public void testFindingASiteOnGoogle() {
        // Given  I open "http://www/google.com"
        actionwords.iOpenP1("http://www/google.com");
        // When I search for "Hiptest"
        actionwords.iSearchForP1("Hiptest");
        // Then a link to "Hiptest" agile management tool will open
        //actionwords.aLinkToP1AgileManagementToolWillOpen("Hiptest");
    }
}
