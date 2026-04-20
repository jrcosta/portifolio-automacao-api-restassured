package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.notNullValue;

import client.RestfulBookerClient;
import config.BaseTest;

public class TestRestfulBookerAuth extends BaseTest {

    private final RestfulBookerClient restfulBookerClient = new RestfulBookerClient();

    @Test
    @DisplayName("Deve gerar token de autenticacao validando credenciais corretas")
    void shouldCreateTokenWithValidCredentials() {
        String payload = """
                {
                    "username": "admin",
                    "password": "password123"
                }
                """;

        restfulBookerClient
                .createToken(payload)
                .then()
                .statusCode(200)
                .body("token", notNullValue());
    }

    @Test
    @DisplayName("Nao deve gerar token com credenciais invalidas (Bad Request/Unauthorized)")
    void shouldNotCreateTokenWithInvalidCredentials() {
        String payload = """
                {
                    "username": "admin",
                    "password": "wrongpassword"
                }
                """;

        // A API restful-booker retorna 200 com reason "Bad credentials"
        restfulBookerClient
                .createToken(payload)
                .then()
                .statusCode(200)
                .body("reason", org.hamcrest.Matchers.equalTo("Bad credentials"));
    }
}
