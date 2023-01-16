package reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

public class Products extends PageObject {

    //static Random random = new Random();
    //static int randomNumber = random.nextInt(20) + 1;
    public static final Target SCROOL = Target.the("Scroll")
            .located(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div/div[13]/section/div[2]/div/div[2]/div/div[2]/div/div/div[5]"));
    public static final Target PRODUCT_ONE = Target.the("Product one")
            .located(By.xpath("//div[@class=\"exito-vtex-components-4-x-main\"]/div/div/div"));
    public static final Target ADD_PRODUCT = Target.the("product added on the cart")
            .located(By.xpath("//span[@class=\"exito-vtex-components-4-x-buttonText\"]"));
    public static final Target QUANTITY_PRODUCT = Target.the("Indicated quantity of the product")
            .located(By.xpath("//span[@class=\"product-details-exito-vtex-components-buy-button-manager-more\"]"));
    public static final Target MORE_PRODUCT = Target.the("Continue buying products")
            .located(By.xpath("//p[@class=\"exito-vtex-components-4-x-continue\"]"));

}
