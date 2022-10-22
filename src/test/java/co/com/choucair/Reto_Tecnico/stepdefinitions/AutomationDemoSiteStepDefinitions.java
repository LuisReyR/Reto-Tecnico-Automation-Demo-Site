package co.com.choucair.Reto_Tecnico.stepdefinitions;

import co.com.choucair.Reto_Tecnico.model.AutomationDemoSiteDate;
import co.com.choucair.Reto_Tecnico.tasks.CompleteData;
import co.com.choucair.Reto_Tecnico.tasks.Llenar;
import co.com.choucair.Reto_Tecnico.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutomationDemoSiteStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Luis wants to access the web Automation Demo Site$")
    public void thatLuisWantsToAccessTheWebAutomationDemoSite() {
        OnStage.theActorCalled("Luis").wasAbleTo(OpenUp.thePage(), (CompleteData.onThePage()));

    }

    @When("^he performs the registration on the page$")
    public void hePerformsTheRegistrationOnThePage(List<AutomationDemoSiteDate> datos) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Llenar.thePage(datos));
    }

    @Then("^verify that the screen in loaded with text - Double Click on Edit Icon to EDIT the Table Row\\.$")
    public void verifyThatTheScreenInLoadedWithTextDoubleClickOnEditIconToEDITTheTableRow() {

    }
}
