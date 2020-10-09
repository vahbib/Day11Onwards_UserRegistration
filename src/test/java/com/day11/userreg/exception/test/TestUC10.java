package com.day11.userreg.exception.test;

import com.day11.userreg.exception.*;
import org.junit.Assert;
import org.junit.Test;

public class TestUC10 {
    UserRegistrationUC1to9 ur = new UserRegistrationUC1to9();

    @Test
    public void fNValidation()  {
            try {
                Assert.assertTrue(ur.firstName("Bibhav"));
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    @Test
    public void lNValidation()  {
        try {
            Assert.assertTrue(ur.lastName("Singh"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void emailValidation()  {
        try {
            Assert.assertTrue(ur.email("singh.bibhav@nitt.edu"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void mobileValidation()  {
        try {
            Assert.assertTrue(ur.mobile("91 8547863241"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void passwordValidation()  {
        try {
            Assert.assertTrue(ur.password("Asadsa@54334"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
