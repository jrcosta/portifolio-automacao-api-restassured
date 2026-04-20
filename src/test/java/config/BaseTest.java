package config;

import org.junit.jupiter.api.BeforeAll;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;

public class BaseTest {

    @BeforeAll
    public static void setup() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.defaultParser = Parser.JSON;
    }
}
