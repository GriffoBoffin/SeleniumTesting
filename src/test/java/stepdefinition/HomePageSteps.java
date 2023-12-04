package stepdefinition;

import io.cucumber.java.en.And;
import pom.HomePage;

import static stepdefinition.Hooks.driver;

public class HomePageSteps {

    HomePage homepage=new HomePage(driver);

    @And("Hover over electronics button")
    public void hoverOverElectronicsButton() {
        homepage.hoverElectronicsButton();

    }

    @And("Click on camera & photo")
    public void clickOnCameraPhoto() {
        homepage.clickCameraButton();
    }
}
