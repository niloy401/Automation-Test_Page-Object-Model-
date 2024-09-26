package tests;


import constants.MainPageNavigation;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EntryAdPage;
import static aquality.selenium.browser.AqualityServices.getBrowser;

public class EntryAdTest extends BaseTest {

    private final EntryAdPage entryAdPage = new EntryAdPage();

    @Test
    public void entryAdTest() {
        mainPage.clickNavigationLink(MainPageNavigation.AD_PAGE);
        Assert.assertTrue(entryAdPage.isAdpageDisplayed(), "Entry Ad page is not displayed");
        getBrowser().refresh();
        entryAdPage.clickHere();
        Assert.assertTrue(entryAdPage.isPopupDisplayed(), "Popup is not displayed");
        getBrowser().refresh();
        entryAdPage.closePopup();
        Assert.assertTrue(entryAdPage.isAdpageDisplayed(), "Ad page is not displayed");
        getBrowser().refresh();
        //*****************
        Assert.assertTrue(entryAdPage.isAdpageDisplayed(), "Entry Ad page is not displayed");
        entryAdPage.clickHere();
        Assert.assertTrue(entryAdPage.isPopupDisplayed(), "Popup is not displayed");
        getBrowser().refresh();
        Assert.assertTrue(entryAdPage.isAdpageDisplayed(), "Entry Ad page is not displayed");
    }
}
