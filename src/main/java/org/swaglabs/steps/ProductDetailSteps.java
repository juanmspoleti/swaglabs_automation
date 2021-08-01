package org.swaglabs.steps;

import io.cucumber.java.en.When;
import org.swaglabs.views.ProductDetailView;

public class ProductDetailSteps {

    private ProductDetailView productDetailView;

    @When("clicks on add to cart button")
    public void clicksAddToCart() {
        getProductDetailView().clickAddToCart();
    }

    private ProductDetailView getProductDetailView() {
        if (productDetailView == null) {
            productDetailView = new ProductDetailView();
        }
        return productDetailView;
    }


}
