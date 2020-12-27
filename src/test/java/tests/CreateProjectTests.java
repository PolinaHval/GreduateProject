package tests;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.AddProjectSteps;

public class CreateProjectTests extends BaseTest {

    @Test
    public void AddProjectTest(){
        AddProjectSteps addProjectSteps = new AddProjectSteps(driver);
        addProjectSteps.addProject(readProperties.getUserName(), readProperties.getPassword(),
                readProperties.getName());

        Assert.assertTrue(true);
    }
}
