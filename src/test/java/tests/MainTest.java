package tests;

import baseEntities.BaseTest;
import browserService.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import steps.LoginSteps;

public class MainTest extends BaseTest {

    @Test
    public void loginTests(){
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.login(readProperties.getUserName(), readProperties.getPassword());

        Assert.assertTrue(true);
    }


}
