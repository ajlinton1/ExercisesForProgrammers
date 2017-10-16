package com.andrewlinton.functions;

public class PasswordStrengthIndicator {

    public PasswordStrength passwordValidator(String password) {
        PasswordStrength ret = null;

        int numbers = 0;
        int letters =0;
        int special = 0;

        for (int i=0;i<password.length();i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                numbers++;
            } else if (Character.isLetter(c)) {
                letters++;
            } else {
                special++;
            }
        }

        if (password.length()<8) {
            if (numbers>0 && letters==0) {
                ret = PasswordStrength.VERY_WEAK;
            }
            if (letters>0 && numbers==0 ) {
                ret = PasswordStrength.WEAK;
            }
        } else {
            if (letters>1 && numbers>0) {
                ret = PasswordStrength.STRONG;
            }
            if (letters>0 && numbers>0 && special>0) {
                ret = PasswordStrength.VERY_STRONG;
            }
        }

        return ret;
    }



    public enum PasswordStrength {
        VERY_STRONG,STRONG,WEAK,VERY_WEAK
    }
}

