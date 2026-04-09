package tests;

import client.SwapiClient;
import config.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class TestRoot extends BaseTest {

    private final SwapiClient swapiClient = new SwapiClient();

    @Test
    @DisplayName("Deve retornar os recursos principais da API")
    void shouldReturnRootResources() {

        swapiClient
                .getRoot()
                .then()
                .statusCode(200)
                .body("people", equalTo("https://swapi.dev/api/people/"))
                .body("planets", equalTo("https://swapi.dev/api/planets/"))
                .body("films", equalTo("https://swapi.dev/api/films/"))
                .body("species", equalTo("https://swapi.dev/api/species/"))
                .body("vehicles", equalTo("https://swapi.dev/api/vehicles/"))
                .body("starships", equalTo("https://swapi.dev/api/starships/"));
    }
}