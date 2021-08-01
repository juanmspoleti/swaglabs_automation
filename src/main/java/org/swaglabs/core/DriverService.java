package org.swaglabs.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.swaglabs.core.browser.Browser;
import org.swaglabs.core.browser.BrowserType;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverService {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private static WebDriver create() {
        String browserRequested = PropertyManager.getProperty("browser");
        Browser browser = BrowserType.getBrowser(browserRequested);
        WebDriverManager.getInstance(browser.getDriverClass()).setup();

        WebDriver driver = initDriver(browser);
        driver.manage().window().maximize();
        return driver;
    }

    private static WebDriver initDriver(Browser browser) {
        String hub = PropertyManager.getProperty("driver.hub");
        WebDriver driver;
        if (hub.isEmpty()) {
            driver = browser.initDriver();
        } else {
            try {
                MutableCapabilities capabilities = browser.getCapabilities();
                URL url = new URL(hub);
                driver = new RemoteWebDriver(url, capabilities);
            } catch (MalformedURLException e) {
               throw new RuntimeException("Invalid hub URL: ".concat(e.getLocalizedMessage()));
            }
        }
        return driver;
    }

    public static void dismiss() {
        driver.get().quit();
        driver.remove();
    }

    public static WebDriver getInstance() {
        if (driver.get() == null) {
            driver.set(create());
        }
        return driver.get();
    }
}
