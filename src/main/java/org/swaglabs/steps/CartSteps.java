package org.swaglabs.steps;

import io.cucumber.java.en.When;
import org.swaglabs.views.CartView;

public class CartSteps {

    private CartView cartView;

    @When("clicks on checkout button")
    public void clicksCheckout() {
        getCartView().clickCheckout();
    }

    private CartView getCartView() {
        if (cartView == null) {
            cartView = new CartView();
        }
        return cartView;
    }


}
