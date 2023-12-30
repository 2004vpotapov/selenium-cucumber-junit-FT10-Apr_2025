package com.cydeo.step_definitions;

import com.cydeo.pages.R_DashboardPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class R_Dashboard_StepDef {

    R_DashboardPage dashboardPage = new R_DashboardPage();

    @Then("user should be able to see following modules")
    public void user_should_be_able_to_see_following_modules(List<String> expectedModules) {

        BrowserUtils.sleep(3);

//        List<String> actualModules = new ArrayList<>();
//
//        for (WebElement eachModule : dashboardPage.allTopModules) {
//            actualModules.add(eachModule.getText());
//        }

       // Assert.assertEquals(expectedModules,actualModules);

        Assert.assertEquals(expectedModules,BrowserUtils.getElementsText(dashboardPage.allTopModules));

    }


}
