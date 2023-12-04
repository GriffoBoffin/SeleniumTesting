package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NikonPage {

    public static String url = "https://demo.nopcommerce.com/nikon-d5500-dslr";
    private final WebDriver driver;

    By addToCartRedCameraButton=By.id("add-to-cart-button-15");
    By shoppingCartButtonInBarNotification=By.xpath("//*[@class=\"bar-notification success\"]//*[@href=\"/cart\"]");

    public NikonPage(WebDriver driver) {
        this.driver = driver;
    }


    public void addToCartRedCamera(){
        driver.findElement(addToCartRedCameraButton).click();
    }

    public void clickShoppingCartButtonInBarNotification(){
        driver.findElement(shoppingCartButtonInBarNotification).click();
    }

}
