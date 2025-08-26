package com.saucelabs.demo.pages;

import com.saucelabs.demo.utils.WaitUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    WaitUtils wait;

    @FindBy(id = "user-name")
    WebElement usernameInput;

    @FindBy(id = "sddsfdsf")
    WebElement passwordInput;

    @FindBy(id = "login-button")
    WebElement loginButton;

    @FindBy(css = ".error-message-container.error")
    WebElement errorLoginMessagge;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WaitUtils(driver, 10);
        PageFactory.initElements(driver, this);
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
        clickLogin();
    }
}
