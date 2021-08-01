package org.swaglabs.views.common;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.swaglabs.core.DriverService;
import org.swaglabs.core.PropertyManager;

import java.time.Duration;

public abstract class ViewBase {

    public ViewBase() {
        PageFactory.initElements(DriverService.getInstance(), this);
    }

    private ThreadLocal<FluentWait<WebElement>> fluentWait = new ThreadLocal<>();

    public FluentWait getFluentWait() {
        if (fluentWait.get() == null) {
            long timeout = Long.parseLong(PropertyManager.getProperty("element.timeout"));
            fluentWait.set(new FluentWait(DriverService.getInstance()).withTimeout(Duration.ofSeconds(timeout))
                    .pollingEvery(Duration.ofMillis(500L)).ignoring(NoSuchElementException.class));
        }
        return fluentWait.get();
    }

    public String getText(WebElement element) {
        return element.getText();
    }

    public void setInput(WebElement element, String value) {
        element.sendKeys(value);
    }

    public void click(WebElement element) {
        getFluentWait().until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public boolean isVisible(WebElement element) {
        return element.isDisplayed();
    }
}
