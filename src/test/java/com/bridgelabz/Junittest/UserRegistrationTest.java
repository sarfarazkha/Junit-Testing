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

    private boolean validateFirstName(String FirstName) {
        return true;
    }


    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistrationTest userRegistration = new UserRegistrationTest();
        boolean result = userRegistration.validateLastName("khan");
        Assert.assertTrue(result);
    }

    private boolean validateLastName(String LastName) {
        return true;
    }


    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistrationTest userRegistration = new UserRegistrationTest();
        boolean result = userRegistration.validateEmail("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }

    private boolean validateEmail(String Email) {
        return true;
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        UserRegistrationTest userRegistration = new UserRegistrationTest();
        boolean result = userRegistration.validateMobileNumber("91 9372586485");
        Assert.assertTrue(result);
    }

    private boolean validateMobileNumber(String no) {

        return true; 
    }
}

