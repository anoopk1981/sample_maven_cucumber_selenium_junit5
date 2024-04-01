package com.automatedtest.sample.homepage;

import com.automatedtest.sample.basepage.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage{

    private static final String HOME_PAGE_URL = "https://www.google.com";

    @FindBy(xpath = "//img[@alt='Google']")
    private WebElement logo;

    @FindBy(xpath = "//textarea[@maxlength='2048']")
    private WebElement searchInput;


    HomePage() {
        PageFactory.initElements(driver, this);
    }

    void goToHomePage(){
        driver.get(HOME_PAGE_URL);
        wait.forLoading(5);
    }

    void checkLogoDisplay() {
        wait.forElementToBeDisplayed(5, this.logo, "Logo");
    }

    String getTitle() {
        return driver.getTitle();
    }

    void checkSearchBarDisplay() {
        wait.forElementToBeDisplayed(10, this.searchInput, "Search Bar");
    }

    void searchFor(String searchValue) throws InterruptedException {
        this.searchInput.sendKeys(searchValue);
        this.searchInput.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }
}
