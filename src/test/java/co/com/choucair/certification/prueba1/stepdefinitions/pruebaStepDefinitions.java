package co.com.choucair.certification.prueba1.stepdefinitions;

import co.com.choucair.certification.prueba1.models.ModelFeature;
import co.com.choucair.certification.prueba1.questions.ValidateThe;
import co.com.choucair.certification.prueba1.tasks.OpenUp;
import co.com.choucair.certification.prueba1.tasks.RegisterTheValues;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static org.hamcrest.Matchers.equalTo;

public class pruebaStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^the user want to calculate interest rate$")
    public void theUserWantToCalculateInterestRate() {
        OnStage.theActorCalled("User").wasAbleTo(OpenUp.thePage());
    }

    @When("^user enters values$")
    public void userEntersValues(List<ModelFeature> modelFeatures) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterTheValues.forTheCalculate(modelFeatures));
    }

    @Then("^the user gets a value for the rate$")
    public void theUserGetsAValueForTheRate(List<ModelFeature> modelFeatures) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateThe.calculatedResult(modelFeatures), equalTo(true)));
    }
}
