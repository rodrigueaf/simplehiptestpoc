package com.rodrigue.simplehiptestpoc.e2e;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
    public Actionwords actionwords = new Actionwords();

    @When("^go to \"(.*)\" page$")
    public void goToP1Page(String p1) {
        actionwords.goToP1Page(p1);
    }

    @Then("^we have 2 menu links$")
    public void weHave2MenuLinks() {
        actionwords.weHave2MenuLinks();
    }

    @Given("^we are on \"(.*)\" page$")
    public void weAreOnP1Page(String p1) {
        actionwords.weAreOnP1Page(p1);
    }

    @When("^we click on \"(.*)\" link$")
    public void weClickOnP1Link(String p1) {
        actionwords.weClickOnP1Link(p1);
    }

    @Then("^we go to \"(.*)\" page$")
    public void weGoToP1Page(String p1) {
        actionwords.weGoToP1Page(p1);
    }

    @Then("^it shows \"(.*)\"$")
    public void itShowsP1(String p1) {
        actionwords.itShowsP1(p1);
    }
}