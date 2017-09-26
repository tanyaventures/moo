package com.moo.steps;

import com.moo.pages.SearchResultsPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class SearchResultsSteps {

    SearchResultsPage searchResultsPage;

    private static final String ERROR_MESSAGE = "Sorry we couldn’t find anything. Please check the spelling or alternatively chat to our friendly customer services team using the chat below.";

    @Step("Checking that inputted search term was accepted: {0}")
    public void checkSearchInput(String input) {
        assertThat(searchResultsPage.getResultsHeading()).matches("Results for \"" + input + "\"");
    }

    @Step
    public void hasReturnedResults() {
        assertThat(searchResultsPage.getResultsList()).isNotEmpty();
    }

    @Step
    public void errorIsMessageDisplayed() {
        assertThat(searchResultsPage.getErrorMessage()).isEqualToIgnoringCase(ERROR_MESSAGE);
    }

    @Step("Result count should be displayed: {0}")
    public void checkResultCountIsDisplayed(boolean expected) {
        if (expected) {
            assertTrue(searchResultsPage.hasResultsCount());
        }
        else {
            assertFalse(searchResultsPage.hasResultsCount());
        }
    }
}
