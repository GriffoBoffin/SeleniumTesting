package stepdefinition;

import io.cucumber.java.en.And;
import pom.NikonPage;

import static stepdefinition.Hooks.driver;

public class NikonSteps {
    NikonPage nikonPage=new NikonPage(driver);
    @And("Add to cart the red version")
    public void addToCartRedCamera() {
        nikonPage.addToCartRedCamera();
    }

    @And("Go to shopping cart")
    public void goToShoppingCart() {
        nikonPage.clickShoppingCartButtonInBarNotification();
    }
}
