package org.swaglabs.views.checkout;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.swaglabs.views.common.ViewBase;

public class CheckoutView extends ViewBase {

    @FindBy(id = "first-name")
    private WebElement firstNameInput;

    @FindBy(id = "last-name")
    private WebElement lastNameInput;

    @FindBy(id = "postal-code")
    private WebElement postalCodeInput;

    @FindBy(id = "continue")
    private WebElement continueButton;

    public void setFirstName(String firstName) {
        setInput(firstNameInput, firstName);
    }

    public void setLastName(String lastName) {
        setInput(lastNameInput, lastName);
    }

    public void setPostalCode(String postalCode) {
        setInput(postalCodeInput, postalCode);
    }

    public void clickContinue() {
        click(continueButton);
    }
}
