package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class JavaScriptAlertsPage extends Form {
    private static final String PAGE_NAME = "JavaScript Alerts";
    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By CLICK_FOR_JS_ALERT_BUTTON = By.xpath("//button[@onclick='jsAlert()']");
    private final By CLICK_FOR_JS_CONFIRM_BUTTON = By.xpath("//button[@onclick='jsConfirm()']");
    private final By CLICK_FOR_JS_PROMPT_BUTTON = By.xpath("//button[@onclick='jsPrompt()']");
    private final By SUCCESS_MESSAGE = By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "You successfully clicked an alert"));
    private final By CONFIRM_MESSAGE = By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "You clicked: Ok"));
    private final By PROMPT_MESSAGE = By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "You entered: Hi, I am Jarvis"));
    private final IButton clickForJsAlertBtn = elementFactory.getButton(CLICK_FOR_JS_ALERT_BUTTON, "Click for JS alert");
    private final IButton clickForJsConfirmBtn = elementFactory.getButton(CLICK_FOR_JS_CONFIRM_BUTTON, "Click for JS confirm");
    private final IButton clickForJsPromptBtn = elementFactory.getButton(CLICK_FOR_JS_PROMPT_BUTTON, "Click for JS prompt");
    private final ILabel successLbl = elementFactory.getLabel(SUCCESS_MESSAGE, "Success");
    private final ILabel confirmLbl = elementFactory.getLabel(CONFIRM_MESSAGE, "Confirm");
    private final ILabel promptLbl = elementFactory.getLabel(PROMPT_MESSAGE, "Prompt");

    public JavaScriptAlertsPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, PAGE_NAME)), PAGE_NAME);
    }

    public void clickForJsAlertBtn() {
        clickForJsAlertBtn.click();
    }

    public boolean isSuccessLabelDisplayed() {
        return successLbl.state().isDisplayed();
    }

    public void clickForJsConfirmBtn() {
        clickForJsConfirmBtn.click();
    }

    public boolean isConfirmLabelDisplayed() {
        return confirmLbl.state().isDisplayed();
    }

    public void clickForJsPromptBtn() {
        clickForJsPromptBtn.click();
    }

    public boolean isPromptLabelDisplayed() {
        return promptLbl.state().isDisplayed();
    }
}
