package org.example.stepDefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.Tasks.AddProductToCart;
import org.example.Tasks.GoCart;
import org.example.Tasks.Login;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddProductToCardStepDefinition {
    @And("elige un producto")
    public void eligeUnProducto() {
        theActorInTheSpotlight().attemptsTo(AddProductToCart.addProduct());

    }

    @And("da click en el boton de agregar al carrito")
    public void daClickEnElBotonDeAgregarAlCarrito() {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("se dirige a la pagina del  carrito")
    public void seDirigeALaPaginaDelCarrito() {
        theActorInTheSpotlight().attemptsTo(GoCart.open());
    }

    @Then("se visualiza el producto en el carrito")
    public void seVisualizaElProductoEnElCarrito() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("producto añadido exitosamente");
    }
}
