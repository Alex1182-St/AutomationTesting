package RestAPI_Testing;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.core.IsCollectionContaining.hasItems;

public class GetRequestTest {

    Response resp = RestAssured.get("https://www.reqres.in/api/users?page=2");

@Test

    public void getRequestCodeCheck () {

    int statusCode = resp.getStatusCode();

    Assert.assertEquals(statusCode, 200);

    System.out.println("Status code - " + statusCode );

}
@Test

    public void getRequestBodyCheck () {

    String requestBody = resp.asString();

    System.out.println(requestBody);

    resp.then().body("data.id", hasItems(4, 5, 6));


}

}
