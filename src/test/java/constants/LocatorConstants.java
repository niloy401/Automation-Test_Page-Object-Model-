package constants;

import lombok.experimental.UtilityClass;

@UtilityClass
public class LocatorConstants {
    public static final String PRECISE_TEXT_XPATH = "//*[text()='%s']";
    public static final String PARTICULAR_TEXT_XPATH = "//*[contains(text(),'%s')]";
}
