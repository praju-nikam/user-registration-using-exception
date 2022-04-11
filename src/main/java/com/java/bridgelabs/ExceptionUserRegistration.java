package com.java.bridgelabs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Program on User Registration Using Exception
 *
 * @author : Prajakta
 * @since : 11/04/2022
 * */
public class ExceptionUserRegistration
{
    /*
        validating first name
    */
    public boolean firstName(String str) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public boolean testFirstName(String firstName) throws InputInvalidException {
        try {
            if (!firstName(firstName)) {
                throw new InputInvalidException("Entered FirstName is Invalid\n" +
                        "First name starts with Capital Letter and has\n" +
                        "minimum 3 characters");
            } else {
                System.out.println("Entered First Name is Valid");
            }
        } catch (InputInvalidException e) {
            System.out.println("Exception is Occurred" + e);
        }
        return firstName(firstName);
    }

    // validating last name
    public boolean lastName (String str){
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public boolean testLastName(String lastName) throws InputInvalidException {
        try {
            if (!lastName(lastName)) {
                throw new InputInvalidException("Entered LastName is Invalid\n" +
                        "Last name starts with Capital Letter and has\n" +
                        "minimum 3 characters");
            } else {
                System.out.println("Entered LastName is Valid");
            }
        } catch (InputInvalidException e) {
            System.out.println("Exception is Occurred" + e);
        }
        return lastName(lastName);
    }
    // validating email
    public boolean email(String str) {
        Pattern pattern = Pattern.compile("^[a-zA-Z-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public boolean testEmailId(String emailId) throws InputInvalidException {
        try {
            if (!email(emailId)) {
                throw new InputInvalidException("Entered EmailId is Invalid");
            } else {
                System.out.println("Entered EmailId is Valid");
            }
        } catch (InputInvalidException e) {
            System.out.println("Exception is Occurred" + e);
        }
        return email(emailId);
    }

    //validating phone number
    public boolean phoneNumber(String str) {
        Pattern pattern = Pattern.compile("^(\\+?\\d{2}?\\s{1})?(\\d{10})$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public boolean testMobileNumber(String mobileNumber) throws InputInvalidException {
        try {
            if (!phoneNumber(mobileNumber)) {
                throw new InputInvalidException("Entered MobileNumber is Invalid\n" +
                        "Mobile Number Must Contain Country Code");
            } else {
                System.out.println("Entered MobileNumber is Valid\n");
            }
        } catch (InputInvalidException e) {
            System.out.println("Exception is Occurred" + e);
        }
        return phoneNumber(mobileNumber);
    }

    //validating password
    public boolean password(String str) {
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])([a-zA-Z0-9@$!%*#?&]){8,}$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public boolean testPassword(String password) throws InputInvalidException {
        try {
            if (!password(password)) {
                throw new InputInvalidException("Entered Password is Invalid\n" +
                        "Password Must Contain at least\n" +
                        "one Uppercase, one Numeric, one Special Char\n" +
                        "and minimum 8 Characters ");
            } else {
                System.out.println("Entered Password is Valid");
            }
        } catch (InputInvalidException e) {
            System.out.println("Exception is Occurred" + e);
        }
        return password(password);
    }

    public static void main(String[] args) throws InputInvalidException {
      ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();
      exceptionUserRegistration.testFirstName("Prajakta");
      exceptionUserRegistration.testLastName("Nikam");
      exceptionUserRegistration.testEmailId("prajuN210@gmail.com");
      exceptionUserRegistration.testMobileNumber("9960224670");
      exceptionUserRegistration.testPassword("Praju@12345");
    }
}

