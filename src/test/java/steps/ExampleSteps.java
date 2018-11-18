package steps;

import cucumber.api.java8.En;
import support.ExampleSupport;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ExampleSteps implements En {

    public ExampleSteps() {
        ExampleSupport exampleSupport = new ExampleSupport();

        Given("^there is an application$", () -> {
            assertThat(exampleSupport.isApplicationPresent(), is(true));
        });

        When("^I use the application$", () -> {
            assertThat(exampleSupport.canUseAppplication(), is(true));
        });

        Then("^the application works$", () -> {
            assertThat(exampleSupport.applicationWorks(), is(true));
        });
    }
}