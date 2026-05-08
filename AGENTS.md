# Repository Guidelines

## Project Structure & Module Organization

This submodule contains API test automation with Java 21, RestAssured, JUnit 5, Maven, and Allure.

- `src/test/java/client/`: HTTP client wrappers and request helpers.
- `src/test/java/config/`: shared test configuration and environment setup.
- `src/test/java/tests/`: executable JUnit test suites.
- `pom.xml`: dependency and Surefire/Allure configuration.

## Build, Test, and Development Commands

```bash
mvn clean test
```

Runs the full API automation suite and writes Allure results under `target/allure-results`.

```bash
mvn test -Dtest=TestDummyJsonProducts
```

Runs a single test class while iterating locally.

## Coding Style & Naming Conventions

Use Java 21 and keep test code readable with Arrange, Act, Assert structure. Test classes should use `Test*` naming, such as `TestRestfulBookerAuth`. Client classes should end in `Client` and keep HTTP details out of assertions.

## Testing Guidelines

Tests should be deterministic and assert API status codes, response contracts, and relevant payload fields. Keep base URLs and shared setup in `config`, not duplicated in test classes. Avoid sleeps and broad assertions that hide contract regressions.

## Commit & Pull Request Guidelines

Use short imperative commits, for example `Add product contract tests`. Pull requests should describe covered endpoints, test data assumptions, and include the command used to validate the suite.

## External Service Notes

These tests depend on public APIs such as DummyJSON and Restful Booker. When failures occur, confirm whether the external service changed before changing assertions.
