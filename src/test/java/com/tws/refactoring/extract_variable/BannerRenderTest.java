package com.tws.refactoring.extract_variable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BannerRenderTest {
    private BannerRender bannerRender;

    @Before
    public void init() {
        bannerRender = new BannerRender();
    }

    @Test
    public void should_return_true_in_is_platform_mac_when_call_mac() {
        String platform = "mac";
        boolean result = bannerRender.isPlatformMac(platform);
        assertTrue(result);
    }

    @Test
    public void should_return_false_in_is_platform_mac_when_call_windows() {
        String platform = "windows";
        boolean result = bannerRender.isPlatformMac(platform);
        assertFalse(result);
    }

    @Test
    public void should_return_true_in_is_browser_ie_when_call_ie() {
        String browser = "ie";
        boolean result = bannerRender.isBrowserIE(browser);
        assertTrue(result);
    }

    @Test
    public void should_return_true_in_is_browser_ie_when_call_safari() {
        String browser = "safari";
        boolean result = bannerRender.isBrowserIE(browser);
        assertFalse(result);
    }

    @Test
    public void should_return_banner_in_render_banner_when_platform_is_windows_and_browser_is_ie() {
        String platform = "windows",
                browser = "ie";
        String result = bannerRender.renderBanner(platform, browser);

        assertEquals("banner", result);
    }

    @Test
    public void should_return_banner_in_render_banner_when_platform_is_mac_and_browser_is_safari() {
        String platform = "mac",
                browser = "safari";
        String result = bannerRender.renderBanner(platform, browser);

        assertEquals("banner", result);
    }

    @Test
    public void should_return_banner_in_render_banner_when_platform_is_mac_and_browser_is_ie() {
        String platform = "mac",
                browser = "ie";
        String result = bannerRender.renderBanner(platform, browser);

        assertEquals("IE on Mac?", result);
    }
}