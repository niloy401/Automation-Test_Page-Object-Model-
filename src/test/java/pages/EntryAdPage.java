package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

import static aquality.selenium.browser.AqualityServices.*;

public class EntryAdPage extends Form {
    private static final String NAME = "Entry Ad";
    private final IButton clickHereBtn = getElementFactory().getButton(By.xpath("//p//a"), "Click Here button");
    private final IButton closeBtn = getElementFactory().getButton(By.xpath("//div[@class='modal-footer']//p"), "Pop up Close button");
    private final ITextBox Popup = getElementFactory().getTextBox(By.xpath("//div[@class='modal']"), "Popup is not Displayed");
    private final ILink Adpage = getElementFactory().getLink(By.xpath("//div[@id='content']"), "Page");


    public EntryAdPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }

    public void clickHere() {
        getConditionalWait().waitFor(() -> clickHereBtn.state().isDisplayed());
    }

    public boolean isPopupDisplayed() {
        return getConditionalWait().waitFor(() -> Popup.state().waitForDisplayed());
    }

    public boolean isAdpageDisplayed() {
        return getConditionalWait().waitFor(() -> Adpage.state().waitForDisplayed());
    }

    public void closePopup() {
        getConditionalWait().waitFor(() -> closeBtn.state().waitForDisplayed());
        closeBtn.click();
    }
}
