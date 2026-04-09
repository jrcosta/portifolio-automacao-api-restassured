package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

import client.SwapiClient;
import config.BaseTest;

public class TestPeople extends BaseTest {

    private final SwapiClient swapiClient = new SwapiClient();

    @Test
    @DisplayName("Deve retornar Luke Skywalker pelo id 1")
    void shouldReturnLukeSkywalker() {

        swapiClient
                .getPersonById(1)
                .then()
                .statusCode(200)
                .body("name", equalTo("Luke Skywalker"))
                .body("height", notNullValue())
                .body("mass", notNullValue())
                .body("url", equalTo("https://swapi.dev/api/people/1/"));
    }

    @Test
    @DisplayName("Deve retornar 404 para id inexistente")
    void shouldReturn404WhenPersonDoesNotExist() {

        swapiClient
                .getPersonById(9999)
                .then()
                .statusCode(404);
    }

    @Test
    @DisplayName("Deve buscar personagens pelo nome")
    void shouldSearchPeopleByName() {

        swapiClient
                .searchPeople("r2")
                .then()
                .statusCode(200)
                .body("count", equalTo(1))
                .body("results[0].name", equalTo("R2-D2"))
                .body("results[0].url", equalTo("https://swapi.dev/api/people/3/"));
    }
}
