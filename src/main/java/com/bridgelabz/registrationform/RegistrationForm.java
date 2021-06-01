package com.bridgelabz.registrationform;
import com.bridgelabz.exception.RegistrationFormException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationForm {

    public boolean validatefirstName(String first_name) throws RegistrationFormException {
        String regExp = "^[A-Z][a-z]{2,}";
        try{
            if(first_name.length() == 0)
                throw new RegistrationFormException(RegistrationFormException.exceptionType.Entered_Empty, "Empty is not allowed");
            if(first_name == null)
                throw new RegistrationFormException(RegistrationFormException.exceptionType.Entered_Null,"Null is Not Allowed");
            if(first_name.length()<3)
                throw new RegistrationFormException(RegistrationFormException.exceptionType.Entered_Short,"Minimum length should be 3");
             Pattern compiler = Pattern.compile(regExp);
             if(compiler.matcher(first_name).matches())
                 return true;
             else
                 throw new RegistrationFormException(RegistrationFormException.exceptionType.Entered_Invalid,"Please enter valid Full Name");
        }
        catch(RegistrationFormException e){
            e.printStackTrace();
            return false;

        }
    }
    public boolean validateLastName(String last_name) throws RegistrationFormException {
        String regExp = "^[A-Z][a-z]{2,}";
        try {
            if (last_name.length() == 0)
                throw new RegistrationFormException(RegistrationFormException.exceptionType.Entered_Empty, "Empty is not not allowed");
            if (last_name == null)
                throw new RegistrationFormException(RegistrationFormException.exceptionType.Entered_Null, "Null is not allowed");
            if (last_name.length() < 3)
                throw new RegistrationFormException(RegistrationFormException.exceptionType.Entered_Short, "Minimum length should be 3");
            Pattern compiler = Pattern.compile(regExp);
            if (compiler.matcher(last_name).matches())
                return true;
            else
                throw new RegistrationFormException(RegistrationFormException.exceptionType.Entered_Invalid, "last name is invalid");
        } catch (RegistrationFormException e) {
            e.printStackTrace();
            return false;

        }
    }
    public boolean validateEMail(String e_mail) throws RegistrationFormException {
        String regExp = "^[A-Za-z0-9-\\+]+(\\.[A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+?(\\.[A-Za-z0-9]+)?(\\.[A-Za-z]{2,})$";
        Pattern compiler = Pattern.compile(regExp);
        Matcher matcher = compiler.matcher(e_mail);
        try {
            if (matcher.matches())
                return true;
            else
                throw new RegistrationFormException(RegistrationFormException.exceptionType.Entered_Invalid, "e-mail is invalid ");
        }
        catch(RegistrationFormException e){
            e.printStackTrace();
            return false;
        }

    }
    public boolean validatePhoneNo(String phone_no) throws RegistrationFormException {
        String regExp = "\\d{2} \\d{10}";
        Pattern compiler = Pattern.compile(regExp);
        try {
            if (compiler.matcher(phone_no).matches())
                return true;
            else
                throw new RegistrationFormException(RegistrationFormException.exceptionType.Entered_Invalid, "Phone no is invalid ");
        }
        catch(RegistrationFormException e){
            e.printStackTrace();
            return false;
        }

    }
    public boolean validatePassword(String password) throws RegistrationFormException {
        String regExp = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])(?=.*[!@#$%^&*()_+=-?<>,.:]).{8,}$";
        Pattern compiler = Pattern.compile(regExp);
        try {
            if(password.length()<8)
                throw new RegistrationFormException(RegistrationFormException.exceptionType.Entered_Short,"Password is too short ");
            if (compiler.matcher(password).matches())
                return true;
            else
                throw new RegistrationFormException(RegistrationFormException.exceptionType.Entered_Invalid, "Password is invalid ");
        }
        catch(RegistrationFormException e){
            e.printStackTrace();
            return false;
        }
    }

//    public static void main(String[] args) throws RegistrationFormException {
//        System.out.println("------------------Welcome to Registration form------------------\n       Enter Your Details Correct");
//        RegistrationForm registrationForm = new RegistrationForm();
//        Scanner scanner = new Scanner(System.in);
//        String response;
//        do {
//            System.out.println("Press 1 to enter First Name");
//            System.out.println("Press 2 to enter Last Name");
//            System.out.println("Press 3 to enter Email");
//            System.out.println("Press 4 to enter Mobile No");
//            System.out.println("Press 5 to enter Password");
//            System.out.println("Press 6 to enter All Emails");
//            System.out.println("Press 7 to enter Exit");
//            response = scanner.next();
//            switch (response) {
//                case "1":
//                    System.out.println("Enter your First Name");
//                    String first_name = scanner.next();
//                    registrationForm.validateFirstName(first_name);
//                    break;
//                case "2":
//                    System.out.println("Enter Last Name");
//                    String last_name = scanner.next();
//                    registrationForm.validateLastName(last_name);
//                    break;
//                case "3":
//                    System.out.println("Enter Email");
//                    String e_mail = scanner.next();
//                    registrationForm.validateEMail(e_mail);
//                    break;
//                case "4":
//                    System.out.println("Enter Phone No");
//                    String phone_no = scanner.next();
//                    registrationForm.validatePhoneNo(phone_no);
//                    break;
//                case "5":
//                    System.out.println("Enter Password");
//                    String password = scanner.next();
//                    registrationForm.validatePassword(password);
//                    break;
//                case "6":
//                    System.out.println("All EMAILS will be Validate");
//                    ArrayList<String> allEmailValidation = new ArrayList<>();
//                    allEmailValidation.add("abc@yahoo.com");
//                    allEmailValidation.add("abc-100@yahoo.com");
//                    allEmailValidation.add("abc.100@yahoo.com");
//                    allEmailValidation.add("abc111@abc.com");
//                    allEmailValidation.add("abc-100@abc.net");
//                    allEmailValidation.add("abc.100@abc.com.au");
//                    allEmailValidation.add("abc@1.com,");
//                    allEmailValidation.add("abc@gmail.com.com");
//                    allEmailValidation.add("abc+100@gmail.com");
//                    String regEx = "^[A-Za-z0-9-\\\\+]+(\\\\.[A-Za-z0-9-]+)*@\" + \"[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$";
//                    Pattern compiler = Pattern.compile(regEx);
//                    for (String matches : allEmailValidation) {
//                        Matcher matcher = compiler.matcher(matches);
//                        System.out.println(matches + "--" + matcher.matches());
//                    }
//                    break;
//                default:
//                    break;
//            }
//        }while(response != "7");
//    }
}
