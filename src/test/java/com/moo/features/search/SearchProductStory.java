package com.moo.features.search;

import com.moo.steps.HomePageSteps;
import com.moo.steps.SearchResultsSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchProductStory {

    @Managed(uniqueSession = false)
    public WebDriver webdriver;

    @Steps
    public HomePageSteps homePageSteps;

    @Steps
    SearchResultsSteps searchResultsSteps;

    @Before
    public void openHomePage() {
        homePageSteps.openHomePage();
    }

    @Test
    public void searchingForValidProduct() {
        final String input = "business cards";
        homePageSteps.searchForItem(input);
        searchResultsSteps.checkSearchInput(input);
        searchResultsSteps.checkResultCountIsDisplayed(true);
        searchResultsSteps.hasReturnedResults();
    }

    @Test
    public void searchingForInvalidProduct() {
        final String input = "sdjfnjsdfj";
        homePageSteps.searchForItem(input);
        searchResultsSteps.checkSearchInput(input);
        searchResultsSteps.checkResultCountIsDisplayed(false);
        searchResultsSteps.errorIsMessageDisplayed();

    }
}
