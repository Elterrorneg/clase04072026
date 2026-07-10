package org.example.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.Pages.HomePage;

public class Login implements Task {
    private final String username;
    private final String password;


    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(HomePage.BTN_LOG_UP),
                Enter.theValue(username).into(HomePage.INPUT_USERNAME),
                Enter.theValue(password).into(HomePage.INPUT_PASSWORD),
                Click.on(HomePage.BTN_LOGIN)

        );
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public static Performable withData(String username, String password){
        return new Login(username,password);
    }
}

