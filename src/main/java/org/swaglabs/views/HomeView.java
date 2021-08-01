package org.swaglabs.views;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.swaglabs.views.common.ViewBase;

import java.util.List;

public class HomeView extends ViewBase {

    @FindBy(className = "inventory_item_name")
    private List<WebElement> productsName;

    public boolean isViewDisplayed() {
        return productsName.stream().findAny().isPresent();
    }

    public void selectProduct(String name) {
        WebElement product = productsName.stream()
                .filter(p -> p.getText().equals(name))
                .findFirst()
                .orElseThrow(() -> new RuntimeException(""));
        click(product);
    }
}
