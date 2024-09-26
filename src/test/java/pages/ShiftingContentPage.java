package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class ShiftingContentPage extends Form {
    private static final String PAGE_NAME = "Shifting Content";
    private final IButton example1 = getElementFactory().getButton(By.xpath("//a[contains(text(),'Example 1')]"), "Example 1");
    private final IButton example2 = getElementFactory().getButton(By.xpath("//a[contains(text(),'Example 2')]"), "Example 2");
    private final IButton example3 = getElementFactory().getButton(By.xpath("//a[contains(text(),'Example 3')]"), "Example 3");
    private final ILink  home = getElementFactory().getLink(By.xpath("//a[contains(text(),'Home')]"), "Home");
    private final ILabel mainpage = getElementFactory().getLabel(By.tagName("h1"), "Main page");



    public ShiftingContentPage() {
       super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, PAGE_NAME)), PAGE_NAME);
    }

    public void clickExample1() {
        example1.click();
    }

    public void clickHome() {
        home.click();
    }

    public boolean isMainpageOpened() {
        return mainpage.state().isDisplayed();
    }

    public void clickExample2() {
        example2.click();
    }

    public void clickExample3() {
        example3.click();
    }
}
