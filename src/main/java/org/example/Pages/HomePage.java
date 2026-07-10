package org.example.Pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


@DefaultUrl("https://www.demoblaze.com/")
public class HomePage extends PageObject

{
    public static final Target BTN_SIGN_UP = Target.the("boton para hacer el registro")
            .located(By.id("signin2"));
    public static final Target REGISTER = Target.the("campo username")
            .located(By.id("sign-username"));
    public static final Target PASS_WORD = Target.the("campo password")
            .located(By.id("sign-password"));
    public static final Target BTN_REGISTER = Target.the("boton para registrar")
            .located(By.xpath("//button[text()='Sign up']"));
    //LOGIN
    public static final Target BTN_LOG_UP = Target.the("boton para iniciar sesion")
            .located(By.id("login2"));
    public static final Target INPUT_USERNAME = Target.the("campo usuario")
            .located(By.id("loginusername"));
    public static final Target INPUT_PASSWORD = Target.the("campo usuario")
            .located(By.id("loginpassword"));
    public static final Target BTN_LOGIN = Target.the("boton para registrar")
            .located(By.xpath("//button[text()='Log in']"));
    public static final Target BTN_CLOSE = Target.the("boton para registrar")
            .located(By.xpath("//button[text()='Close']"));
    public static final Target BTN_PRODUCT = Target.the("Elegir producto")
            .located(By.xpath("//a[text()='Samsung galaxy s6']"));
}
