package com.automatedtest.sample.homepage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

    private HomePage homePage;

    public HomePageSteps() {
        this.homePage = new HomePage();
    }

    @Given("I am on the Google homepage")
    public void iAmOnTheGoogleHomepage() {
        this.homePage.goToHomePage();
    }

    @When("I search for {string}")
    public void iSearchFor(String searchTerm) throws InterruptedException {
        this.homePage.searchFor(searchTerm);
    }

    @Then("I should see {string} in the search results title")
    public void iShouldSeeInTheSearchResultsTitle(String expectedResult) {
        String actualTitle = this.homePage.getTitle();
        assert actualTitle.contains(expectedResult) : "Expected title to contain " + expectedResult + " but it was " + actualTitle;
    }
}
