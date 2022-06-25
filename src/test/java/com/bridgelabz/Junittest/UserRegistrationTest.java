package com.bridgelabz.Junittest;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistrationTest userRegistration = new UserRegistrationTest();
        boolean result = userRegistration.validateFirstName("sarfaraz");
        Assert.assertTrue(result);
    }

    private boolean validateFirstName(String sarfaraz) {
        return false;
    }


    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistrationTest userRegistration = new UserRegistrationTest();
        boolean result = userRegistration.validateFirstName("khan");
        Assert.assertTrue(result);
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistrationTest userRegistration = new UserRegistrationTest();
        boolean result = userRegistration.validateFirstName("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }
}

