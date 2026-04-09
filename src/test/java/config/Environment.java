package config;

public class Environment {

    private Environment() {
    }

    public static String getBaseUrl() {
        return System.getProperty("baseUrl", "https://swapi.dev");
    }
}