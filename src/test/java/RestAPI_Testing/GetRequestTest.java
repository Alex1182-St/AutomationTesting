package RestAPI_Testing;

import Library.ScreenshotTaking;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.hamcrest.core.IsCollectionContaining.hasItems;

public class GetRequestTest {

    Response resp = RestAssured.get("https://www.reqres.in/api/users?page=2");


@Test

    public void getRequestCodeCheck () {

    int statusCode = resp.getStatusCode();

    Assert.assertEquals(statusCode, 200);

    System.out.println("Status code - " + statusCode );


    resp.then().statusCode(200);


    }

@Test

    public void getRequestBodyCheck () {

    String requestBody = resp.asString();

    System.out.println(requestBody);

    resp.then().body("data.id", hasItems(4, 5, 6));

}

@Test // інший варіант написання коду для перевірки наґявності в JSON слів

    public void getRequestBodyCheck2 () {

    RestAssured.get("https://www.reqres.in/api/users?page=2").then().body("data.id", hasItems(4,5,6));

    }


    @AfterMethod
    public void endTest(ITestResult result)
    {
        if (ITestResult.FAILURE==result.getStatus()) {
            ScreenshotTaking screen = new ScreenshotTaking();
            screen.screenShotCapture(result.getName());
        }
}}

