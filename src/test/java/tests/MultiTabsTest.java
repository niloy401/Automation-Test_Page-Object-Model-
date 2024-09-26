package tests;

import constants.MainPageNavigation;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MultiTabsPage;
import utils.BrowserUtils;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class MultiTabsTest extends BaseTest{

    private final MultiTabsPage multiTabsPage = new MultiTabsPage();

    @Test
    public void multiTabsTest() {
        mainPage.clickNavigationLink(MainPageNavigation.Multi_Tabs);
        multiTabsPage.clickHere();
        String windowOne = getBrowser().getDriver().getWindowHandle();

        for (String window : getBrowser().getDriver().getWindowHandles()) {
            if (!window.equals(windowOne)) {
                BrowserUtils.switchToWindow(window);
                break;
            }
        }
        BrowserUtils.closeWindow();
        BrowserUtils.switchToWindow(windowOne);
        Assert.assertTrue(multiTabsPage.isTextDisplayed(), "Text is not displayed");
    }
}
