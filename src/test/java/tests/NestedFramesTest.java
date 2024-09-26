package tests;

import constants.MainPageNavigation;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NestedFramesPage;
import utils.BrowserUtils;

public class NestedFramesTest extends BaseTest{

    NestedFramesPage nestedFramesPage = new NestedFramesPage();

    @Test
    public void nestedFramesTest() {
        mainPage.clickNavigationLink(MainPageNavigation.NESTED_FRAMES);
        nestedFramesPage.switchToTopFrame();
        nestedFramesPage.switchToRightFrame();
        Assert.assertTrue(nestedFramesPage.isTextDisplayed(), "Text is not displayed");
        BrowserUtils.switchToParentFrame();
        nestedFramesPage.switchToMiddleFrame();
        Assert.assertTrue(nestedFramesPage.isTextDisplayed(), "Text is not displayed");
        BrowserUtils.switchToParentFrame();
        nestedFramesPage.switchToLeftFrame();
        Assert.assertTrue(nestedFramesPage.isTextDisplayed(), "Text is not displayed");
        BrowserUtils.switchToDefaultContent();
        nestedFramesPage.switchToBottomFrame();
        Assert.assertTrue(nestedFramesPage.isTextDisplayed(), "Text is not displayed");
    }
}
