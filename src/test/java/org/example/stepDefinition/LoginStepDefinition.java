package org.example.stepDefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import org.example.Tasks.Login;
import org.example.Tasks.NavigateTo;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinition {
    @Given("el {actor} esta en la pagina de principal")
    public void elUsuarioEstaEnLaPaginaDePrincipal(Actor actor) {
        actor.attemptsTo(NavigateTo.theHomePage());
    }

    @When("inicia sesion con su nombre de usuario {string} y contrasenia {string}")
    public void iniciaSesionConSuNombreDeUsuarioYContrasenia(String username, String password) {
        theActorInTheSpotlight().attemptsTo(Login.withData(username,password));
    }

    @Then("se realiza el inicio de sesion de manera exitosa")
    public void seRealizaElInicioDeSesionDeManeraExitosa() {
        System.out.println("Inicio de sesion exitoso");
    }
}
