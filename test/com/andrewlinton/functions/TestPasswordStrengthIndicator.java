package com.andrewlinton.functions;

import org.junit.*;

public class TestPasswordStrengthIndicator {

    @Test
    public void testPasswordStrength() {
        String password = "12345";
        PasswordStrengthIndicator.PasswordStrength expected = PasswordStrengthIndicator.PasswordStrength.VERY_WEAK;

        PasswordStrengthIndicator passwordStrengthIndicator = new PasswordStrengthIndicator();
        PasswordStrengthIndicator.PasswordStrength result = passwordStrengthIndicator.passwordValidator(password);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testPasswordStrength1() {
        String password = "abcdef";
        PasswordStrengthIndicator.PasswordStrength expected = PasswordStrengthIndicator.PasswordStrength.WEAK;

        PasswordStrengthIndicator passwordStrengthIndicator = new PasswordStrengthIndicator();
        PasswordStrengthIndicator.PasswordStrength result = passwordStrengthIndicator.passwordValidator(password);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testPasswordStrength2() {
        String password = "abc123xyz";
        PasswordStrengthIndicator.PasswordStrength expected = PasswordStrengthIndicator.PasswordStrength.STRONG;

        PasswordStrengthIndicator passwordStrengthIndicator = new PasswordStrengthIndicator();
        PasswordStrengthIndicator.PasswordStrength result = passwordStrengthIndicator.passwordValidator(password);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testPasswordStrength3() {
        String password = "1337h@xor!";
        PasswordStrengthIndicator.PasswordStrength expected = PasswordStrengthIndicator.PasswordStrength.VERY_STRONG;

        PasswordStrengthIndicator passwordStrengthIndicator = new PasswordStrengthIndicator();
        PasswordStrengthIndicator.PasswordStrength result = passwordStrengthIndicator.passwordValidator(password);
        Assert.assertEquals(expected, result);
    }

}
