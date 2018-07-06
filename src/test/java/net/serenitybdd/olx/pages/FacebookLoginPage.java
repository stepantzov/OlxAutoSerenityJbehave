package net.serenitybdd.olx.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class FacebookLoginPage extends PageObject {
    @FindBy(css = "div.login-box:nth-child(2) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > div:nth-child(1) > form:nth-child(1) > a:nth-child(1)")
    private WebElement facebookBtn;

    @FindBy(xpath = "//*[@id='email']")
    private WebElement loginEnterFld;

    @FindBy(xpath = "//button[@id='loginbutton']")
    private WebElement loginButton;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordFld;


    public void fillFacebookLoginField(String facebookLoginValue) {
        loginEnterFld.sendKeys(facebookLoginValue);
    }

    public void fillFacebookPasswordField(String facebookPasswordValue) {
        passwordFld.sendKeys(facebookPasswordValue);
    }

    public void pressFacebookLoginButton() {
        facebookBtn.click();
    }

    public boolean verifyFacebookButtonPresent() {
        return facebookBtn.isDisplayed();
    }

    public void pressLoginButton() {
        loginButton.click();
    }
}