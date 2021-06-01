package com.bridgelabz.junittest;

import com.bridgelabz.exception.RegistrationFormException;
import com.bridgelabz.registrationform.RegistrationForm;
import org.junit.Assert;
import org.junit.Test;

public class registrationJUnitTest {
    @Test
    public void firstName_whenProper_giventrue() throws RegistrationFormException {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validatefirstName("Harshit");
        Assert.assertTrue(result);
    }

    @Test
    public void firstName_whenEmpty_throwException_Empty() {
        RegistrationForm registrationForm = new RegistrationForm();
        try {
            registrationForm.validatefirstName("");
        } catch (RegistrationFormException e) {
            Assert.assertEquals(RegistrationFormException.exceptionType.Entered_Empty, e.type);
        }
    }

    @Test
    public void firstName_whenNull_throwException_Empty() {
        RegistrationForm registrationForm = new RegistrationForm();
        try {
            registrationForm.validatefirstName(null);
        } catch (RegistrationFormException e) {
            Assert.assertEquals(RegistrationFormException.exceptionType.Entered_Null, e.type);
        }
    }

    @Test
    public void firstName_whenlessthan3_throwException_short() {
        RegistrationForm registrationForm = new RegistrationForm();
        try {
            registrationForm.validatefirstName("ha");
        } catch (RegistrationFormException e) {
            Assert.assertEquals(RegistrationFormException.exceptionType.Entered_Short, e.type);
        }
    }

    @Test
    public void firstName_whenInvalid_throwException_invalid() {
        RegistrationForm registrationForm = new RegistrationForm();
        try {
            registrationForm.validatefirstName("hA21t");
        } catch (RegistrationFormException e) {
            Assert.assertEquals(RegistrationFormException.exceptionType.Entered_Invalid, e.type);
        }
    }

    @Test
    public void lastName_whenProper_giventrue() throws RegistrationFormException {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validateLastName("Jadon");
        Assert.assertTrue(result);
    }

    @Test
    public void lastName_whenEmpty_throwException_Empty() {
        RegistrationForm registrationForm = new RegistrationForm();
        try {
            registrationForm.validateLastName("");
        } catch (RegistrationFormException e) {
            Assert.assertEquals(RegistrationFormException.exceptionType.Entered_Empty, e.type);
        }
    }

    @Test
    public void lastName_whenNull_throwException_Empty() {
        RegistrationForm registrationForm = new RegistrationForm();
        try {
            registrationForm.validateLastName(null);
        } catch (RegistrationFormException e) {
            Assert.assertEquals(RegistrationFormException.exceptionType.Entered_Null, e.type);
        }
    }

    @Test
    public void lastName_whenlessthan3_throwException_short() {
        RegistrationForm registrationForm = new RegistrationForm();
        try {
            registrationForm.validateLastName("ja");
        } catch (RegistrationFormException e) {
            Assert.assertEquals(RegistrationFormException.exceptionType.Entered_Short, e.type);
        }
    }

    @Test
    public void lastName_whenInvalid_throwException_invalid() {
        RegistrationForm registrationForm = new RegistrationForm();
        try {
            registrationForm.validateLastName("jA31y");
        } catch (RegistrationFormException e) {
            Assert.assertEquals(RegistrationFormException.exceptionType.Entered_Invalid, e.type);
        }
    }

    @Test
    public void eMail_whenProper_giventrue() throws RegistrationFormException {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validateEMail("harshit19jadon31@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void eMail_whenInvalid_throwException_invalid() {
        RegistrationForm registrationForm = new RegistrationForm();
        try {
            registrationForm.validateEMail("harsh.jas.hjsd@gamil.com");
        } catch (RegistrationFormException e) {
            Assert.assertEquals(RegistrationFormException.exceptionType.Entered_Invalid, e.type);
        }
    }
    @Test
    public void phoneNo_whenProper_giventrue() throws RegistrationFormException {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validatePhoneNo("91 9411411513");
        Assert.assertTrue(result);
    }
    @Test
    public void phoneNo_whenShortInvalid_throwException_invalid() {
        RegistrationForm registrationForm = new RegistrationForm();
        try {
            registrationForm.validatePhoneNo("89");
        } catch (RegistrationFormException e) {
            Assert.assertEquals(RegistrationFormException.exceptionType.Entered_Invalid, e.type);
        }
    }
    @Test
    public void phoneNo_whenNo91Invalid_throwException_invalid() {
        RegistrationForm registrationForm = new RegistrationForm();
        try {
            registrationForm.validatePhoneNo("9411411513");
        } catch (RegistrationFormException e) {
            Assert.assertEquals(RegistrationFormException.exceptionType.Entered_Invalid, e.type);
        }
    }
    @Test
    public void password_whenProper_giventrue() throws RegistrationFormException {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validatePassword("Harshit@12");
        Assert.assertTrue(result);
    }
    @Test
    public void password_whenlessthan8_throwException_short() {
        RegistrationForm registrationForm = new RegistrationForm();
        try {
            registrationForm.validatePassword("123456");
        } catch (RegistrationFormException e) {
            Assert.assertEquals(RegistrationFormException.exceptionType.Entered_Short, e.type);
        }
    }
    @Test
    public void password_whenInvalid_throwException_invalid() {
        RegistrationForm registrationForm = new RegistrationForm();
        try {
            registrationForm.validatePassword("hars4512khjghg");
        } catch (RegistrationFormException e) {
            Assert.assertEquals(RegistrationFormException.exceptionType.Entered_Invalid, e.type);
        }
    }











}

