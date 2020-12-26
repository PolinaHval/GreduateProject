package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginSteps {
    private WebDriver driver;

    public LoginSteps(WebDriver driver) {
        this.driver = driver;
    }




    @Step
    public void login (String userName,String password){
        LoginPage loginPage = new LoginPage(driver,true );
        loginPage.getUserName().sendKeys(userName);
        loginPage.getPassword().sendKeys(password);
        loginPage.getButton().click();


    }


}
