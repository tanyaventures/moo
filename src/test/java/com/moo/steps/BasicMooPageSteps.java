package com.moo.steps;

import com.moo.pages.BasicMooPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

public class BasicMooPageSteps {

    BasicMooPage basicMooPage;

    @Step("Check that Help button at the side is present: {0}")
    public void checkHelpButtonIsVisible(boolean present) {
        assertThat(basicMooPage.isHelpButtonVisible()).isEqualTo(present);
    }

    @Step
    public void clickOnHelpButton() {
        basicMooPage.clickOnHelpButton();
    }

    @Step
    public void checkSidebarHasExpanded() {
        assertTrue(basicMooPage.isSideBarOpen());
        assertThat(basicMooPage.getSideBarHeading()).isEqualToIgnoringCase("Popular Questions");
    }

}
