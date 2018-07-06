package net.serenitybdd.olx.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.olx.ua/")
public class MainPage extends PageObject {

    @FindBy(xpath = "//*[@id='topLoginLink']/span/strong")
    private WebElement myProfileLink;

    @FindBy(xpath = "//a[@href='https://www.olx.ua']")
    private WebElement homePageLogo;

    public boolean verifyIfMainPageOpened() {
        return homePageLogo.isDisplayed();
    }

    public void pressMyProfileLnk() {
        myProfileLink.click();
    }
}