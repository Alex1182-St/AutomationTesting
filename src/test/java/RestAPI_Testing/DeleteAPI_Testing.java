package RestAPI_Testing;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.lessThan;

public class DeleteAPI_Testing {

@Test

    public void deleteRequestCodeCheck () {

    RequestSpecification request = RestAssured.given();

        Response resp = request.delete("https://www.reqres.in/api/users/2");

        resp.then().statusCode(204);

        resp.then().time(lessThan(2000L));

    }

    }

