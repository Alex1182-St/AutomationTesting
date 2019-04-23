package RestAPI_Testing.BeautifulCode;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PostAPI_CreateUser_Testing {

    @BeforeTest
    public void setupBaseURL () {
        RestAssured.baseURI = "https://www.reqres.in/";
    }

    @Test
    public void createUser() {

        RestAssured.given()
                .when()
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}")
                .post("/api/users")
                .then()
                .assertThat().log().all()
                .statusCode(201)
                .and()
                .contentType(ContentType.JSON)
                .and()
                .header("Server", "cloudflare")
                .and()
                .header("Connection", "keep-alive");
    }
}
