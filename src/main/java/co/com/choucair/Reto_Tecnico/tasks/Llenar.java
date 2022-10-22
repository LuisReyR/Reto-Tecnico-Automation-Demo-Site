package co.com.choucair.Reto_Tecnico.tasks;

import co.com.choucair.Reto_Tecnico.model.AutomationDemoSiteDate;
import co.com.choucair.Reto_Tecnico.userinterface.AutomationDemoSite;
import com.sun.tools.xjc.model.CElement;
import cucumber.api.java.eo.Se;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.apache.xpath.operations.Div;
import org.openqa.selenium.Keys;

import java.util.List;
import static co.com.choucair.Reto_Tecnico.userinterface.AutomationDemoSite.*;

public class Llenar implements Task {
    public Llenar(List<AutomationDemoSiteDate> datos) {
        this.datos = datos;
    }

    private List<AutomationDemoSiteDate> datos;

    public static Llenar thePage(List<AutomationDemoSiteDate> datos) {
        return Tasks.instrumented(Llenar.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.get(0).getStrFirstName()).into(FIRST_NAME),
                Enter.theValue(datos.get(0).getStrLastName()).into(LAST_NAME),
                Enter.theValue(datos.get(0).getStrAddress()).into(ADDRESS),
                Enter.theValue(datos.get(0).getStrEmailAddress()).into(EMAIL_ADDRESS),
                Enter.theValue(datos.get(0).getStrPhone()).into(PHONE),
                Click.on(GENDER),
                Click.on(HOBBIES),
                //Click.on(LANGUAGES),
                //SelectFromOptions.byVisibleText(datos.get(0).getStrLanguages()).from(LANGUAGES),
                Click.on(LANGUAGES_0),
                Click.on(LANGUAGES_1),
                SelectFromOptions.byVisibleText(datos.get(0).getStrSkills()).from(SKILLS),
                //SelectFromOptions.byVisibleText(datos.get(0).getStrCountry()).from(COUNTRY),
                Click.on(COUNTRY_0),
                Click.on(COUNTRY_1),
                Click.on(SELECT_COUNTRY_0),
                Enter.theValue(datos.get(0).getStrSelectCountry()).into(SELECT_COUNTRY_1),
                Hit.the(Keys.DOWN).keyIn(SELECT_COUNTRY_1),
                Hit.the(Keys.ENTER).keyIn(SELECT_COUNTRY_1),
                //SelectFromOptions.byVisibleText(datos.get(0).getStrSelectCountry()).from(SELECT_COUNTRY_0),
                SelectFromOptions.byVisibleText(datos.get(0).getStrYearBirth()).from(YEAR_BIRTH),
                SelectFromOptions.byVisibleText(datos.get(0).getStrMonthBirth()).from(MONTH_BIRTH),
                SelectFromOptions.byVisibleText(datos.get(0).getStrDayBirth()).from(DAY_BIRTH),
                Enter.theValue(datos.get(0).getStrPassword()).into(PASSWORD),
                Enter.theValue(datos.get(0).getStrConfirmPassword()).into(CONFIRM_PASSWORD),
                Click.on(SUBMIT)
                );
    }
}
