package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProject extends BasePage {
    private String ENDPOINT = "/admin/projects/add/1";

    private By nameSelector = By.id("name");
    private By addButton = By.id("accept");

    public AddProject(WebDriver driver, boolean openPageByUrl) {
        super(driver, openPageByUrl);
    }

    @Override
    protected void openPage() {
        driver.get(BASE_URL+ENDPOINT);

    }

    @Override
    public boolean isPageOpened() {
        return waits.isElementDisplayed(By.id("accept"));
    }


    public WebElement getName (){
        return waits.getElement(nameSelector);
    }

    public WebElement getButton (){
        return waits.getElement(addButton);
    }

}
