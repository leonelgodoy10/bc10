package framework.testing.bdd.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import lombok.extern.apachecommons.CommonsLog;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"},
        glue = {"framework.testing.bdd.steps"},
        tags = {"@framework"},
        features = {"src/test/java/framework/testing/bdd/features"})
@CommonsLog
public class BDDRunner {
}
