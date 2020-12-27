package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private static String ENDPOINT = "/auth/login";

    private By userName = By.id("name");
    private By userPassword = By.id("password");
    private By Button = By.id("button_primary");
    private By errorMessage = By.linkText("Sorry, there was a problem.  ");


    public LoginPage(WebDriver driver, boolean openPageByUrl) {
        super(driver, openPageByUrl);
    }

    @Override
    protected void openPage() {
        driver.get(BASE_URL+ENDPOINT);
    }

    @Override
    public boolean isPageOpened() {
        return waits.isElementDisplayed(By.id("button_primary"));
    }


    public WebElement getUserName(){
        return waits.getElement(userName);
    }

    public WebElement getPassword(){
        return waits.getElement(userPassword);
    }

    public WebElement getButton(){
        return waits.getElement(Button);
    }
    public String getErrorMessage(){
        return driver.findElement(errorMessage).getText();
    }
}
