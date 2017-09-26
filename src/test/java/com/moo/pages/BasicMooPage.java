package com.moo.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.moo.com/")
public class BasicMooPage extends PageObject {

    @FindBy(className = "answerdash-sidebar-header-label")
    public WebElementFacade sidebar;

    @FindBy(id="answerdash-helpButton-text")
    public WebElementFacade helpButton;

    public boolean isHelpButtonVisible() {
        return isElementVisible(By.id("answerdash-helpButton-text"));
    }

    public void clickOnHelpButton() {
        helpButton.click();
    }

    public boolean isSideBarOpen() {
        return isElementVisible(By.className("answerdash-sidebar-header-label"));
    }

    public String getSideBarHeading() {
        return sidebar.getText();
    }

}
