package com.bridge.regex;
public class RegexUserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome to user registration problem using regex");
        UserOperator uop=new UserOperator();
        uop.firstName("Sangeeta");
        uop.lastName("Math");
        uop.emailAddress("sang123@gmail.com");
        uop.phoneNo("91 9876453625");
        uop.passWordRule2("Sang1234");
    }
}
