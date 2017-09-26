package com.moo.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.util.List;


public class SearchResultsPage extends PageObject {

    @FindBy(css="h1")
    private WebElementFacade resultsHeading;

    public String getResultsHeading() {
        return resultsHeading.getText();
    }

    public boolean hasResultsCount() {
        return isElementVisible(By.className("gsc-result-info"));
    }

    public List<WebElementFacade> getResultsList() {
        return findAll("div.gsc-results div.gs-title");
    }
}
