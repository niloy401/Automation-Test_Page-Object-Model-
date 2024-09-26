package utils;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class BrowserUtils {

    public static void switchToWindow(String windowHandle) {
        getBrowser().getDriver().switchTo().window(windowHandle);
    }

    public static void closeWindow() {
        getBrowser().windows().close();
    }

    public static void switchToFrame(String frameName) {
        getBrowser().getDriver().switchTo().frame(frameName);
    }

    public static void switchToParentFrame() {
        getBrowser().getDriver().switchTo().parentFrame();
    }

    public static void switchToDefaultContent() {
        getBrowser().getDriver().switchTo().defaultContent();
    }

}
