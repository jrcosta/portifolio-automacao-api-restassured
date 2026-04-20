package client;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import config.Environment;

public class RestfulBookerClient {
    private final String baseUrl = Environment.getRestfulBookerBaseUrl();

    public Response createToken(String payload) {
        return given()
                .baseUri(baseUrl)
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .post("/auth");
    }

    public Response getBookingIds() {
        return given()
                .baseUri(baseUrl)
                .when()
                .get("/booking");
    }
}
