package net.serenitybdd.olx.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("/")
public class MyProfilePage extends PageObject {
    @FindBy(xpath = "//*[@id='postNewAdLink']/span")
    WebElement myProfileNewAdvTitle;

    public boolean verifyIfCustomerLoggedSuccessfully() {
        return myProfileNewAdvTitle.isDisplayed();
    }
}