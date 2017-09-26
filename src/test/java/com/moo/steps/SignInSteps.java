package com.moo.steps;

import com.moo.pages.SignInPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class SignInSteps {

    SignInPage signInPage;

    @Step
    public void openSignInPage() {
        signInPage.open();
    }

    @Step
    public void clickOnSignInButton() {
        signInPage.clickOnSignIn();
    }

    @Step
    public void checkEmailAddressFieldValidation() {
        String emailAddressFieldMsg = signInPage.getEmailAddressErrorMessage();
        assertThat(emailAddressFieldMsg).isEqualToIgnoringCase("Please enter your email address");
    }

    @Step
    public void checkPasswordFieldValidation() {
        String passwordFieldMsg = signInPage.getPasswordErrorMessage();
        assertThat(passwordFieldMsg).isEqualToIgnoringCase("Please enter your password");
    }
}
