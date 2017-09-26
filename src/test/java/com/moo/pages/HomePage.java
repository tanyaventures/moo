package com.moo.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.moo.com/uk/")
public class HomePage extends BasicMooPage {

    @FindBy(name="query")
    private WebElementFacade searchField;

    @FindBy(css="button.search__btn")
    private WebElementFacade searchButton;

    public void inputSearchField(String input) {
        searchField.type(input);
    }

    public void clickOnSearchButton() {
        searchButton.click();
    }
}
