package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import userinterface.PageBancolombia;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUpPage implements Task {
    private PageBancolombia pageBancolombia;

    public static OpenUpPage thePage(){ return Tasks.instrumented(OpenUpPage.class);   }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo((Open.browserOn(pageBancolombia)));
    }
}

