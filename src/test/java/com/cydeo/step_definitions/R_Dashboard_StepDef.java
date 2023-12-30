package com.cydeo.step_definitions;

import com.cydeo.pages.R_DashboardPage;
import com.cydeo.pages.R_VytrackLoginPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class R_Dashboard_StepDef {

    R_DashboardPage dashboardPage = new R_DashboardPage();
    R_VytrackLoginPage loginPage = new R_VytrackLoginPage();

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

    @When("user enters below credentials")
    public void user_enters_below_credentials(Map<String,String> credentials) {
      loginPage.login(credentials.get("username"),credentials.get("password"));

    }


    @Then("user should be able to see following information")
    public void user_should_be_able_to_see_following_information(Map<String,String> userInfo) {

        BrowserUtils.sleep(3);

        String actualUserInfo = dashboardPage.userInfo.getText(); // John Doe

       String expectedUserInfo = userInfo.get("firstname") + " " + userInfo.get("lastname");

       Assert.assertEquals(expectedUserInfo,actualUserInfo);
    }


}
