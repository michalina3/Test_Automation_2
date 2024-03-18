package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultsPage {
    private WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void hoverAndClickQuickView() {
        // Znajdź miniaturkę (lub dowolny element, na który musisz najechać)
        WebElement thumbnail = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/div[1]/article/div/div[2]/h2/a"));

        // Znajdź element "Quick view"
        WebElement quickView = driver.findElement(By.cssSelector("a.quick-view.js-quick-view"));

        // Utwórz obiekt klasy Actions
        Actions actions = new Actions(driver);

        // Najedź kursorem na miniaturkę
        actions.moveToElement(thumbnail).build().perform();

        // Kliknij na "Quick view"
        quickView.click();
    }


}
