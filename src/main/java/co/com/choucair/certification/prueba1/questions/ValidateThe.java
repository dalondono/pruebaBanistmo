package co.com.choucair.certification.prueba1.questions;

import co.com.choucair.certification.prueba1.models.ModelFeature;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static co.com.choucair.certification.prueba1.userintefaces.PruebaInitPage.RESULT;

public class ValidateThe implements Question<Boolean> {
    List<ModelFeature> modelFeatures;

    public ValidateThe(List<ModelFeature> modelFeatures) {
        this.modelFeatures = modelFeatures;
    }

    public static ValidateThe calculatedResult(List<ModelFeature> modelFeatures) {
        return new ValidateThe(modelFeatures);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        float result = modelFeatures.get(0).getResult();
        int lengthresultOpt = Text.of(RESULT).viewedBy(actor).resolveAll().get(0).length();
        float resultOpt = Float.parseFloat(Text.of(RESULT).viewedBy(actor).resolveAll().get(0).substring(0, lengthresultOpt - 2));
        return result == resultOpt;
    }
}
