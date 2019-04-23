package RestAPI_Testing.BeautifulCode;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.lessThan;

public class PutAPI_Test {

    @BeforeTest
    public void setupBaseURL () {
        RestAssured.baseURI = "https://www.reqres.in/";
    }

    @Test

    public void putRequest () {

        RestAssured.given()
                .when()
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"zion resident\"\n" +
                        "}")
                .put("/api/users/2")
                .then()
                .statusCode(200)
                .time(lessThan(3000L));


    }



}
