package com.andrewlinton.functions;

import org.junit.*;

public class TestAnagramChecker {

    @Test
    public void testAnagramChecker() {
        String s1 = "note";
        String s2 = "tone";
        boolean expected = true;
        AnagramChecker anagramChecker = new AnagramChecker();
        boolean result = anagramChecker.isAnagram(s1,s2);
        Assert.assertEquals(expected,result);
    }

    @Test
    public void testAnagramChecker1() {
        String s1 = "note";
        String s2 = "toxe";
        boolean expected = false;
        AnagramChecker anagramChecker = new AnagramChecker();
        boolean result = anagramChecker.isAnagram(s1,s2);
        Assert.assertEquals(expected,result);
    }

    @Test
    public void testAnagramChecker2() {
        String s1 = "note";
        String s2 = "no";
        boolean expected = false;
        AnagramChecker anagramChecker = new AnagramChecker();
        boolean result = anagramChecker.isAnagram(s1,s2);
        Assert.assertEquals(expected,result);
    }

}
