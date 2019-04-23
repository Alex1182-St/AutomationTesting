package RestAPI_Testing.BeautifulCode;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.lessThan;

public class DeleteAPI_Test {


    @BeforeTest

    public void setBaseURL () {

        RestAssured.baseURI = "https://www.reqres.in";
    }

    @Test

    public void deleteRequest () {

        RestAssured.given()
                .when()
                .delete("https://www.reqres.in/api/users/2")
                .then()
                .statusCode(204)
                .and()
                .time(lessThan(5000L));
    }

}
