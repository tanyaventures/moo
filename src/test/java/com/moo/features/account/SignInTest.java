package com.moo.features.account;

import com.moo.steps.SignInSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SignInTest {

    @Managed(uniqueSession = false)
    public WebDriver webdriver;

    @Steps
    SignInSteps signInSteps;


    @Test
    public void checkValidationsOnEmptySignInForm() {
        signInSteps.openSignInPage();
        signInSteps.clickOnSignInButton();
        signInSteps.checkEmailAddressFieldValidation();
        signInSteps.checkPasswordFieldValidation();
    }
}
