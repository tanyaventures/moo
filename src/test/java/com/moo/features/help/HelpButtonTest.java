package com.moo.features.help;

import com.moo.steps.HomePageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class HelpButtonTest {

    @Managed(uniqueSession = false)
    public WebDriver webdriver;

    @Steps
    public HomePageSteps homePageSteps;

    @Before
    public void openHomePage() {
        homePageSteps.openHomePage();
    }

    @Test
    public void sideBarExpandsWhenHelpButtonIsClicked() {
        homePageSteps.checkHelpButtonIsVisible(true);
        homePageSteps.clickOnHelpButton();
        homePageSteps.checkSidebarHasExpanded();
    }


}
