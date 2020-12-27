package utils;

import browserService.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public Waits(WebDriver driver) {
        this.driver = driver;
        ReadProperties readProperties = new ReadProperties();
        WebDriverWait webDriverWait = new WebDriverWait(driver,readProperties.getTimeOut());
    }

    public boolean isElementDisplayed (By by){
        try {
            webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        }catch (Exception ex){
            return false;
        }
    }

    public WebElement getElement (By by){
        try {
            return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
        }catch(Exception ex){
            return null;
        }
    }
}
