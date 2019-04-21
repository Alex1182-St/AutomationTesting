package RestAPI_Testing;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class GetAPI_UserDetails_StatusCode {

    @Test

    public void getRequestTest () {

        RestAssured.baseURI = "https://www.reqres.in";
        RestAssured.given()
                .when()
                .get("/api/users?page=2")
                .then()
                .assertThat().log()
                .all()
                .statusCode(200)
                .and()
                .contentType(ContentType.JSON)
                .and()
                .header("Server", "cloudflare")
                .and()
                .header("Content-Encoding", "gzip");

    }


}
