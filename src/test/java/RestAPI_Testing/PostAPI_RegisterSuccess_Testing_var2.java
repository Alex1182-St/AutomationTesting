package RestAPI_Testing;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class PostAPI_RegisterSuccess_Testing_var2 {

    @BeforeTest
    public void setupBaseUrl () {
        RestAssured.baseURI = "https://www.reqres.in";
    }

    @Test
    public void userRegister () {

        RestAssured.given()
                .when()
                .body("{\n" +
                        "    \"email\": \"sydney@fifed\",\n" +
                        "    \"password\": \"pistold\"\n" +
                        "}")
                .post("/api/register")
                .then()
                .assertThat()
                .statusCode(201);
    }

    }



