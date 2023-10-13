package WithOutBDD;

import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class HTTPMthods {

    int id;

    @Test(priority = 1)

    void getuser(){

        given()
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200)
                .body("page",equalTo(2))//rest assured asserations  restassured matchers
                .log().all();





    }

    @Test(priority = 2)

    void createuser()
    {


        HashMap hm=new HashMap();
        hm.put("name","bharat");
        hm.put("job","trainer");


       id= given()
                .contentType("application/json")
                .body(hm)

        .when()
                .post("https://reqres.in/api/users")
                 .jsonPath().getInt("id");  //here its we are getting id as int so configured int if its string then we put string


//        .then()
//                .statusCode(201)
//                 .log().all();

    }

    @Test(priority = 3,dependsOnMethods = {"createuser"})

    void updateuser()
    {


        HashMap hm=new HashMap();
        hm.put("name","bharatreddy");
        hm.put("job","trainer");


        given()
                .contentType("application/json")
                .body(hm)

                .when()
                .put("https://reqres.in/api/users/"+id)
                  //here its we are getting id as int so configured int if its string then we put string

                .then()
                .statusCode(200)
                 .log().all();

    }

    @Test(priority = 4,dependsOnMethods = {"updateuser"})

    void deleteuser()
    {




        given()

        .when()
                .put("https://reqres.in/api/users/"+id)
                //here its we are getting id as int so configured int if its string then we put string

                .then()
                .statusCode(200)
                .log().all();

    }


}


