package co.com.choucair.certification.prueba1.tasks;

import co.com.choucair.certification.prueba1.models.ModelFeature;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import java.util.List;

import static co.com.choucair.certification.prueba1.userintefaces.PruebaInitPage.*;

public class RegisterTheValues implements Task {
    List<ModelFeature> modelFeatures;

    public RegisterTheValues(List<ModelFeature> modelFeatures) {
        this.modelFeatures = modelFeatures;
    }

    public static RegisterTheValues forTheCalculate(List<ModelFeature> modelFeatures) {
        return Tasks.instrumented(RegisterTheValues.class, modelFeatures);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int rate = modelFeatures.get(0).getRate();
        String periodicity = modelFeatures.get(0).getPeriodicity();
        String capitalization = modelFeatures.get(0).getCapitalization();
        actor.attemptsTo(
                Click.on(OPTION_BUSINESS),
                Click.on(OPTION_TOOLS),
                Click.on(INTEREST_CONVERTER),
                Click.on(BUTTON_CALCULATE),
                Enter.theValue(String.valueOf(rate)).into(INTEREST_RATES),
                Click.on(PERIODICITY),
                Click.on(OPTION_PERIODICITY.of(periodicity)),
                Click.on(CAPITALIZATION),
                Click.on(OPTION_CAPITALIZATION.of(capitalization))
        );
    }
}
