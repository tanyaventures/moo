package com.moo.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.moo.com/uk/account/signin.php")
public class SignInPage extends PageObject {

    @FindBy(id="btnLogin")
    public WebElementFacade signInButton;

    @FindBy(xpath = "//label[contains(@for,'txtPasswordSignIn')]/following-sibling::div/div[@class='has-error-msg']")
    public WebElementFacade passwordErrorMessage;

    @FindBy(xpath = "//label[contains(@for,'txtEmailSignIn')]/following-sibling::div/div[@class='has-error-msg']")
    public WebElementFacade emailErrorMessage;


    public void clickOnSignIn() {
        signInButton.click();
    }

    public String getPasswordErrorMessage() {
        return passwordErrorMessage.getText();
    }

    public String getEmailAddressErrorMessage() {
        return emailErrorMessage.getText();
    }

}
