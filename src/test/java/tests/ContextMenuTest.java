package tests;


import aquality.selenium.browser.AlertActions;
import constants.MainPageNavigation;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class ContextMenuTest extends BaseTest {

    private final ContextMenuPage contextMenuPage = new ContextMenuPage();
    private final String TEXT = "You selected a context menu";


    @Test
    public void contextMenuTest() {
        mainPage.clickNavigationLink(MainPageNavigation.CONTEXT_MENU);
        contextMenuPage.rightClick();
        //Assert.assertTrue(contextMenuPage.isAlertMessageDisplayed(), "Alert message is not displayed");
        Assert.assertTrue(contextMenuPage.getAlertMessage().contains(TEXT), "Alert message is not displayed");
        System.out.println("Alert message: " + contextMenuPage.getAlertMessage());
        getBrowser().handleAlert(AlertActions.ACCEPT);

    }
}
