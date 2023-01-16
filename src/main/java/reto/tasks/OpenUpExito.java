package reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import reto.userinterface.StartExitoOnBrowser;

public class OpenUpExito implements Task {

    private StartExitoOnBrowser startExitoOnBrowser;

    public static OpenUpExito thePage() {return Tasks.instrumented(OpenUpExito.class);  }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(startExitoOnBrowser));

    }
}
