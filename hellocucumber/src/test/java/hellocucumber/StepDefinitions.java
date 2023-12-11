package hellocucumber;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

    String today;
    String isItFriday;
    @Given("today is Sunday")
    public void today_is_sunday() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        today = "Sunday";
    }
    @Given("today is Friday")
    public void today_is_friday() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        today = "Friday";
    }
    @Given("today is anything else!")
    public void today_is_anything_else() {
        // Write code here that turns the phrase above into concrete actions
        today = "anything else!";

    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        if (today == "Friday"){
            isItFriday="TGIF";
        }
        else{
            isItFriday="Nope";
        }
    }
    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        assertEquals(string, isItFriday);

    }

}

class IsItFriday {
    static String isItFriday(String today) {
        return null;
    }
}
