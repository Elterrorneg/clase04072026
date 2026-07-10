package org.example.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.Pages.HomePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrarUsuario implements Task {
    private final String username;
    private final String password;


    public RegistrarUsuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(HomePage.BTN_SIGN_UP),
                Enter.theValue(username).into(HomePage.REGISTER),
                Enter.theValue(password).into(HomePage.PASS_WORD),
                Click.on(HomePage.BTN_REGISTER)

        );
        Alert alert = new WebDriverWait(
                BrowseTheWeb.as(actor).getDriver(),
                Duration.ofSeconds(10)
        ).until(ExpectedConditions.alertIsPresent());

        System.out.println(alert.getText());

        alert.accept();
    }
    public static Performable withData(String username, String password){
        return new RegistrarUsuario(username,password);
    }
}

