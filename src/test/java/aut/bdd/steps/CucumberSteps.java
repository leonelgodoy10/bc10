package aut.bdd.steps;

import io.cucumber.java8.En;
import org.junit.jupiter.api.Assertions;

public class CucumberSteps implements En {

    //Constructor -> le vamos a pasar las pages con las que interactua
    public CucumberSteps(){

        When("the Maker starts a game", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assertions.assertTrue(true);
        });

        Then("the Maker waits for a Breaker to join", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assertions.assertTrue(true);
        });

        Given("the Maker has started a game with the word {string}", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
            Assertions.assertTrue(true);
        });
        When("the Breaker joins the Maker's game", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assertions.assertTrue(true);
        });

        Then("the Breaker must guess a word with {int} characters", (Integer int1) -> {
            // Write code here that turns the phrase above into concrete actions
            Assertions.assertTrue(true);
        });


    }


}
