package net.serenitybdd.olx.pageActions;

import net.serenitybdd.olx.pages.MainPage;

public class MainPageActions {

    MainPage mainPage;

    public void pressMyProfileLnk() {
        mainPage.pressMyProfileLnk();
    }

    public boolean verifyIfMainPageOpened() {
        return mainPage.verifyIfMainPageOpened();
    }

    public void openHomePage() {
        mainPage.open();
    }
}