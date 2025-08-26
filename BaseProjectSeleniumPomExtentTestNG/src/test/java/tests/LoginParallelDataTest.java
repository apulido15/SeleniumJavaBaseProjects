package tests;

import automation.web.demo.pagesparallel.HomePageParallel;
import automation.web.demo.pagesparallel.LoginPageParallel;
import automation.web.demo.reports.ExtentTestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@Listeners(ExtentTestListener.class)
public class LoginParallelDataTest extends BaseParallelTest{

    @Test(dataProvider = "csvData", dataProviderClass = DataProviders.class)
    public void testLoginExitoso(String userName, String password) {
        LoginPageParallel loginPage = new LoginPageParallel();
        loginPage.loginAs(userName, password);
        HomePageParallel homePage = new HomePageParallel();
        assertThat(homePage.isVisibleListProduct(), equalTo(true));
        ExtentTestListener.addevidence("LoginExitoso");
    }

    @Test(dataProvider = "jsonData", dataProviderClass = DataProviders.class)
    public void testLoginFallido(Map<String, String> data) {
        LoginPageParallel loginPage = new LoginPageParallel();
        loginPage.loginAs(data.get("username"), data.get("password"));
        assertThat(loginPage.getTextErrorMessage(), equalTo(data.get("errorMessage")));
        ExtentTestListener.addevidence("LoginFallido");
    }
}
