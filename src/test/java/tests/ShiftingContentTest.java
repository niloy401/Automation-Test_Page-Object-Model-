package tests;

import constants.MainPageNavigation;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ShiftingContentPage;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class ShiftingContentTest extends BaseTest{

    private final ShiftingContentPage shiftingContentPage = new ShiftingContentPage();

    @Test
    public void shiftingContentTest() {
        mainPage.clickNavigationLink(MainPageNavigation.SHIFTING_CONTENT);
        shiftingContentPage.clickExample1();
        shiftingContentPage.clickHome();
        //Assert.assertTrue(shiftingContentPage.isMainpageOpened(), "Main page is not opened");
        Assert.assertTrue(shiftingContentPage.state().isDisplayed(), "Main page is not opened");
        mainPage.clickNavigationLink(MainPageNavigation.SHIFTING_CONTENT);
        shiftingContentPage.clickExample3();
        getBrowser().refresh();
        getBrowser().goBack();
        shiftingContentPage.clickExample2();



    }
}
