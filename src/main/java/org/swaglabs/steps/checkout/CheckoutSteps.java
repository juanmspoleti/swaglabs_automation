package org.swaglabs.steps.checkout;

import io.cucumber.java.en.When;
import org.swaglabs.views.checkout.CheckoutView;

public class CheckoutSteps {

    private CheckoutView checkoutView;

    @When("completes the information with {string}, {string} and {string}")
    public void completesInformation(String firstName, String lastName, String postalCode) {
        getCheckoutView().setFirstName(firstName);
        getCheckoutView().setLastName(lastName);
        getCheckoutView().setPostalCode(postalCode);

        getCheckoutView().clickContinue();
    }

    private CheckoutView getCheckoutView() {
        if (checkoutView == null) {
            checkoutView = new CheckoutView();
        }
        return checkoutView;
    }


}
