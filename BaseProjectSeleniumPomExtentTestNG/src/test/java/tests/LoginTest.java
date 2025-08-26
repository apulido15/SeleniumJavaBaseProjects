package tests;

import automation.web.demo.pages.HomePage;
import automation.web.demo.pages.LoginPage;
import automation.web.demo.reports.ExtentTestListener;
import automation.web.demo.utils.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@Listeners(ExtentTestListener.class)
public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        DriverFactory.setDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    @Test(dataProvider = "excelData", dataProviderClass = DataProviders.class)
    public void testLoginCorrecto(String username, String password) {
        loginPage.loginAs(username, password);
        HomePage homePage = new HomePage(driver);
        assertThat(homePage.isVisibleListProduct(), equalTo(true));
        ExtentTestListener.addevidence("LoginExitoso");
    }

    @Test
    public void testLoginFallido() {
        loginPage.loginAs("ahnndii", "iiakkdjj");
        assertThat(loginPage.getTextErrorMessage(), equalTo("Epic sadface: Username and password do not match any user in this service"));
        ExtentTestListener.addevidence("LoginFallido");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
