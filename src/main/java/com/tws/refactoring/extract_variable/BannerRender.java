package com.tws.refactoring.extract_variable;

public class BannerRender {
    String renderBanner(String platform, String browser) {
        return isPlatformMac(platform) && isBrowserIE(browser) ? "IE on Mac?" : "banner";
    }

    boolean isPlatformMac(String platform) {
        return platform.toUpperCase().contains("MAC");
    }

    boolean isBrowserIE(String browser) {
        return browser.toUpperCase().contains("IE");
    }
}
