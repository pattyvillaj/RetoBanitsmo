package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.Document;
import userinterface.PageInversionOptions;

public class documentOption implements Task {

    public documentOption(){

    }

    public static documentOption thePage(){ return Tasks.instrumented(documentOption.class);   }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Document.DOCUMENT),
                Click.on(Document.DOWNLOAD)
                );
    }
}



