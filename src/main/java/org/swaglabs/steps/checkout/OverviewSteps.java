package org.swaglabs.steps.checkout;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.swaglabs.views.checkout.OverviewView;
import org.testng.Assert;

public class OverviewSteps {

    private OverviewView overviewView;

    @When("clicks on finish button")
    public void clicksFinish() {
        getOverviewView().clickFinish();
    }

    @Then("product name is {string} in overview screen")
    public void verifyProductName(String productName) {
        Assert.assertEquals(getOverviewView().getProductName(), productName);
    }

    private OverviewView getOverviewView() {
        if (overviewView == null) {
            overviewView = new OverviewView();
        }
        return overviewView;
    }

}
