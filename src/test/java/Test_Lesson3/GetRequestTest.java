package Test_Lesson3;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetRequestTest {

    Response resp = RestAssured.get("https://www.reqres.in/api/users?page=2");

@Test

    public void getRequest () {

    int statusCode = resp.getStatusCode();

    Assert.assertEquals(statusCode, 200);

    System.out.println("Status code - " + statusCode );

}
@Test

    public void requestBody () {

    String requestBody = resp.asString();

    // Assert.assertEquals(requestBody, "");

    System.out.println(resp.asString());



}

}
