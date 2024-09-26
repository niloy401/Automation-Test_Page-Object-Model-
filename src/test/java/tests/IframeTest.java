package tests;

import constants.MainPageNavigation;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IframePage;

public class IframeTest extends BaseTest{

    private final IframePage iframePage = new IframePage();

    @Test
    public void iFrameTest() {
        mainPage.clickNavigationLink(MainPageNavigation.FRAMES);
        mainPage.clickNavigationLink(MainPageNavigation.IFRAME);
        iframePage.switchToIframe();
        iframePage.sendingContent();
        Assert.assertTrue(iframePage.isRandomTextDisplayed(), "Text is not displayed");
        iframePage.switchToDefaultContent();
        iframePage.clickEdit();
        iframePage.clickUndo();
        iframePage.switchToIframe();
        Assert.assertTrue(iframePage.isTextDisplayed(), "Text is not displayed");
    }
}
