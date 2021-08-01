package org.swaglabs.core.browser;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;

public interface Browser {

    Class<? extends WebDriver> getDriverClass();

    WebDriver initDriver();

    MutableCapabilities getCapabilities();
}
