package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartPage {

    private WebDriver driver;

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getProceedToCheckoutButton() {
        return driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a"));
    }

    public void goToShoppingCartPage(){
        getProceedToCheckoutButton().click();
    }



}
