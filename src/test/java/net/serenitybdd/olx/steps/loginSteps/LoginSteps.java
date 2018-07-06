package net.serenitybdd.olx.steps.loginSteps;

import net.serenitybdd.olx.pageActions.LoginPageActions;
import net.serenitybdd.olx.pageActions.MainPageActions;
import net.serenitybdd.olx.pages.MyProfilePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class LoginSteps {
    @Steps
    MainPageActions mainPageActions;

    @Steps
    MyProfilePage myProfilePage;

    @Steps
    LoginPageActions loginPageActions;

    @Step
    public boolean verifyOlxMainPage() {
        return mainPageActions.verifyIfMainPageOpened();
    }

    @Step
    public void clickMyProfileLink() {
        mainPageActions.pressMyProfileLnk();
    }

    @Step
    public boolean verifyFacebookButtonPresent() {
        return loginPageActions.verifyFacebookButtonPresent();
    }

    @Step
    public void logInOlxWithCorrectCredentials() {
        loginPageActions.logInOlxWithCorrectCredentials(SystemEnvironmentVariables.
                createEnvironmentVariables().getProperty("fblogin"), SystemEnvironmentVariables.
                createEnvironmentVariables().getProperty("fbpassword"));
    }

    @Step
    public boolean verifyIfCustomerLoggedSuccessfully() {
        return myProfilePage.verifyIfCustomerLoggedSuccessfully();
    }

    @Step
    public void openHomePage() {
        mainPageActions.openHomePage();
    }

    @Step
        public void pressFacebookLoginButton() {
        loginPageActions.loginPageActions();
    }
}