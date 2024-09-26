package pages;

import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static aquality.selenium.browser.AqualityServices.getBrowser;
import static constants.LocatorConstants.PRECISE_TEXT_XPATH;

public class ContextMenuPage extends Form {
    public static final String PAGE_NAME = "Context Menu";
    private final ITextBox CONTEXT_MENU_BOX = getElementFactory().getTextBox(By.id("hot-spot"), "Context Menu");

    public ContextMenuPage() {
        super(By.xpath(String.format(PRECISE_TEXT_XPATH, PAGE_NAME)), PAGE_NAME);
    }

    public void rightClick() {
        new Actions(getBrowser().getDriver()).contextClick(CONTEXT_MENU_BOX.getElement()).perform();
    }

    public Boolean isAlertMessageDisplayed() {
        return getBrowser().getDriver().switchTo().alert().getText().contains("You selected a context menu");
    }

    public String getAlertMessage() {
        return getBrowser().getDriver().switchTo().alert().getText();
    }

}
