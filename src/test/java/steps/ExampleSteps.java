package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import support.ExampleSupport;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ExampleSteps {
    ExampleSupport exampleSupport = new ExampleSupport();

    @Given("^there is an application$")
    public void thereIsAnApplication() {
        assertThat(exampleSupport.isApplicationPresent(), is(true));
    }

    @When("^I use the application$")
    public void iUseTheApplication() {
        assertThat(exampleSupport.canUseAppplication(), is(true));
    }

    @Then("^the application works$")
    public void theApplicationWorks() {
        assertThat(exampleSupport.applicationWorks(), is(true));
    }
}