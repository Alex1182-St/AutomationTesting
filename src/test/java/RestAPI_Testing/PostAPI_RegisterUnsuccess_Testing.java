package RestAPI_Testing;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.lessThan;

public class PostAPI_RegisterUnsuccess_Testing {

    @Test
    public void postRequestCodeCheck () {

        RequestSpecification request = RestAssured.given();

        request.header("Content-Type", "application/json");

        JSONObject jsonObj = new JSONObject();

        jsonObj.put("email","sydney@fife");

        // додаємо body
        request.body(jsonObj.toJSONString());

        //формуємо запит
        Response resp = request.post("https://www.reqres.in/api/register");

        //перевірка
        resp.then().statusCode(400);

        resp.then().time(lessThan(2000L));

    }

        /*
        встановити JSON.simple
        <!-- https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple -->
    <dependency>
    <groupId>com.googlecode.json-simple</groupId>
    <artifactId>json-simple</artifactId>
    <version>1.1.1</version>
    </dependency>
         */
    }

