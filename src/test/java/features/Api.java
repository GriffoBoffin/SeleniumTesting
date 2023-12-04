package features;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class Api {

    String token = "911cfbbc2a6eae02cbea08cfd92cee3837a7f6014cf85fcdf9b18a23d385c1b4";

    @Test
    public void VerifyCreateABookingReturnsStatus201() {
        given().contentType("application/json").body("{\n" +
                        "        \"id\": 5803133,\n" +
                        "        \"name\": \"Lax1mi Dhawan\",\n" +
                        "        \"email\": \"lisandrru123@email.com\",\n" +
                        "        \"gender\": \"female\",\n" +
                        "        \"status\": \"active\"\n" +
                        "    }")
                .when().post("https://gorest.co.in/public/v2/users?access-token=" + token)
                .then().log().body().statusCode(201);
    }

    @Test
    public void verifyGetBookingInformationByItReturns200AndEmailIsCorrect() {
        List<String> email = new ArrayList<>();
        email.add("lisandrru123@email.com");

        int id = 5806762;
        given().contentType("application/json")
                .when().get("https://gorest.co.in/public/v2/users?access-token=911cfbbc2a6eae02cbea08cfd92cee3837a7f6014cf85fcdf9b18a23d385c1b4&id=" + id)
                .then().log().body().statusCode(200)
                .and().body("email", equalTo(email));
        ;
    }

    @Test
    public void deleteBokingById() {
//        List<String> email = new ArrayList<>();
//        email.add("lisandrru123@email.com");

        int id = 5807088;
        given().contentType("application/json")
                .when().delete("https://gorest.co.in/public/v2/users/:5807088?access-token=911cfbbc2a6eae02cbea08cfd92cee3837a7f6014cf85fcdf9b18a23d385c1b4")
                .then().log().body().statusCode(204);
    }


//    @Test
//    public void deleteBokingByEmail() {
//        List<String> email = new ArrayList<>();
//        email.add("lisandrru123@email.com");
//
//        String id = 5807227;
//        given().contentType("application/json")
//                .when().delete("https://gorest.co.in/public/v2/users?access-token=911cfbbc2a6eae02cbea08cfd92cee3837a7f6014cf85fcdf9b18a23d385c1b4&id=" + id);
//        .then().log().body().statusCode(200);
//    }
}
