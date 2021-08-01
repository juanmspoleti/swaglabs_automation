package org.swaglabs.views.checkout;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.swaglabs.views.common.ViewBase;

public class CompleteView extends ViewBase {

    @FindBy(className = "complete-header")
    private WebElement titleLabel;

    @FindBy(className = "complete-text")
    private WebElement subtitleLabel;

    @FindBy(css = "img[alt='Pony Express']")
    private WebElement logoIcon;

    public String geTitle() {
        return getText(titleLabel);
    }

    public String geSubtitle() {
        return getText(subtitleLabel);
    }

}
