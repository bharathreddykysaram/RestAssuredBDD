package WithOutBDD;


import org.json.JSONobject;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import org.testng.annotations.Test;

import java.util.HashMap;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ParsingBody {


    @Test
    void testParBody(){

        Response test=

                given()
                        .contentType("application/json")
                .when()
                       .get("http://localhost:3000/people");

                        JSONPObject ji=new JSONPObject(test.toString());

        for (:
             ) {

        }




    }
}
