package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Document {
    public static final Target DOCUMENT =Target.the("The button document").located(By.linkText("Documentos"));
    public static final Target DOWNLOAD =Target.the("The button download").located(By.xpath("//button[@class='c-download-rules']//a[1]"));

}
