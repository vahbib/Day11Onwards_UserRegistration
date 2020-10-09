package com.day11.userreg.exception.test;

import com.day11.userreg.exception.UserRegistrationUC1to9;
import org.junit.*;

public class TestUC10 {
        UserRegistrationUC1to9 ur = new UserRegistrationUC1to9();

        @Test
        public void fNValidation() {
            Assert.assertTrue(ur.firstName("Bibhav"));
        }
        @Test
        public void lNValidation() {
            Assert.assertTrue(ur.lastName("Singh"));
        }
        @Test
        public void emailValidation() {
            Assert.assertTrue(ur.email("singh.bibhav@nitt.edu"));
        }
        @Test
        public void mobileValidation() {
            Assert.assertTrue(ur.mobile("91 8547863241"));
        }
        @Test
        public void passwordValidation() {
            Assert.assertTrue(ur.password("Asadsa@54334"));
        }
}
