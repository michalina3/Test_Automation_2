package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage {

    private WebDriver driver;

    public OrderPage (WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getContinueButton() {
        return driver.findElement(By.name("confirm-addresses"));
    }

    public void goToShippingMethod(){
        getContinueButton().click();
    }

    public WebElement getConfirmDeliveryButton(){
        return driver.findElement(By.name("confirmDeliveryOption"));
    }
    public void goToPayment(){
        getConfirmDeliveryButton().click();
    }

    public WebElement getPaymentButton(){
        return driver.findElement(By.name("payment-option"));
    }
    public void selectPayment(){
        getPaymentButton().click();
    }
    public WebElement getApproveButton(){
        return driver.findElement(By.id("conditions_to_approve[terms-and-conditions]"));
    }
    public void approveConditions() {
        getApproveButton().click();
    }

    public WebElement getOrderButton(){
        return driver.findElement(By.xpath("//*[@id=\"payment-confirmation\"]/div[1]/button"));
    }
    public void goToOrderConfirmation() {
        getOrderButton().click();
    }






}
