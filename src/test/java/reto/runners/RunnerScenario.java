package reto.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/exitoh.feature",
        tags = "@first",
        glue = "reto.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE )


public class RunnerScenario{
}
