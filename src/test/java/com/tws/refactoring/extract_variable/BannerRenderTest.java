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