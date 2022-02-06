package serenity.steps.serenity.;

public class AdderSteps {
    
    @Steps
    EndUserSteps endUser;

    @Given("the user is on the home page")
    public void givenTheUserIsOnTheHomePage() {
        endUser.is_the_home_page();
    }

    @When("the user enter a number '$number'")
    public void whenTheUserEnteraNumber(String number) {
        endUser.looks_for(number);
    }

    @Then("they should see the result '$number'")
    public void thenTheyShouldSeeANewNumber(String number) {
        endUser.should_see_number(number);
    }
}