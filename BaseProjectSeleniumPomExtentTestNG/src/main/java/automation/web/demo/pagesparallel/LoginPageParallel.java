package automation.web.demo.pagesparallel;

import automation.web.demo.reports.ExtentTestListener;
import automation.web.demo.utils.DriverFactory;
import automation.web.demo.utils.WaitUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPageParallel {
    WebDriver driver;
    WaitUtils wait;

    @FindBy(id = "user-name")
    WebElement usernameInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "login-button")
    WebElement loginButton;

    @FindBy(css = ".error-message-container.error")
    WebElement errorLoginMessagge;

    public LoginPageParallel() {
        this.driver = DriverFactory.getDriver();
        this.wait = new WaitUtils(DriverFactory.getDriver(), 10);
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public void enterUsername(String username) {
        wait.waitForVisibility(usernameInput).sendKeys(username);
    }

    public void enterPassword(String password) {
        wait.waitForVisibility(passwordInput).sendKeys(password);
    }

    public void clickLogin() {
        wait.waitToBeClickable(loginButton).click();
    }

    public String getTextErrorMessage() {
        return errorLoginMessagge.getText();
    }

    public void loginAs(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        ExtentTestListener.addevidence("DatosAccesoIngresados");
        clickLogin();
    }
}
