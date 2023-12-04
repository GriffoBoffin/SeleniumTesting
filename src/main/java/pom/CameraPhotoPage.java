package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CameraPhotoPage {

    public static String url = "https://demo.nopcommerce.com/camera-photo";
    private final WebDriver driver;

    By nikonCamera=By.cssSelector("[href=\"/nikon-d5500-dslr\"][title=\"Show details for Nikon D5500 DSLR\"]");

    public CameraPhotoPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickNikonCamera(){
        driver.findElement(nikonCamera).click();
    }

}
