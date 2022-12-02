package com.vkatvit.enterprise;

import com.vkatvit.DefaultTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ValidationFeaturesTest extends DefaultTest {

    private RegexValidationFeatures validationFeatures;

    @BeforeAll
    public void init(){
        validationFeatures = new RegexValidationFeatures();
    }

    @Test
    public void validName(){
        String onlyNonNumericChars = "John";
        boolean isValidName = validationFeatures.isValidName(onlyNonNumericChars);
        assertThat(true, equalTo(isValidName));
    }

    @Test
    public void invalidName(){
        String wordWithNumericChars = "John123";
        boolean isValidName = validationFeatures.isValidName(wordWithNumericChars);
        assertThat(false, equalTo(isValidName));
    }

    @Test
    public void validPhone(){
        String validPhoneNumer = "+79551707742";
        boolean isValidPhone = validationFeatures.isValidPhoneNumber(validPhoneNumer);
        assertThat(true, equalTo(isValidPhone));
        validPhoneNumer = "+443425020530";
        isValidPhone = validationFeatures.isValidPhoneNumber(validPhoneNumer);
        assertThat(true, equalTo(isValidPhone));
    }

    @Test
    public void invalidPhone(){
        String validPhoneNumer = "79551707742";
        boolean isValidPhone = validationFeatures.isValidPhoneNumber(validPhoneNumer);
        assertThat(false, equalTo(isValidPhone));
        validPhoneNumer = "+7a551707742";
        isValidPhone = validationFeatures.isValidPhoneNumber(validPhoneNumer);
        assertThat(false, equalTo(isValidPhone));
    }

    @Test
    public void validCreditCard(){
        boolean isValidCardNumber = validationFeatures.isValidCreditCard("4444-1231-3112-1331");
        assertThat(true, equalTo(isValidCardNumber));
    }

    @Test
    public void invalidCreditCard(){
        boolean isValidCardNumber = validationFeatures.isValidCreditCard("4a44-1231-3112-1331");
        assertThat(false, equalTo(isValidCardNumber));
        isValidCardNumber = validationFeatures.isValidCreditCard("43-1231-3112-1331");
        assertThat(false, equalTo(isValidCardNumber));
        isValidCardNumber = validationFeatures.isValidCreditCard("43331231-3112-1331");
        assertThat(false, equalTo(isValidCardNumber));
    }

}
