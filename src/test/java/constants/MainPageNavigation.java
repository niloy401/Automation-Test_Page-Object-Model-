package constants;

import lombok.Getter;

@Getter
public enum MainPageNavigation {
    JAVASCRIPT_ALERT("JavaScript Alerts"),
    SORTABLE_DATA_TABLES("Sortable Data Tables"),
    DYNAMIC_CONTROLS("Dynamic Controls"),
    FILE_DOWNLOAD("File Download"),
    FILE_UPLOAD("File Upload"),
    BASIC_AUTH("Basic Auth"),
    AD_PAGE("Entry Ad"),
    SHIFTING_CONTENT("Shifting Content"),
    ENTRY_AD("Entry Ad"),
    FRAMES("Frames"),
    IFRAME("iFrame"),
    Multi_Tabs("Multiple Windows"),
    NESTED_FRAMES("Nested Frames"),
    CONTEXT_MENU("Context Menu"),
    DYNAMIC_LOADING("Dynamic Loading");

    private final String label;

    private MainPageNavigation(String label) {
        this.label = label;
    }
}
