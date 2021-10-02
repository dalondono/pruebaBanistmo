package co.com.choucair.certification.prueba1.userintefaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PruebaInitPage extends PageObject {
    public static final Target OPTION_BUSINESS = Target.the("option business").locatedBy("//a[@id='header-pymes']");
    public static final Target OPTION_TOOLS = Target.the("option tools").locatedBy("//a[contains(text(),'Herramientas')][1]");
    public static final Target INTEREST_CONVERTER = Target.the("interest rate converter").locatedBy("//*[contains(text(),'Conversor de tasas de interés')]");
    public static final Target BUTTON_CALCULATE = Target.the("button calculate").locatedBy("//div[@id='btntoolUno']");
    public static final Target INTEREST_RATES = Target.the("interest rates").located(By.xpath("//input[@id='interes']"));
    public static final Target PERIODICITY = Target.the("periodicity").locatedBy("//select[@id='periodicidad-deseada']");
    public static final Target OPTION_PERIODICITY = Target.the("option periodicity").locatedBy("//*[@id='periodicidad-deseada']/option[contains(text(),'{0}')]");
    public static final Target CAPITALIZATION = Target.the("capitalization").locatedBy("//select[@id='capitalizacion']");
    public static final Target OPTION_CAPITALIZATION = Target.the("capitalization").locatedBy("//*[@id='capitalizacion']/option[contains(text(),'{0}')]");
    public static final Target RESULT = Target.the("result").locatedBy("//*[@id='respuesta']");

}
