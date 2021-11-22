package stepdefinitions;

import abilities.ReadPdf;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.util.EnvironmentVariables;
import questions.Answer;
import tasks.InversionOptions;
import tasks.OpenUpPage;
import tasks.ProductosButton;
import tasks.documentOption;
import util.ProcessFiles;

import java.io.IOException;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class BancolombiaStepDefinitions {

    private EnvironmentVariables environmentVariables;
    String downloadFolder;
    String fileName;

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
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("^the generated document is (.*)$")
    public void theGeneratedDocumentIsInversionVirtual(String question) throws IOException {
        downloadFolder = environmentVariables.optionalProperty("download.filesFolder").orElseThrow(IllegalArgumentException::new);

        fileName = environmentVariables.optionalProperty("statements.fileName").orElseThrow(IllegalArgumentException::new);

        String statementFilePath = String.format("%s/%s", downloadFolder,fileName);

        theActorInTheSpotlight().whoCan(ReadPdf.downloadedInPath(statementFilePath));
        String pdfText = ReadPdf.as(theActorInTheSpotlight()).getText();
        System.out.println(pdfText);

        theActorInTheSpotlight().should(seeThat(Answer.toThe(question, pdfText)));

        ProcessFiles.checkDeleteDownloaded(downloadFolder, fileName);

    }
}
