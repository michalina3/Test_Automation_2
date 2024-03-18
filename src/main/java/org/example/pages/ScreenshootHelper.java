package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.JavascriptExecutor;
import java.io.File;

public class ScreenshootHelper {

    private WebDriver driver;

    public ScreenshootHelper(WebDriver driver) {
        this.driver = driver;
    }

    public static void takeScreenshot(WebDriver driver, String screenshotName) {
        try {
            // Przewij do góry, aby upewnić się, że cała strona jest widoczna
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");

            // Wykonaj zrzut ekranu
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Zapisz zrzut ekranu w określonym katalogu
            File destination = new File("C:/repo" + screenshotName + ".png");
            FileHandler.copy(screenshotFile, destination);

            System.out.println("Zapisano zrzut ekranu: " + destination.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Błąd podczas robienia zrzutu ekranu: " + e.getMessage());
        }
    }
}
