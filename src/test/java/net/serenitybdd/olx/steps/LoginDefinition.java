package net.serenitybdd.olx.steps;

import net.serenitybdd.jbehave.SerenityStories;
import net.serenitybdd.olx.steps.loginSteps.LoginSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

public class LoginDefinition extends SerenityStories {
    @Steps
    LoginSteps loginSteps;

    @Given("Customer is on the Olx site main page")
    public void openOlxStartPage() {
        loginSteps.openHomePage();
        Assert.assertTrue("Main page is not opened.", loginSteps.verifyOlxMainPage());
    }

    @When("Customer want to log in Olx site by using 'My Profile' link")
    public void pressMyProfileLink() {
        loginSteps.clickMyProfileLink();
    }

    @Then("Customer has been redirected to Login Page")
    public void verifyIfLoginPageOpened() {
        Assert.assertTrue("Facebook button is missing.", loginSteps.verifyFacebookButtonPresent());
    }

    @Then("He is able lo log to Olx by using correct credentials")
    public void logToOlxWithCorrectCredentials() {
        loginSteps.pressFacebookLoginButton();
        loginSteps.logInOlxWithCorrectCredentials();

        Assert.assertTrue("Customer is not logged to Olx.", loginSteps.verifyIfCustomerLoggedSuccessfully());
    }
}