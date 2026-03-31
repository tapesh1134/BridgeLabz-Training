package org.junitpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Password1"));
    }

    @Test
    void testPasswordTooShort() {
        assertFalse(validator.isValid("Pass1"));
    }

    @Test
    void testNoUppercaseLetter() {
        assertFalse(validator.isValid("password1"));
    }

    @Test
    void testNoDigit() {
        assertFalse(validator.isValid("Password"));
    }

    @Test
    void testNullPassword() {
        assertFalse(validator.isValid(null));
    }
}
