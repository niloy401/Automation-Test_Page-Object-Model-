package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import java.util.UUID;
import static aquality.selenium.browser.AqualityServices.getBrowser;
import static constants.LocatorConstants.PRECISE_TEXT_XPATH;


public class IframePage extends Form {
    private static final String PAGE_NAME = "Frames";
    private final String RANDOM = UUID.randomUUID().toString();
    private final String INIT_TEXT = "Your content goes here.";
    private final ILabel EDIT = getElementFactory().getLabel(By.xpath(PRECISE_TEXT_XPATH),"Edit label");
    private final By UNDO = By.xpath(String.format(PRECISE_TEXT_XPATH, "Undo"));
    private final String TEXT_IS_NOT_DISPLAYED_MSG = "Text is not displayed";
    private final String IFRAME_ID = "mce_0_ifr";
    private final ITextBox TEXT_FIELD = getElementFactory().getTextBox(By.id("tinymce"), "Text field");

    public IframePage() {
        super(By.xpath(String.format(PRECISE_TEXT_XPATH, PAGE_NAME)), PAGE_NAME);
    }

    public void switchToIframe() {
        getBrowser().getDriver().switchTo().frame(IFRAME_ID);
    }

    public void sendingContent() {
        TEXT_FIELD.sendKeys(RANDOM);
    }

    public boolean isRandomTextDisplayed() {
        return getBrowser().getDriver().findElement(By.xpath(String.format(PRECISE_TEXT_XPATH, INIT_TEXT + RANDOM))).isDisplayed();
    }

    public void switchToDefaultContent() {
        getBrowser().getDriver().switchTo().defaultContent();
    }

    public void clickEdit() {
        EDIT.click();
    }

    public void clickUndo() {
        getBrowser().getDriver().findElement(UNDO).click();
    }

    public boolean isTextDisplayed() {
        return getBrowser().getDriver().findElement(By.xpath(String.format(PRECISE_TEXT_XPATH, INIT_TEXT))).isDisplayed();
    }
}

