package framework.testing.bdd.steps;

import io.cucumber.java8.En;
import org.junit.jupiter.api.Assertions;

public class BDDSteps implements En {

    public BDDSteps(){


        Given("que quiero que se ejecute correctamente este test", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assertions.assertTrue(true);
        });

        When("coloco assertTrue\\(true)", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assertions.assertTrue(true);
        });

        Then("el test se ejecuto ok, para validar la correcta ejecucion de cucumber en el framework", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assertions.assertTrue(true);
        });


    }

}
