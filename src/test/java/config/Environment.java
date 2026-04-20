package config;

public class Environment {

    private Environment() {
    }

    public static String getDummyJsonBaseUrl() {
        return System.getProperty("dummyJsonBaseUrl", "https://dummyjson.com");
    }

    public static String getRestfulBookerBaseUrl() {
        return System.getProperty("restfulBookerBaseUrl", "https://restful-booker.herokuapp.com");
    }
}