package com.bridgelabz.Junittest;
import com.bridgelabz.Junit.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("Praju");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateLastName("Hanasi");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateEmail("praju@123");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenNotMatched_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateMobileNumber("8765343900");
        Assert.assertTrue(result);
    }


    @Test
    public void givenRule1_WhenNotMatched_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateRule1("paayyvvtt6@gbvh8");
        Assert.assertTrue(result);
    }

    @Test
    public void givenRule2_WhenNotMatched_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateRule2("paayyvvtt6@gbvh8");
        Assert.assertTrue(result);
    }
    @Test
    public void givenRule3_WhenNotMatched_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateRule3("paayyvvtt6@gbvh8");
        Assert.assertTrue(result);
    }
    @Test
    public void givenRule4_WhenNotMatched_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateRule4("paayyvvtt6@gbvh8");
        Assert.assertTrue(result);
    }
}

