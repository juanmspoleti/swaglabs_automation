package org.swaglabs.views;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.swaglabs.views.common.ViewBase;

public class CartView extends ViewBase {

    @FindBy(id = "checkout")
    private WebElement checkoutButton;

    public void clickCheckout() {
        click(checkoutButton);
    }
}
