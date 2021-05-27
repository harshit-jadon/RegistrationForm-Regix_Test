import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RegexTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("Enter successfully for Test ");
    }
    @AfterAll
    static void afterAll() {
        System.out.println("Test Done");
    }


    @Test
    void firstNameWithCaptAndMin3Char(){
        boolean result = new RegistrationForm().validateFirstName("Harshit");
        Assertions.assertEquals(true,result);
    }

    @Test
    void lastNameWithCaptAnd3Char(){
        boolean result = new RegistrationForm().validateLastName("Jadon");
                Assertions.assertEquals(true,result);
//                Assertions.assertTrue(result);
    }

    @Test
    void eMailwithValidSyntax() {
        boolean result = new RegistrationForm().validateEMail("abc.xyz@bl.co.in");
        Assertions.assertEquals(true,result);
    }
    @Test
    void mobileNoWithSpace() {
        boolean result = new RegistrationForm().validatePhoneNo("91 9411411513");
        Assertions.assertEquals(true, result);
    }
    @Test
    void passwordWith1UC1No1SC(){
        boolean result = new RegistrationForm().validatePassword("Harshit@12");
        Assertions.assertEquals(true,result);

    }
}
