package baseEntities;

import browserService.ReadProperties;
import org.openqa.selenium.WebDriver;
import utils.Waits;

public abstract class BasePage {
    public WebDriver driver;
    public ReadProperties readProperties;
    public String BASE_URL;
    public Waits waits;


    protected abstract void openPage();

    public abstract boolean isPageOpened();

    public BasePage(WebDriver driver, boolean openPageByUrl) {
        this.readProperties = new ReadProperties();
        this.driver = driver;
        this.BASE_URL = readProperties.getURL();
        this.waits= new Waits(driver);


        if (openPageByUrl) {
            openPage();
        }
        waitForOpen();
    }

    /**
     * Waiting for page opening
     */
    protected void waitForOpen() {
        boolean isPageOpenedIndicator = isPageOpened();
        if (!isPageOpenedIndicator) {
            throw new AssertionError("Page was not opened");
        }
    }
}

