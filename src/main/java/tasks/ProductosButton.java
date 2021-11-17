package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.BancolombiaProducto;
import net.serenitybdd.screenplay.Task;

public class ProductosButton implements Task {
    private BancolombiaProducto bancolombiaPersonas;

    public static ProductosButton onThePage() {
        return Tasks.instrumented(ProductosButton.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(bancolombiaPersonas.BUTTON_X),
                Click.on(bancolombiaPersonas.PRODUCTOS_BUTTON
                ));

    }
}


