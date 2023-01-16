package reto.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import reto.userinterface.CategorySub;
import reto.userinterface.Products;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ExitoTask implements Task {
    public static ExitoTask end() {
        return Tasks.instrumented(ExitoTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CategorySub.MENU, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(CategorySub.MENU),
                WaitUntil.the(CategorySub.CATEGORY, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CategorySub.CATEGORY),
                Click.on(CategorySub.SUB_CATEGORY)
        );

    }
}
