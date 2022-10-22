package co.com.choucair.Reto_Tecnico.tasks;

import co.com.choucair.Reto_Tecnico.userinterface.AutomationDemoSite;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class CompleteData implements Task {
    private AutomationDemoSite AutomationDemoSite;

    public static CompleteData onThePage() {
        return Tasks.instrumented(CompleteData.class);
    }

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(Open.browserOn(AutomationDemoSite));
    }
}
