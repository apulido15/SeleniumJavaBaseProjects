package com.saucelabs.demo.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;

public class WaitUtils {
    private final WebDriver driver;
    private final int timeoutInSeconds;

    public WaitUtils(WebDriver driver, int timeoutInSeconds) {
        this.driver = driver;
        this.timeoutInSeconds = timeoutInSeconds;
    }

    private FluentWait<WebDriver> getFluentWait() {
        return new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeoutInSeconds))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
    }

    public WebElement waitForVisibility(WebElement element) {
        try {
            return getFluentWait().until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException e) {
            logError("Elemento no visible", element);
            throw e;
        }
    }

    public WebElement waitToBeClickable(WebElement element) {
        try {
            return getFluentWait().until(ExpectedConditions.elementToBeClickable(element));
        } catch (TimeoutException e) {
            logError("No es posible dar click al elemento", element);
            throw e;
        }
    }

    private void logError(String message, WebElement element) {
        System.err.println("[WaitUtils] ⚠️  ERROR: " + message);
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            String filename = "target/screenshots/error_" + System.currentTimeMillis() + ".png";
            FileUtils.copyFile(src, new File(filename));
            System.out.println("📸 Screenshot guardado en: " + filename);
        } catch (IOException e) {
            System.err.println("Error al guardar screenshot: " + e.getMessage());
        }
    }
}
