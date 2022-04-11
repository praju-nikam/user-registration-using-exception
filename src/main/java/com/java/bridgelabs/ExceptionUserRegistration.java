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

    public static void main(String[] args) throws InputInvalidException {
      ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();
      exceptionUserRegistration.testFirstName("Prajakta");

    }
}

