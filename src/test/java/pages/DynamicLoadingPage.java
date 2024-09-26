package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

import static aquality.selenium.browser.AqualityServices.getBrowser;

;

public class DynamicLoadingPage extends Form {
    private static final String NAME = "Dynamic Loading";
    private final IButton example1 = getElementFactory().getButton(By.xpath("//a[contains(text(),'Example 1')]"), "Example 1");
    private final IButton example2 = getElementFactory().getButton(By.xpath("//a[contains(text(),'Example 2')]"), "Example 2");
    private final IButton startButton = getElementFactory().getButton(By.xpath("//button"), "Start");
    private final ILabel textlbl = getElementFactory().getLabel(By.xpath("//h4[contains(text(),'Hello World!')]"), "Hello World!");
    private final ILabel textlbl2 = getElementFactory().getLabel(By.xpath("//h4[contains(text(),'Example 1')]"), "Example 1: Element on page that is hidden");
    private final ILabel textlbl3 = getElementFactory().getLabel(By.xpath("//h4[contains(text(),'Example 2')]"), "Example 2: Example 2: Element rendered after the fact");

    public DynamicLoadingPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }

    public void clickExample1() {
        example1.click();
    }

    public void clickExample2() {
        example2.click();
    }

    public void clickStartButton() {
        startButton.click();
    }

    public void waitForPageToLoad() {
        getBrowser().waitForPageToLoad();
    }

    public String isTextDisplayed() {
        return textlbl.getText();
    }

    public String isPage1TextDisplayed() {
        return textlbl2.getText();
    }

    public String isPage2TextDisplayed() {
        return textlbl3.getText();
    }
}
