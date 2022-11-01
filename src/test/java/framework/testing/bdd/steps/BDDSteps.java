package framework.testing.bdd.steps;

import framework.engine.selenium.DriverFactory;
import framework.testing.bdd.pages.BddHomePage;
import io.cucumber.java8.En;
import org.junit.jupiter.api.Assertions;

public class BDDSteps implements En {

    BddHomePage bddHomePage;

    public BDDSteps(BddHomePage bddHomePage){
        this.bddHomePage = bddHomePage;


        Given("que quiero que se ejecute correctamente este test", () -> {
            DriverFactory.initDriver();
            bddHomePage.irAHomePage();
            bddHomePage.buscarTexto("Hola");
        });

        When("coloco assertTrue\\(true)", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assertions.assertTrue(true);
        });

        Then("el test se ejecuto ok, para validar la correcta ejecucion de cucumber en el framework", () -> {
            // Write code here that turns the phrase above into concrete actions
            DriverFactory.closeDriver();
            Assertions.assertTrue(true);
        });


    }

}
