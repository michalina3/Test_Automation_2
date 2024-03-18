package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage {

    private WebDriver driver;

    public ShoppingCartPage (WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getCheckoutButton() {
        return driver.findElement(By.cssSelector("a.btn.btn-primary"));
    }

    public void goToOrderPage(){
        getCheckoutButton().click();
    }
}
