package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getEmailInputField(){
        return driver.findElement(By.id("field-email"));
    }

    public WebElement getPasswordInputField(){
        return driver.findElement(By.id("field-password"));
    }

    public WebElement getLoginButton(){
        return driver.findElement(By.id("submit-login"));
    }

    public void submitLogin(String name, String password){
        getEmailInputField().sendKeys(name);
        getPasswordInputField().sendKeys(password);
        getLoginButton().click();
    }
}
