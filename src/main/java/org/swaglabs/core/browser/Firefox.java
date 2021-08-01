package org.swaglabs.core.browser;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;

public class Firefox implements Browser {

    @Override
    public Class<? extends WebDriver> getDriverClass() {
        return FirefoxDriver.class;
    }

    @Override
    public WebDriver initDriver() {
        return new FirefoxDriver();
    }

    @Override
    public MutableCapabilities getCapabilities() {
        FirefoxOptions caps = new FirefoxOptions();
        caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        return caps;
    }
}
