package org.swaglabs.core.browser;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class Chrome implements Browser {

    @Override
    public Class<? extends WebDriver> getDriverClass() {
        return ChromeDriver.class;
    }

    @Override
    public WebDriver initDriver() {
        return new ChromeDriver();
    }

    @Override
    public MutableCapabilities getCapabilities() {
        ChromeOptions caps = new ChromeOptions();
        caps.addArguments("--allow-insecure-localhost");
        caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        return caps;
    }
}
