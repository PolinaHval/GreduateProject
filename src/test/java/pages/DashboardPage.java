package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BasePage {

    private String ENDPOINT ="/dashboard";

    private By AddProjectSelector=By.id("navigation-empty-addproject");



    public DashboardPage(WebDriver driver, boolean openPageByUrl) {
        super(driver, openPageByUrl);
    }

    @Override
    protected void openPage() {
        driver.get(BASE_URL+ENDPOINT);

    }

    @Override
    public boolean isPageOpened() {
        return waits.isElementDisplayed(By.id("navigation-empty-addproject"));
    }

    public WebElement getButtonAddProject(){
        return waits.getElement(AddProjectSelector);
    }
}
