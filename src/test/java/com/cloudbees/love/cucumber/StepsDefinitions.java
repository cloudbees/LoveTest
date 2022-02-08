package com.cloudbees.love.cucumber;

import com.cloudbees.love.CloudBees;
import com.cloudbees.love.Developers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StepsDefinitions {

    public static final String TO_DELIVER_GREAT_SOFTWARE = "to deliver great software";
    private Developers developers;
    private CloudBees cloudbees;

    @Given("Developers love to deliver great software")
    public void developers_love_to_deliver_great_software() {
        developers = new Developers(TO_DELIVER_GREAT_SOFTWARE);
    }

    @When("CloudBees enables developers to focus on delivering great software")
    public void cloudbees_enables_developers_to_focus_on_delivering_great_software() {
        cloudbees = new CloudBees(TO_DELIVER_GREAT_SOFTWARE);
    }
    @Then("Developers love CloudBees")
    public void developers_love_CloudBees() {
        assertThat(developers.love(cloudbees),
                is(true));
    }
}
