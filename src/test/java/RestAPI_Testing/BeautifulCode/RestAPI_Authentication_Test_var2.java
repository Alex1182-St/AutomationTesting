package RestAPI_Testing.BeautifulCode;

import Library.Authentication_BaseClass;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class RestAPI_Authentication_Test_var2 extends Authentication_BaseClass {

    @Test

    public void test1 () {

        int statusCode = RestAssured.given()
                .when()
                .get()
                .getStatusCode();

        System.out.println("Code " + statusCode);


    }

}
