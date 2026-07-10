package org.example.Pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.demoblaze.com/prod.html?idp_=1#")
public class DesciptionProductPage extends PageObject
{
    public static final Target BTN_ADD = Target.the("boton para agregar producto")
            .located(By.xpath("//a[text()='Add to cart']"));
}
