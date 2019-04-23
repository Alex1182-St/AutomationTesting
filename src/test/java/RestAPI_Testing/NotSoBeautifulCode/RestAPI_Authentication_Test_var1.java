package RestAPI_Testing.NotSoBeautifulCode;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class RestAPI_Authentication_Test_var1 {

    @Test

    public void test1 () {

        int statusCode = RestAssured.given()
        .auth().preemptive()
        .basic("ToolsQA","TestPassword")
                .when()
                .get("http://restapi.demoqa.com/authentication/CheckForAuthentication")
                .getStatusCode();

        System.out.println(" Code " + statusCode);



    }

}
