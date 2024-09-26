package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

import static aquality.selenium.browser.AqualityServices.getBrowser;
import static utils.BrowserUtils.switchToFrame;

public class NestedFramesPage extends Form {
    private static final String PAGE_NAME = "Nested Frames";
    private final ILabel BODY = getElementFactory().getLabel(By.tagName("body"), "Body Tag");
    private  final String TOP_FRAME = "frame-top";
    private final  String RIGHT_FRAME = "frame-right";
    private final String MIDDLE_FRAME = "frame-middle";
    private final String LEFT_FRAME = "frame-left";
    private final String BOTTOM_FRAME = "frame-bottom";

    public NestedFramesPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, PAGE_NAME)), PAGE_NAME);
    }

    public void switchToBottomFrame() {
        switchToFrame(BOTTOM_FRAME);
    }

    public void switchToTopFrame() {
        //getBrowser().getDriver().switchTo().frame(TOP_FRAME);
        switchToFrame(TOP_FRAME);
    }

    public void switchToRightFrame() {
        getBrowser().getDriver().switchTo().frame(RIGHT_FRAME);
    }

    public void switchToMiddleFrame() {
        getBrowser().getDriver().switchTo().frame(MIDDLE_FRAME);
    }

    public void switchToLeftFrame() {
        getBrowser().getDriver().switchTo().frame(LEFT_FRAME);
    }

    public boolean isTextDisplayed() {
        //return getBrowser().getDriver().findElement(By.tagName("body")).isDisplayed();
        return BODY.state().isDisplayed();
    }
}
