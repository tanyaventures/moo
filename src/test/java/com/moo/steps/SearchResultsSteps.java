package com.moo.steps;

import com.moo.pages.SearchResultsPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;


public class SearchResultsSteps {

    SearchResultsPage searchResultsPage;

    @Step("Checking that inputted search term was accepted: {0}")
    public void checkSearchInput(String input) {
        assertThat(searchResultsPage.getResultsHeading()).matches("Results for \"" + input + "\"");
    }

    @Step
    public void hasReturnedResults() {
        assert(searchResultsPage.hasResultsCount());
        assertThat(searchResultsPage.getResultsList()).isNotEmpty();
    }
}
