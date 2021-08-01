package org.swaglabs.views.checkout;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.swaglabs.views.common.ViewBase;

public class OverviewView extends ViewBase {

    @FindBy(className = "inventory_item_name")
    private WebElement productName;

    @FindBy(id = "finish")
    private WebElement finishButton;

    public String getProductName() {
        return getText(productName);
    }

    public void clickFinish() {
        click(finishButton);
    }
}
