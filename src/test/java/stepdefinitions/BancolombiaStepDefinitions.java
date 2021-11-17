package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.InversionOptions;
import tasks.OpenUpPage;
import tasks.ProductosButton;
import tasks.documentOption;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class BancolombiaStepDefinitions {

    @Before
    public void setStage() { setTheStage(new OnlineCast());}

    @Given("^Maria enter the Bancolombia page$")
    public void mariaEnterTheBancolombiaPage() {
        theActorCalled("Maria").wasAbleTo(OpenUpPage.thePage(), ProductosButton.onThePage());

    }

    @When("^select the Inversiones option for (.*) about the Conoce Mas option$")
    public void selectTheInversionesOption(String tipoInversion) {
        theActorInTheSpotlight().attemptsTo(InversionOptions.thePage(tipoInversion));
    }

    @When("^select the Documentos option download the PDF Reglamento de Inversion Virtual Bancolombia$")
    public void selectTheDocumentosOption() {
        theActorInTheSpotlight().attemptsTo(documentOption.thePage());
    }

    @Then("^the document is generate$")
    public void downloadThePDFReglamentoDeInversionVirtualBancolombia() {

    }
}
