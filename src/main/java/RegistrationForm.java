import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationForm {
    boolean validateFirstName(String first_name){
        String regExp = "^[A-Z][a-zA-Z0-9]{2,}";
        Pattern compiler = Pattern.compile(regExp);
        Matcher matcher = compiler.matcher(first_name);
        boolean matches = matcher.matches();
        System.out.println(matches);
        return matcher.matches();
    }
    boolean validateLastName(String last_name){
        String regExp = "^[A-Z][a-zA-Z0-9]{2,}";
        Pattern compiler = Pattern.compile(regExp);
        Matcher matcher = compiler.matcher(last_name);
        boolean matches = matcher.matches();
        System.out.println(matches);
        return matcher.matches();
    }
    boolean validateEMail(String e_mail){
        String regEx = "^[A-Za-z0-9-\\\\+]+(\\\\.[A-Za-z0-9-]+)*@\" + \"[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$";
        Pattern compiler = Pattern.compile(regEx);
        Matcher matcher = compiler.matcher(e_mail);
        boolean matches = matcher.matches();
        System.out.println(matches);
        return matcher.matches();
    }
    boolean validatePhoneNo(String phone_no){
        String regExp = "\\d{2} \\d{10}";
        Pattern compiler = Pattern.compile(regExp);
        Matcher matcher = compiler.matcher(phone_no);
        boolean matches = matcher.matches();
        System.out.println(matches);
        return matcher.matches();
    }
    boolean validatePassword(String password) {
        String regExp = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])(?=.*[!@#$%^&*()_+=-?<>,.:]).{8,}$";
        Pattern compiler = Pattern.compile(regExp);
        Matcher matcher = compiler.matcher(password);
        boolean matches = matcher.matches();
        System.out.println(matches);
        return matcher.matches();
    }
    public static void main(String[] args){
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
            switch (response) {
                case "1":
                    System.out.println("Enter your First Name");
                    String first_name = scanner.next();
                    registrationForm.validateFirstName(first_name);
                    break;
                case "2":
                    System.out.println("Enter Last Name");
                    String last_name = scanner.next();
                    registrationForm.validateLastName(last_name);
                    break;
                case "3":
                    System.out.println("Enter Email");
                    String e_mail = scanner.next();
                    registrationForm.validateEMail(e_mail);
                    break;
                case "4":
                    System.out.println("Enter Phone No");
                    String phone_no = scanner.next();
                    registrationForm.validatePhoneNo(phone_no);
                    break;
                case "5":
                    System.out.println("Enter Password");
                    String password = scanner.next();
                    registrationForm.validatePassword(password);
                    break;
                case "6":
                    System.out.println("All EMAILS will be Validate");
                    ArrayList<String> allEmailValidation = new ArrayList<>();
                    allEmailValidation.add("abc@yahoo.com");
                    allEmailValidation.add("abc-100@yahoo.com");
                    allEmailValidation.add("abc.100@yahoo.com");
                    allEmailValidation.add("abc111@abc.com");
                    allEmailValidation.add("abc-100@abc.net");
                    allEmailValidation.add("abc.100@abc.com.au");
                    allEmailValidation.add("abc@1.com,");
                    allEmailValidation.add("abc@gmail.com.com");
                    allEmailValidation.add("abc+100@gmail.com");
                    String regEx = "^[A-Za-z0-9-\\\\+]+(\\\\.[A-Za-z0-9-]+)*@\" + \"[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$";
                    Pattern compiler = Pattern.compile(regEx);
                    for (String matches : allEmailValidation) {
                        Matcher matcher = compiler.matcher(matches);
                        System.out.println(matches + "--" + matcher.matches());
                    }
                    break;
                default:
                    break;
            }
        }while(response != "7");
    }
}
