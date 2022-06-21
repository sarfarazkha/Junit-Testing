package com.bridgelabz.Junittest;
import com.bridgelabz.Junit.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("sarfaraz");
        Assert.assertTrue(result);
    }
}

