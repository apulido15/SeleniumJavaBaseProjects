package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMain {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        Thread.sleep(1000);
        WebElement userName;
        userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        Thread.sleep(1000);
        WebElement password;
        password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        Thread.sleep(1000);
        WebElement buttonLogin;
        buttonLogin = driver.findElement(By.id("login-button"));
        buttonLogin.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
