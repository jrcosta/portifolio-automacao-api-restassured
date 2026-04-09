package client;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class SwapiClient {

    public Response getRoot() {
        return given()
                .when()
                .get("/api/");
    }

    public Response getPersonById(int id) {
        return given()
                .pathParam("id", id)
                .when()
                .get("/api/people/{id}/");
    }

    public Response searchPeople(String term) {
        return given()
                .queryParam("search", term)
                .when()
                .get("/api/people/");
    }
}