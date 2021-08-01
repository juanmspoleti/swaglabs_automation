package org.swaglabs.core.browser;

import java.util.Arrays;

public enum BrowserType implements BrowserTypeInterface {

    CHROME {
        public Browser getBrowser() {
            return new Chrome();
        }
    },
    FIREFOX {
        public Browser getBrowser() {
            return new Firefox();
        }
    };

    public static Browser getBrowser(String browser) {
        try {
            BrowserType browserType = valueOf(browser.toUpperCase());
            return browserType.getBrowser();
        } catch (IllegalArgumentException e) {
            String available = Arrays.toString(values());
            throw new RuntimeException(String.format("Browser %s was not found. Available: %s", browser, available));
        }
    }
}
