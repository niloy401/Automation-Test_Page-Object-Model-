package tests;

import constants.MainPageNavigation;
import org.testng.Assert;
import pages.FileDownloadPage;
import utils.FileUtils;
import utils.SettingsTestData;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;

public class FileDownloadTest extends BaseTest {
    private final FileDownloadPage fileDownloadPage = new FileDownloadPage();
    private final String FILE_NAME = SettingsTestData.getFileData().getDownloadFile();
    private final String FILE_PATH = SettingsTestData.RESOURCES_PATH + FILE_NAME;
    private final File downloadedFile = new File(FILE_PATH);

    @Test
    public void fileDownloadTest() {
        mainPage.clickNavigationLink(MainPageNavigation.FILE_DOWNLOAD);
        Assert.assertTrue(fileDownloadPage.isFileDownloadLinkDisplayed(FILE_NAME), "File is not displayed");
        fileDownloadPage.clickFileDownloadLink(FILE_NAME);
        Assert.assertTrue(FileUtils.isFileExist(downloadedFile), "File is not downloaded");

    }

    @AfterMethod
    public void deleteFile() {
        FileUtils.deleteFileIfExist(downloadedFile);
    }
}
