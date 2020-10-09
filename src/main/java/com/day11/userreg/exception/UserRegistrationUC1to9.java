package com.day11.userreg.exception;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationUC1to9 {
    // UC1 - First name starts with Cap and has minimum 3 characters
    public boolean firstName(String fN) {
        return (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", fN) == true);
    }

    // UC2 - Last name starts with Cap and has minimum 3 characters
    public boolean lastName(String lN) {
        return (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lN) == true);
    }

    /*
     * UC 3 - enter a valid email
     * UC 9 - Cleared All Sample Provided
     */
    public boolean email(String emailId) {
        return (Pattern.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*$", emailId) == true);
    }

    // UC4 - Mobile Format
    public boolean mobile(String mobileNum) {
        return(Pattern.matches("^[1-9]{2}\\s{1}[1-9]{1}[0-9]{9}$", mobileNum) == true);
    }

    // UC 5 to 8 - Password
    public boolean password(String pass) {
        return (Pattern.matches("^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,}$", pass) == true);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");
        Scanner scanner = new Scanner(System.in);
        UserRegistrationUC1to9 ur = new UserRegistrationUC1to9();
        System.out.println("First Name: "+ ur.firstName(scanner.nextLine()));
        System.out.println("Last Name: "+ ur.lastName(scanner.nextLine()));
        System.out.println("EmailId: "+ ur.email(scanner.nextLine()));
        System.out.println("Mobile Number: "+ ur.mobile(scanner.nextLine()));
        System.out.println("Password: "+ ur.password(scanner.nextLine()));
    }
}
