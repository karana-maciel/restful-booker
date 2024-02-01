package service;

import com.google.gson.Gson;
import dto.BookingDTO;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static util.StaticValue.*;

public class RestfulService {

    public Response post(BookingDTO payload){
        return RestAssured.given()
                .baseUri(BASE_URL)
                .basePath(PATH_BOOKING)
                .body(new Gson().toJson(payload))
                .contentType("application/json")
                .when()
                .post()
                .then()
                .log().all()
                .extract().response();
    }
    public Response get(String PATH){
        return RestAssured.given()
                .baseUri(BASE_URL)
                .basePath(PATH)
                .when()
                .get()
                .then()
                .log().all()
                .extract().response();
    }
}
