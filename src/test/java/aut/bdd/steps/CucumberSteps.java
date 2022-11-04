package aut.bdd.steps;

import aut.bdd.pages.CucumberHomePage;
import framework.engine.selenium.DriverFactory;
import io.cucumber.java8.En;
import org.junit.jupiter.api.Assertions;

public class CucumberSteps implements En {
    //Solicitamos las page no instanciadas
    CucumberHomePage cucumberHomePage;
    //Constructor -> le vamos a pasar las pages con las que interactua
    public CucumberSteps(CucumberHomePage cucumberHomePage){
        this.cucumberHomePage =cucumberHomePage;




        When("the Maker starts a game", () -> {
            DriverFactory.initDriver();
            cucumberHomePage.navegarAlHome();
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
