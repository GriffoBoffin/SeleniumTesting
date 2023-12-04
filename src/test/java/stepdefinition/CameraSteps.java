package stepdefinition;

import io.cucumber.java.en.And;
import pom.CameraPhotoPage;

import static stepdefinition.Hooks.driver;

public class CameraSteps {
    CameraPhotoPage cameraPhotoPage=new CameraPhotoPage(driver);
    @And("Select the Nikon")
    public void selectTheNikon() {
        cameraPhotoPage.clickNikonCamera();
    }
}
