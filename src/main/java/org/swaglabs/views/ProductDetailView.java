package org.swaglabs.views;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.swaglabs.views.common.ViewBase;

public class ProductDetailView extends ViewBase {

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCartButton;

    public void clickAddToCart() {
        click(addToCartButton);
    }
}
