package org.swaglabs.steps.common;

import io.cucumber.java.en.When;
import org.swaglabs.views.common.HeaderSection;

public class HeaderSteps {

    private HeaderSection headerSectionView;

    @When("clicks on chart icon")
    public void clicksChart() {
        getHeaderSectionView().clickShoppingCart();
    }

    @When("selects logout option from more menu")
    public void selectsLogoutOption() {
        getHeaderSectionView().clickMoreOptions();
        getHeaderSectionView().clickLogout();
    }

    private HeaderSection getHeaderSectionView() {
        if (headerSectionView == null) {
            headerSectionView = new HeaderSection();
        }
        return headerSectionView;
    }


}
