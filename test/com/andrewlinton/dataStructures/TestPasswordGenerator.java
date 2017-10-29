package com.andrewlinton.dataStructures;

import org.junit.*;

import java.util.List;

public class TestPasswordGenerator {

    @Test
    public void testGeneratePassword() {
        int minLength = 8;
        int numSpecialChars = 2;
        int numNumbers = 2;
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        String result = passwordGenerator.generatePassword(minLength, numSpecialChars, numNumbers);
        System.out.println(result);
    }

    @Test
    public void testGetSpecialChars() {
        int num = 3;
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        List<Character> result = passwordGenerator.getSpecialChars(3);
        Assert.assertNotNull(result);
    }

}

