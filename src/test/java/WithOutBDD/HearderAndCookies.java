package WithOutBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class HearderAndCookies {

    @Test
    void  testHeader() {

        given()
                .when()
                .get("https://reqres.in/api/users?page=2")

                .then()
             //   .log().headers();//it will print only headers//
              //  .log().body();//it will print only body
                .log().cookies();//it will print only cookies




    }
}
