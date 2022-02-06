package serenity.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import serenity.steps.serenity.EndUserSteps;

public class AdderSteps {
    
    @Steps
    EndUserSteps endUser;

    @Given("the user is on the home page")
    public void givenTheUserIsOnTheHomePage() {
        endUser.is_the_home_page();
    }

    @When("the user enter a number '$number'")
    public void whenTheUserEnteraNumber(String number) {
        endUser.changed(number);
    }

    @Then("they should see the result '$number'")
    public void thenTheyShouldSeeANewNumber(String number) {
        endUser.should_see_number(number);
    }
}