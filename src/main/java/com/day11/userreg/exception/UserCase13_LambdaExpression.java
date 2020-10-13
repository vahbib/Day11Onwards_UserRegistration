package com.day11.userreg.exception;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserCase13_LambdaExpression {

        static Scanner sc = new Scanner(System.in);

        public static boolean CheckFName(String fName) throws FNameException {
            CheckPattern firstName = (fNPatt) -> Pattern.matches("^[A-Z]{1}[a-z]{2,}$", fName);
            if (firstName.validatePattern(fName)) {
                System.out.println("Valid");
                return true;
            } else {
                throw new FNameException("Invalid - First Name Exception");
            }
        }
        public static boolean CheckLName(String lName) throws LNameException {
            CheckPattern lastName = (lNPatt) -> Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lName);
            if (lastName.validatePattern(lName)) {
                System.out.println("Valid");
                return true;
            } else {
                throw new LNameException("Invalid - Last Name Exception");
            }
        }
        public static boolean CheckEmail(String email) throws EMailException {
            CheckPattern eMail = (emailPatt) -> Pattern.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*$", email);
            if (eMail.validatePattern(email)) {
                System.out.println("Valid");
                return true;
            } else {
                throw new EMailException("Invalid - Email Exception");
            }
        }

        public static boolean CheckMobile(String mob) throws MobileException {
            CheckPattern mobile = (mobPatt) -> Pattern.matches("^[1-9]{2}\\s{1}[1-9]{1}[0-9]{9}$", mob);
            if (mobile.validatePattern(mob)) {
                System.out.println("Valid");
                return true;
            } else {
                throw new MobileException("Invalid - Mobile Exception");
            }
        }
        public static boolean CheckPass(String pass) throws PassException {
            CheckPattern password = (passPatt) -> Pattern.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\\s)[a-zA-Z0-9]*[^a-zA-Z0-9\\s]{1}[a-zA-Z0-9]*$", pass);
            if (password.validatePattern(pass)) {
                System.out.println("Valid");
                return true;
            } else {
                throw new PassException("Invalid - Password Exception");
            }
        }

        public static void main(String[] args) throws FNameException, LNameException, EMailException, MobileException, PassException {
            UserCase13_LambdaExpression lambda = new UserCase13_LambdaExpression();

            System.out.print("Enter First Name: "); lambda.CheckFName(sc.nextLine());
            System.out.print("\nEnter Last Name: ");  lambda.CheckLName(sc.nextLine());
            System.out.print("\nEnter Email: "); lambda.CheckEmail(sc.nextLine());
            System.out.print("\nEnter Mobile Number: "); lambda.CheckMobile(sc.nextLine());
            System.out.print("\nEnter Password: "); lambda.CheckPass(sc.nextLine());
        }
}
@FunctionalInterface
interface CheckPattern {
    boolean validatePattern(String pattern);
}
