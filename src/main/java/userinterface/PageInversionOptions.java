package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageInversionOptions {
    public static final Target INVERSION_OPTIONS = Target.the("The button Personas").located(By.id("filtro-inversiones"));
    public static final Target ARROW = Target.the("The button Personas").located(By.id("mostrar-filtros"));
    public static final Target MORE = Target.the("More").located(By.id("filtrado-conoce-inversion-0"));

    public static Target findMonto(String tipoInversion){
        return Target.the("tipo inversion").located(By.xpath("//ul[contains(@class, 'productos-filtro_tags--desktop')]/li/a[contains(.,'"+tipoInversion+"')]"));
    }
}
