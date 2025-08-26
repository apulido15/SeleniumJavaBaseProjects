package automation.web.demo.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void setDriver(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions co = new ChromeOptions();
            co.addArguments("--headless=new");
            driver.set(new ChromeDriver(co));
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver.set(new FirefoxDriver());
        } else if (browser.equalsIgnoreCase("safari")) {
            driver.set(new SafariDriver());
        } else {
            throw new IllegalArgumentException("Navegador no soportado: " + browser);
        }
    }

    public static void cleanupDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}
