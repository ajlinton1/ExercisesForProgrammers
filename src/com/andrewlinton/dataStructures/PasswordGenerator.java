package com.andrewlinton.dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class PasswordGenerator {

    char[] specialChars = {'!','@','#','$','%','^','&','*','(',')'};
    char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
    List<Character> specialCharacters;

    public PasswordGenerator() {
        specialCharacters = new ArrayList<Character>();
        for (int i=0;i<specialChars.length;i++) {
            specialCharacters.add(new Character(specialChars[i]));
        }
    }

    Character getChar() {
        return new Character('z');
    }

    public List<Character> getSpecialChars(int num) {
        List<Character> ret = specialCharacters.stream().limit(num).collect(Collectors.toList());
        return ret;
    }

    public String generatePassword(int minLength, int numSpecialChars, int numNumbers) {
        Character[] password = new Character[minLength];

        for (int i=0;i<numSpecialChars;i++) {
            int charChoice = (int)(Math.random()*specialChars.length);
            int pos = getUnusedRand(minLength, password);
            password[pos] = new Character(specialChars[charChoice]);
        }

        for (int i=0;i<numNumbers;i++) {
            int charChoice = (int)(Math.random()*numbers.length);
            int pos = getUnusedRand(minLength, password);
            password[pos] = new Character(numbers[charChoice]);
        }

        int letterLow = (int)'A';
        int letterHigh = (int)'z';
        int letterRange = letterHigh - letterLow + 1;

        for (int i=0;i<password.length;i++) {
            if (password[i]==null) {
                int charValue = (int)(Math.random()*letterRange) + letterLow;
                char c = (char)charValue;
                password[i] = new Character(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character c: password) {
            sb.append(c.charValue());
        }

        return sb.toString();
    }

    public int getUnusedRand(int length, Character[] array) {
        int pos = (int)(Math.random()*length);
        int ret = pos;
        while (true) {
            if (array[ret]==null) {
                return ret;
            } else {
                ret++;
            }
            if (ret==length) {
                ret = 0;
            }
            if (ret==pos) {
                throw new RuntimeException("Loop");
            }
        }
    }

}
