package org.swaglabs.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.swaglabs.views.LoginView;
import org.testng.Assert;

public class LoginSteps {

    private final String LOGIN_NOT_DISPLAYED_MESSAGE = "Login view is not displayed.";
    private LoginView loginView;

    @When("do the login process with {string} and {string}")
    public void doLoginProcess(String email, String password) {
        LoginView loginView = getLoginView();
        loginView.setEmail(email);
        loginView.setPassword(password);
        loginView.clickSignIn();
    }

    @Then("message {string} is displayed in login view")
    public void isErrorMessageDisplayed(String message) {
        Assert.assertEquals(getLoginView().getErrorMessage(), message);
    }

    @Then("login view is displayed")
    public void isLoginPageDisplayed() {
        Assert.assertTrue(getLoginView().isViewDisplayed(), LOGIN_NOT_DISPLAYED_MESSAGE);
    }

    private LoginView getLoginView() {
        if (loginView == null) {
            loginView = new LoginView();
        }
        return loginView;
    }
}
