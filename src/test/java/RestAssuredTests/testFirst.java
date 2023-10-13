package RestAssuredTests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


/*


 */

public class testFirst {

    @Test
    public void getwetherDeails(){


        given()
                .when()
                       .get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
                .then()
                       .statusCode(200)
                       .statusLine("HTTP/1.1 200 OK")
                       .assertThat().body("city",equalTo("Hyderabad"));


       // .header("content-type","application/json");


    }



}
