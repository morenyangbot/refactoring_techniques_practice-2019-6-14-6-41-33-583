package com.tws.refactoring.extract_variable;

public class BannerRender {
    String renderBanner(String platform, String browser) {
        if (isPlatformMac(platform) && isBrowserIE(browser)) {
            return "IE on Mac?";
        }
        return "banner";
    }

    boolean isPlatformMac(String platform) {
        return platform.toUpperCase().contains("MAC");
    }

    boolean isBrowserIE(String browser) {
        return browser.toUpperCase().contains("IE");
    }
}
