package org.swaglabs.views.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderSection extends ViewBase {

    @FindBy(id = "shopping_cart_container")
    private WebElement shoppingCartIcon;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement moreOptionsButton;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutMenu;


    public void clickShoppingCart() {
        click(shoppingCartIcon);
    }

    public void clickMoreOptions() {
        click(moreOptionsButton);
    }

    public void clickLogout() {
        click(logoutMenu);
    }
}
