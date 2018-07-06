package net.serenitybdd.olx.pageActions;

import net.serenitybdd.olx.pages.FacebookLoginPage;

public class LoginPageActions {
    FacebookLoginPage facebookLoginPage;

    public boolean verifyFacebookButtonPresent() {
        return facebookLoginPage.verifyFacebookButtonPresent();
    }

    public void logInOlxWithCorrectCredentials(String logVal, String passVal) {
        facebookLoginPage.fillFacebookLoginField(logVal);
        facebookLoginPage.fillFacebookPasswordField(passVal);
        facebookLoginPage.pressLoginButton();
    }

    public void loginPageActions() {
        facebookLoginPage.pressFacebookLoginButton();
    }
}