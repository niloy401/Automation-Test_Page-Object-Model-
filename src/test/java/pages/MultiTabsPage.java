package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import static constants.LocatorConstants.PRECISE_TEXT_XPATH;


public class MultiTabsPage extends Form {
    private static final String PAGE_NAME = "Multiple Windows";
    private final IButton CLICK_HERE_BUTTON = getElementFactory().getButton(By.linkText("Click Here"), "Click Here Button");
    private final ILabel TEXT = getElementFactory().getLabel(By.tagName("h3"), "New Window");

    public MultiTabsPage() {
        super(By.xpath(String.format(PRECISE_TEXT_XPATH, PAGE_NAME)), PAGE_NAME);
    }

    public void clickHere() {
        CLICK_HERE_BUTTON.click();
    }

    public boolean isTextDisplayed() {
        return TEXT.state().isDisplayed();
    }
}