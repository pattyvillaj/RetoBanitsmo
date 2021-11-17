package userinterface;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class BancolombiaProducto {

    public static final Target BUTTON_X = Target.the("The button x").located(By.xpath("//div[contains(@class,'modal-prehome-fenix-header-info-close')]/button"));
    public static final Target PRODUCTOS_BUTTON = Target.the("The button Personas").located(By.xpath("//a[contains(@class,'u-button u-button--icon')]"));

}
