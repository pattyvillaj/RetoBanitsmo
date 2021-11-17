package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.PageBancolombia;
import userinterface.PageInversionOptions;

public class InversionOptions implements Task {
    String tipoInversion;

    public InversionOptions( String tipoInversion){
        this.tipoInversion = tipoInversion;
    }

    public static InversionOptions thePage(String tipoInversion){ return Tasks.instrumented(InversionOptions.class, tipoInversion);   }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PageInversionOptions.INVERSION_OPTIONS),
                Click.on(PageInversionOptions.ARROW),
                Click.on(PageInversionOptions.findMonto(this.tipoInversion)),
                Click.on(PageInversionOptions.MORE)
                );
    }
}



