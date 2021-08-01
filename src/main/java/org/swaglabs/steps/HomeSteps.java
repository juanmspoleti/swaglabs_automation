package org.swaglabs.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.swaglabs.views.HomeView;
import org.testng.Assert;

public class HomeSteps {

    private final String HOME_NOT_DISPLAYED_MESSAGE = "Home view is not displayed.";
    private HomeView homeView;

    @Then("home view is displayed")
    public void isHomeViewDisplayed() {
        Assert.assertTrue(getHomeView().isViewDisplayed(), HOME_NOT_DISPLAYED_MESSAGE);
    }

    @When("selects the product {string}")
    public void selectsProduct(String productName) {
        getHomeView().selectProduct(productName);
    }

    private HomeView getHomeView() {
        if (homeView == null) {
            homeView = new HomeView();
        }
        return homeView;
    }


}
