package org.swaglabs.views;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.swaglabs.views.common.ViewBase;

public class LoginView extends ViewBase {

    @FindBy(id = "user-name")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "login-button")
    private WebElement signInButton;

    @FindBy(css = "h3[data-test='error']")
    private WebElement errorMessageLabel;

    public String getErrorMessage() {
        return getText(errorMessageLabel);
    }

    public void setEmail(String email) {
        setInput(usernameInput, email);
    }

    public void setPassword(String password) {
        setInput(passwordInput, password);
    }

    public void clickSignIn() {
        click(signInButton);
    }

    public boolean isViewDisplayed() {
        return isVisible(usernameInput);
    }
}
