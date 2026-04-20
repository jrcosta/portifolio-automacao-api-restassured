package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

import client.DummyJsonClient;
import config.BaseTest;

public class TestDummyJsonProducts extends BaseTest {

    private final DummyJsonClient dummyJsonClient = new DummyJsonClient();

    @Test
    @DisplayName("Deve retornar uma lista de produtos")
    void shouldReturnProductsList() {
        dummyJsonClient
                .getProducts(5)
                .then()
                .statusCode(200)
                .body("products", not(empty()))
                .body("limit", equalTo(5))
                .body("products[0].title", notNullValue());
    }

    @Test
    @DisplayName("Deve retornar o produto específico pelo id 1")
    void shouldReturnSpecificProductById() {
        dummyJsonClient
                .getProductById(1)
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("title", notNullValue())
                .body("price", greaterThan(0.0f));
    }

    @Test
    @DisplayName("Deve simular a criacao de um produto via POST")
    void shouldSimulateProductCreation() {
        String payload = """
                {
                    "title": "BMW Pencil",
                    "price": 54
                }
                """;

        dummyJsonClient
                .addProduct(payload)
                .then()
                .statusCode(anyOf(equalTo(200), equalTo(201)))
                .body("id", notNullValue())
                .body("title", equalTo("BMW Pencil"))
                .body("price", equalTo(54));
    }

    @Test
    @DisplayName("Deve retornar 404 para produto inexistente")
    void shouldReturn404ForNonexistentProduct() {
        dummyJsonClient
                .getProductById(999999)
                .then()
                .statusCode(404);
    }
}
