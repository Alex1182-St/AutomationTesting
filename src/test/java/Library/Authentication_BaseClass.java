package Library;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class Authentication_BaseClass {

    @BeforeClass

    public void authenticationSetup () {

        RestAssured.authentication = RestAssured.preemptive().basic("ToolsQA","TestPassword");
        RestAssured.baseURI="http://restapi.demoqa.com/authentication/CheckForAuthentication";
    }

}
