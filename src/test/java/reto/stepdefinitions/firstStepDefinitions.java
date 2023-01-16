package reto.stepdefinitions;


import io.cucumber.java.Before;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import reto.tasks.AddProducts;
import reto.tasks.ExitoTask;
import reto.tasks.OpenUpExito;


public class firstStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Daniel").wasAbleTo(OpenUpExito.thePage());
    }

    @Given("Category and subcategory")
    public void categoryAndSubcategory() {
        OnStage.theActorInTheSpotlight().attemptsTo(ExitoTask.end());
    }

    @When("Choose different amounts of five products")
    public void chooseDifferentAmountsOfFiveProducts() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddProducts.end());
    }

    @Then("Finally products added to cart")
    public void finallyProductsAddedToCart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
