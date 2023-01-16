package reto.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.waits.WaitUntil;
import reto.userinterface.Products;

import java.util.*;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddProducts implements Task {
    public static AddProducts end() {
        return Tasks.instrumented(AddProducts.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(Products.PRODUCT_ONE, isVisible()).forNoMoreThan(20).seconds(),
                Scroll.to(Products.SCROOL).andAlignToBottom());

        List<WebElementFacade> products = Products.PRODUCT_ONE.resolveAllFor(actor);
        Collections.shuffle(products);
        for (int i = 0; i < 5; i++) {
            WebElementFacade randomProduct = products.get(i);
            if (randomProduct.isCurrentlyVisible()) {
                Random random = new Random();
                int quantity = random.nextInt(10) + 1;
                actor.attemptsTo(
                        Click.on(randomProduct),
                        Click.on(Products.ADD_PRODUCT));
                for (int j = 0; j < quantity; j++) {
                    actor.attemptsTo(Click.on(Products.QUANTITY_PRODUCT));
                }
                actor.attemptsTo(
                        WaitUntil.the(Products.MORE_PRODUCT, isVisible()).forNoMoreThan(20).seconds(),
                        Click.on(Products.MORE_PRODUCT));
            }
        }




        /*List<WebElementFacade> products = Products.PRODUCT_ONE.resolveAllFor(actor);
        Set<Integer> usedIndexes = new HashSet<>();
        for(int i = 0; i<5; i++) {
            Random random = new Random();
            int randomIndex = random.nextInt(products.size());
            while (usedIndexes.contains(randomIndex)) {
                randomIndex = random.nextInt(products.size());
            }
            usedIndexes.add(randomIndex);
            WebElementFacade randomProduct = products.get(randomIndex);
            if (randomProduct.isCurrentlyVisible()) {
                actor.attemptsTo(Click.on(randomProduct),
                        Click.on(Products.ADD_PRODUCT),
                        Click.on(Products.QUANTITY_PRODUCT),
                        Click.on(Products.MORE_PRODUCT));
            }
        }*/

        /*List<WebElementFacade> products = Products.PRODUCT_ONE.resolveAllFor(actor);

        Random random = new Random();
        int randomIndex = random.nextInt(products.size());
        WebElementFacade randomProduct = products.get(randomIndex);
        System.out.println("randomindex"+randomIndex);
        System.out.println("randomProduc"+randomProduct);
            actor.attemptsTo(Click.on(randomProduct),
                    Click.on(Products.ADD_PRODUCT),
                    Click.on(Products.QUANTITY_PRODUCT),
                    Click.on(Products.MORE_PRODUCT));*/

    }
}
