package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPage {

    private WebDriver driver;

    public HeaderPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSignInButton() {
        return driver.findElement(By.cssSelector("[title='Log in to your customer account']"));
    }

    public void goToLoginPage(){
        getSignInButton().click();
    }


    public WebElement getSearchBar(){
        return driver.findElement(By.name("s"));
    }
    public void searchOnPage(String textToSearch){
        getSearchBar().sendKeys(textToSearch);
    }

    public void goToProductPage(){
        getSearchBar().sendKeys(Keys.ENTER);
    }






}
