package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.AddProject;
import pages.DashboardPage;

public class AddProjectSteps {

    private WebDriver driver;

    public AddProjectSteps(WebDriver driver) {
        this.driver = driver;
    }

    @Step
    public void addProject(String userName, String password,String name){
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.login(userName, password);
        DashboardPage dashboardPage =new DashboardPage(driver,true);
        dashboardPage.getButtonAddProject().click();
        AddProject addProject = new AddProject(driver,true);
        addProject.getName().sendKeys(name);
        addProject.getButton().click();
    }
}
