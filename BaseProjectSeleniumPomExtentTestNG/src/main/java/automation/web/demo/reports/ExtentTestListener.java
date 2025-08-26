package automation.web.demo.reports;

import automation.web.demo.utils.DriverFactory;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.*;
import java.util.logging.Logger;

public class ExtentTestListener implements ITestListener {
    private static ExtentReports extent;
    private static final ThreadLocal<ExtentTest> testThread = new ThreadLocal<>();

    @Override
    public void onStart(ITestContext context) {
        extent = ExtentManager.getInstance();
    }

    @Override
    public void onTestStart(ITestResult result) {
        String browser = result.getTestContext().getCurrentXmlTest().getParameter("browser");
        if (browser == null) {
            browser = System.getProperty("browser", "chrome");
        }
        ExtentTest test = extent.createTest(result.getMethod().getMethodName() + " - " + browser);
        test.assignDevice(browser);
        testThread.set(test);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        testThread.get().log(Status.PASS, "✅ Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        testThread.get().log(Status.FAIL, "❌ Test Failed: " + result.getThrowable());

        if (DriverFactory.getDriver() != null) {
            String screenshotPath = ScreenShotsHelper.takeScreenshot(DriverFactory.getDriver(), result.getMethod().getMethodName());
            testThread.get().addScreenCaptureFromPath(screenshotPath);
        }
    }

    public static void addevidence(String testName) {
        if (DriverFactory.getDriver() != null) {
            String screenshotPath = ScreenShotsHelper.takeScreenshot(DriverFactory.getDriver(), testName);
            try {
                testThread.get().addScreenCaptureFromPath(screenshotPath, "Evidencia: " + testName);
            } catch (Exception e) {
                Logger.getAnonymousLogger().severe(e.getMessage());
            }
        }
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}

