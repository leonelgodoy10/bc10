package aut.bdd.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import lombok.extern.apachecommons.CommonsLog;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"},
        glue = {"aut.bdd.steps"},
        tags = {""},
        features = {"src/test/java/aut/bdd/features"})
@CommonsLog
public class AutRunner {
}