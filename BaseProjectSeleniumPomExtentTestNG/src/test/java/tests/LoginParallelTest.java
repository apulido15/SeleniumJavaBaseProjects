package tests;

import automation.web.demo.pagesparallel.HomePageParallel;
import automation.web.demo.pagesparallel.LoginPageParallel;
import automation.web.demo.reports.ExtentTestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@Listeners(ExtentTestListener.class)
public class LoginParallelTest extends BaseParallelTest{

    @Test
    public void testLoginExitoso() {
        LoginPageParallel loginPage = new LoginPageParallel();
        loginPage.loginAs("standard_user", "secret_sauce");
        HomePageParallel homePage = new HomePageParallel();
        assertThat(homePage.isVisibleListProduct(), equalTo(true));
        ExtentTestListener.addevidence("LoginExitoso");
    }

    @Parameters("browser")
    @Test
    public void testLoginFallido(@Optional("ajsnn") String browser) {
        LoginPageParallel loginPage = new LoginPageParallel();
        loginPage.loginAs(browser, "iiakkdjj");
        assertThat(loginPage.getTextErrorMessage(), equalTo("Epic sadface: Username and password do not match any user in this service"));
        ExtentTestListener.addevidence("LoginFallido");
    }

    @Test
    public void testLoginQueFalle() {
        LoginPageParallel loginPage = new LoginPageParallel();
        loginPage.loginAs("ghfgh", "fghfgh");
        HomePageParallel homePage = new HomePageParallel();
        assertThat(homePage.isVisibleListProduct(), equalTo(true));
        ExtentTestListener.addevidence("LoginExitoso");
    }
}
