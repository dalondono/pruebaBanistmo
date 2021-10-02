package co.com.choucair.certification.prueba1.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/testBanistmo.feature",
        tags = "@stories",
        glue = "co.com.choucair.certification.prueba1.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class pruebaRunner {
}
