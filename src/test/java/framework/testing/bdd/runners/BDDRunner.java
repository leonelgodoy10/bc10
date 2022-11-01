package framework.testing.bdd.runners;

import framework.engine.selenium.DriverFactory;
import io.cucumber.java8.Scenario;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.qameta.allure.Allure;
import lombok.extern.apachecommons.CommonsLog;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"},
        glue = {"framework.testing.bdd.steps","framework.engine.bdd"},
        tags = {"@framework"},
        features = {"src/test/java/framework/testing/bdd/features"})
@CommonsLog
public class BDDRunner {
}
