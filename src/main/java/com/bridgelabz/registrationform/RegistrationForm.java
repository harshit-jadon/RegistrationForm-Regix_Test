package com.bridgelabz.registrationform;
import com.bridgelabz.exception.RegistrationFormException;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationForm {

        IValidateLambda validatedetails = ((input, regEx) -> {
            Pattern compiler = Pattern.compile(regEx);
            Matcher matcher = compiler.matcher(input);
            boolean matches = matcher.matches();
            return matcher.matches();
        });

        public static void main (String[]args) {
            System.out.println("------------------Welcome to Registration form------------------\n       Enter Your Details Correct");
            RegistrationForm registrationForm = new RegistrationForm();
            Scanner scanner = new Scanner(System.in);
            String response;
            do {
                System.out.println("Press 1 to enter First Name");
                System.out.println("Press 2 to enter Last Name");
                System.out.println("Press 3 to enter Email");
                System.out.println("Press 4 to enter Mobile No");
                System.out.println("Press 5 to enter Password");
                System.out.println("Press 6 to enter All Emails");
                System.out.println("Press 7 to enter Exit");
                response = scanner.next();
                String regExp;
                switch (response) {
                    case "1":
                        System.out.println("Enter your First Name");
                        String first_name = scanner.next();
                         regExp = "^[A-Z][a-z]{2,}";
                        System.out.println(registrationForm.validatedetails.validateInput(first_name,regExp));
                        break;
                    case "2":
                        System.out.println("Enter Last Name");
                        String last_name = scanner.next();
                         regExp = "^[A-Z][a-z]{2,}";
                        System.out.println(registrationForm.validatedetails.validateInput(last_name,regExp));
                        break;
                    case "3":
                        System.out.println("Enter Email");
                        String e_mail = scanner.next();
                         regExp = "^[A-Za-z0-9-\\+]+(\\.[A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+?(\\.[A-Za-z0-9]+)?(\\.[A-Za-z]{2,})$";
                        System.out.println(registrationForm.validatedetails.validateInput(e_mail,regExp));
                        break;
                    case "4":
                        System.out.println("Enter Phone No");
                        String phone_no = scanner.next();
                         regExp = "\\d{2} \\d{10}";
                        System.out.println(registrationForm.validatedetails.validateInput(phone_no,regExp));
                        break;
                    case "5":
                        System.out.println("Enter Password");
                        String password = scanner.next();
                         regExp = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])(?=.*[!@#$%^&*()_+=-?<>,.:]).{8,}$";
                        System.out.println(registrationForm.validatedetails.validateInput(password,regExp));
                        break;

                    default:
                        break;
                }
            } while (response != "6");
        }
    }

