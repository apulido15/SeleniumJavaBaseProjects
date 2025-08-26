package automation.web.demo.reports;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import static automation.web.demo.utils.GlobalConf.FOLDER;
import static automation.web.demo.utils.GlobalConf.PATH;

public class ScreenShotsHelper {
    private static final String FULL_PATH = PATH + FOLDER;

    public static String takeScreenshot(WebDriver driver, String testName) {
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmssSSSS").format(new Date());
        String screenshotName = testName + "_" + timestamp + "_" + Thread.currentThread().threadId() + ".png";
        String screenshotPath = FULL_PATH + screenshotName;

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            Files.createDirectories(new File(FULL_PATH).toPath());
            Files.copy(src.toPath(), new File(screenshotPath).toPath());
        } catch (IOException e) {
            Logger.getAnonymousLogger().severe(e.getMessage());
        }
        return "./" + FOLDER + screenshotName;
    }
}
