package tests;

import constants.MainPageNavigation;
import org.testng.Assert;
import pages.DynamicControlsPage;
import org.testng.annotations.Test;

import java.util.UUID;

public class DynamicControlsTest extends BaseTest {
    private final DynamicControlsPage dynamicControlsPage = new DynamicControlsPage();
    private final String RANDOM_TEXT = UUID.randomUUID().toString();

    @Test
    public void dynamicControlsTest() {
       mainPage.clickNavigationLink(MainPageNavigation.DYNAMIC_CONTROLS);
       dynamicControlsPage.clickEnableButton();
       Assert.assertTrue(dynamicControlsPage.isInputEnabled(), "Input is not Enabled");
       dynamicControlsPage.inputText(RANDOM_TEXT);
       Assert.assertEquals(dynamicControlsPage.getInputTextValue(), RANDOM_TEXT, "Text is not Displayed");
    }
}
