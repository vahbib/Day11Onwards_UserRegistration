package com.day11.userreg.exception;

import javax.print.DocFlavor;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserCase13_LambdaExpression {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CheckPattern firstName = pattern -> pattern.matches("^[A-Z]{1}[a-z]{2,}$") ? true : false;
        CheckPattern lastName = pattern -> pattern.matches("^[A-Z]{1}[a-z]{2,}$") ? true : false;
        CheckPattern email = pattern -> pattern.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*$") ? true : false;
        CheckPattern mobile = pattern -> pattern.matches("^[1-9]{2}\\s{1}[1-9]{1}[0-9]{9}$") ? true : false;
        CheckPattern password = pattern -> pattern.matches("^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$") ? true : false;

        System.out.println("Enter Your Details to Validate, If Valid then 'true' else 'false'");
        System.out.println("Enter First Name: ");
        System.out.println(firstName.validatePattern(sc.nextLine()));
        System.out.println("Enter Last Name: ");
        System.out.println(lastName.validatePattern(sc.nextLine()));
        System.out.println("Enter Email: ");
        System.out.println(email.validatePattern(sc.nextLine()));
        System.out.println("Enter Mobile Number: ");
        System.out.println(mobile.validatePattern(sc.nextLine()));
        System.out.println("Enter Password: ");
        System.out.println(password.validatePattern(sc.nextLine()));

    }

}
@FunctionalInterface
interface CheckPattern {
    public boolean validatePattern(String pattern);
}
