package tests;

import constants.MainPageNavigation;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class DynamicLoadingTest extends BaseTest {
    private final DynamicLoadingPage dynamicLoadingPage = new pages.DynamicLoadingPage();
    private final String TEXT = "Hello World!";
    private  final String EXAMPLE1 = "Example 1: Element on page that is hidden";
    private  final String EXAMPLE2 = "Example 2: Element rendered after the fact";

    @Test
    public void dynamicLoadingTest() {
        mainPage.clickNavigationLink(MainPageNavigation.DYNAMIC_LOADING);
        dynamicLoadingPage.clickExample1();
        Assert.assertTrue(dynamicLoadingPage.isPage1TextDisplayed().contains(EXAMPLE1), "Hello World! text is not displayed");
        dynamicLoadingPage.clickStartButton();
        //dynamicLoadingPage.waitForPageToLoad();
        Assert.assertTrue(dynamicLoadingPage.isTextDisplayed().contains(TEXT), "Hello World! text is not displayed");
        getBrowser().goBack();
        dynamicLoadingPage.clickExample2();
        Assert.assertTrue(dynamicLoadingPage.isPage2TextDisplayed().contains(EXAMPLE2), "Text is not displayed");
        dynamicLoadingPage.clickStartButton();
        Assert.assertTrue(dynamicLoadingPage.isTextDisplayed().contains(TEXT), "Text is not displayed");
    }
}
