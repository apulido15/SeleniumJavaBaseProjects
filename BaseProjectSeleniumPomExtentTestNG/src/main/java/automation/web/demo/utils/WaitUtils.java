package automation.web.demo.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import java.time.Duration;

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
            logError("Elemento no clickeable", element);
            throw e;
        }
    }

    private void logError(String message, WebElement element) {
        System.err.println("[WaitUtils] ⚠️  ERROR: " + message);
    }
}
