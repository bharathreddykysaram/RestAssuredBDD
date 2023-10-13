package WithOutBDD;

import org.testng.annotations.Test;

import java.util.HashMap;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostMethods {
int id;
    /*

    day2 :restricatd

    post call:-
***different ways to create a post request body
    ---------------------------------------

    1)post req body using HashMap
    2) post req body creation using org.json
    3)post req body creation using POJO(plan old java object )
    4) post req body creation using external json file
     */


     ///   1)post req body using HashMap
//
//    @Test(priority = 0)
//    void  testpostusingHashMap() {
//
//        HashMap data = new HashMap();
//        data.put("firstName", "bharat");
//        data.put("lastName", "india");
//        data.put("number", "123456");
//
////        String courseArr[] = {"c", "c++"};//if we have mutilpe values then we to pass to array like this
////
////        data.put("gender", courseArr);
//
//
//      given()
//                .contentType("application/json")
//                .body(data)
//
//                .when()
//                .post("http://localhost:3000/people")
//              //  .jsonPath().getInt("id");
//
//
//                .then()
//                .body("firstName", equalTo("bharat"))
//                .body("lastName", equalTo("india"))
//                .body("number", equalTo("123456"))
////                .body("gender[0]", equalTo("c"))
////                .body("gender[1]", equalTo("c++"))
//
//                .header("content-type", "application/json; charset=utf-8")
//                .log().all();
//
//    }
//

    ///   3)post req body using Pojo pojo is nothing but settings getters and setters

    @Test(priority = 0)
    void  testpostusingHashMap() {

      PostForPOJO data=new PostForPOJO();
        data.setFirstName("bharat");
        data.setLirstName("kysaram");
        data.setGender("male");
        data.setAge("36");
        data.setNumber("7358335450");


        given()
                .contentType("application/json")
                .body(data)

                .when()
                .post("http://localhost:3000/people")
                //  .jsonPath().getInt("id");


                .then()
                .body("firstName", equalTo("bharat"))
                .body("lirstName", equalTo("kysaram"))
                .body("number", equalTo("7358335450"))
//                .body("gender[0]", equalTo("c"))
//                .body("gender[1]", equalTo("c++"))

                .header("content-type", "application/json; charset=utf-8")
                .log().all();

    }

    @Test(priority = 1)
        void  testpostusingHashMapput(){


           given()

                   .when()
                    .delete("http://localhost:3000/people/5")



           .then()
                   .statusCode(200)
                   .log().all();





    }
}
