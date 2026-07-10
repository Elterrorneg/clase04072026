package org.example.Pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.demoblaze.com/cart.html")
public class CartPage  extends PageObject
{
    public static final Target BTN_CART = Target.the("boton para hacer el registro")
            .located(By.id("cartur"));
}
