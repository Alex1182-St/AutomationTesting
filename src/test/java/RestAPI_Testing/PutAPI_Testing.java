package RestAPI_Testing;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.lessThan;

public class PutAPI_Testing {

@Test

    public void putRequestCodeCheck () {

        RequestSpecification request = RestAssured.given();

        request.header("Content-Type", "application/json");

        JSONObject jsonObj = new JSONObject();

        jsonObj.put("name","morpheus");
        jsonObj.put("job","zion resident");

        request.body(jsonObj.toJSONString());

        Response resp = request.put("https://www.reqres.in/api/users/2");

        resp.then().statusCode(200);

        resp.then().time(lessThan(2000L));


    }


    }

