package com.bridge.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserOperator {
    public void firstName(String firstName) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        boolean valid = matcher.matches();
        if (valid == true) {
            System.out.println("Your name" + firstName + "is valid");
        } else {
            System.out.println("Your name" + firstName + "is Invalid");
        }
    }

    public void lastName(String lastName) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        boolean valid = matcher.matches();
        if (valid == true) {
            System.out.println("Your Last name " + lastName + " is Valid");
        } else {
            System.out.println("Your Last name " + lastName + " is Invalid");
        }
    }

    public void emailAddress(String emailAddress) {
        String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailAddress);
        boolean valid = matcher.matches();
        if (valid == true) {
            System.out.println("Email Address is" + emailAddress + "valid");
        } else
            System.out.println("Email Address is" + emailAddress + "Not valid");
    }

    public void phoneNo(String phoneNo) {
        String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNo);
        boolean valid = matcher.matches();
        if (valid == true) {
            System.out.println("Your Phone Number " + phoneNo + " is Valid");
        } else {
            System.out.println("Your Phone Number " + phoneNo + " is Invalid");
        }
    }
    public void passRule1(String passRule1) {
        String regex = "^[0-9a-zA-Z]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passRule1);
        boolean valid = matcher.matches();
        if (valid == true) {
            System.out.println("Your Passward " + passRule1 + " is Valid");
        } else {
            System.out.println("Your Passward " + passRule1 + " is Invalid");
        }
    }
    public void passWordRule2(String passWordRule2) {
        //String regex = "^[0-9a-zA-Z]{8,}$";
        String regex = "^(?=.*[A-Z]){1}(?=.*[a-z]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passWordRule2);
        boolean valid = matcher.matches();
        if (valid == true) {
            System.out.println("Your Passward " + passWordRule2 + " is Valid");
        } else {
            System.out.println("Your Passward " + passWordRule2 + " is Invalid");
        }
    }
    public void passwordRule3(String passwordRule3) {
        String regex = "^(?=.*[A-Z]){1}(?=.*[a-z])(?=.*[0-9]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordRule3);
        boolean valid = matcher.matches();
        if (valid == true) {
            System.out.println("Your Passward " + passwordRule3 + " is Valid");
        } else {
            System.out.println("Your Passward " + passwordRule3 + " is Invalid");
        }
    }
}
