package org.example.Tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import org.example.Pages.CartPage;
import org.example.Pages.DesciptionProductPage;
import org.example.Pages.HomePage;

public class NavigateTo {
    public static Performable theHomePage(){
        return Task.where("{0} opens the Home Page", Open.browserOn().the(HomePage.class));
    }
    public static Performable theCartPage(){
        return Task.where("{0} opens the Cart Page", Open.browserOn().the(CartPage.class));
    }
    public static Performable theDescriptionProductPage(){
        return Task.where("{0} opens the Cart Page", Open.browserOn().the(DesciptionProductPage.class));
    }
}
