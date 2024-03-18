package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductCartPage {
    private WebDriver driver;

    public ProductCartPage(WebDriver driver) {
        this.driver = driver;
    }


    public void selectSize(String size) {

        WebElement sizeDropdown = driver.findElement(By.id("group_1"));
        Select sizeSelect = new Select(sizeDropdown);
        sizeSelect.selectByValue("2");

    }

        public void setQuantity(int numberOfClicks) {
            WebElement element = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[1]/div/span[3]/button[1]"));
            for (int i = 0; i < numberOfClicks; i++) {
                element.click();
            }
        }

        public WebElement getAddToCartButton(){
        return driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
        }
        public void goToCartPage(){
        getAddToCartButton().click();
        }
}