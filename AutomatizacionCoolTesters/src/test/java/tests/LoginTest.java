package tests;

import com.saucelabs.demo.pages.LoginPage;
import org.example.selenium.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void testLoginCorrecto() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
        HomePage homePage = new HomePage(driver);
        assertThat(homePage.isVisibleListProduct(), equalTo(true));
    }

    @Test
    public void testLoginFallido() {
        loginPage.enterUsername("fdgdfg");
        loginPage.enterPassword("dfgdfg");
        loginPage.clickLogin();
        assertThat(loginPage.getTextErrorMessage(), equalTo("Epic sadface: Username and password do not match any user in this service"));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
