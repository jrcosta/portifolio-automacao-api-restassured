package client;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import config.Environment;

public class DummyJsonClient {
    private final String baseUrl = Environment.getDummyJsonBaseUrl();

    public Response getProducts(int limit) {
        return given()
                .baseUri(baseUrl)
                .queryParam("limit", limit)
                .when()
                .get("/products");
    }

    public Response getProductById(int id) {
        return given()
                .baseUri(baseUrl)
                .pathParam("id", id)
                .when()
                .get("/products/{id}");
    }

    public Response addProduct(String payload) {
        return given()
                .baseUri(baseUrl)
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .post("/products/add");
    }
}
