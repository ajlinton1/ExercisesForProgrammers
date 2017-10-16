package com.andrewlinton.functions;

public class AnagramChecker {

    public boolean isAnagram(String s1, String s2){
        if (s1.length()!=s2.length()) {
            return false;
        }

        for (int p1=0;p1<s1.length();p1++) {
            boolean exists = false;
            for (int p2=0;p2<s2.length();p2++) {
                if (s1.charAt(p1)==s2.charAt(p2)) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                return false;
            }
        }

        return true;
    }
}
