package com.briteerp.step_definitions;

import com.briteerp.pages.DataBasePage;
import com.briteerp.pages.HomePage;
import com.briteerp.pages.LoginPage;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class login_step_definition {
    @Given("user on the data base page")
    public void user_on_the_data_base_page() {
        System.out.println("User on the data base page");
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user selects the data base")
    public void user_selects_the_data_base() {
        System.out.println("Selecting the database");
        DataBasePage dataBasePage = new DataBasePage();
        dataBasePage.selectEnvironment();
    }

    @Then("login page should be displayed")
    public void login_page_should_be_displayed() {
        System.out.println("User on the login page");
    }

    @Then("user logs in using {string} and {string}")
    public void user_logs_in_using_and(String email, String password) {
        System.out.println("Entering the valid user credentials");
        LoginPage loginPage = new LoginPage();
        loginPage.login(email,password);
    }

    @Then("homepage should be displayed")
    public void homepage_should_be_displayed() {
        System.out.println("User at the homepage");
    }

    @Then("title should contains {string}")
    public void title_should_contains(String title) {
        System.out.println("Verifying the title contains " + title);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(title));
    }




}
