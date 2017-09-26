package com.moo.steps;

import com.moo.pages.HomePage;
import net.thucydides.core.annotations.Step;

public class HomePageSteps {

    HomePage homePage;

    @Step
    public void searchForItem(String input) {
        homePage.inputSearchField(input);
        homePage.clickOnSearchButton();
    }

    @Step
    public void openHomePage() {
        homePage.open();
    }
}
