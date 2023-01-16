package reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CategorySub extends PageObject {

    public static final Target MENU = Target.the("Click on Menu")
            .located(By.xpath("//*[@id=\"Trazado_7822\"]"));
    public static final Target CATEGORY = Target.the("Select Category")
            .located(By.xpath("//*[@id=\"undefined-nivel2-Dormitorio\"]"));
    public static final Target SUB_CATEGORY = Target.the("Select SubCategory")
            .located(By.xpath("//*[text()='Paraiso']"));



}
