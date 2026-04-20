# 🎯 Portfólio de Automação: API RestAssured

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![RestAssured](https://img.shields.io/badge/RestAssured-1CB882?style=for-the-badge&logo=json&logoColor=white)
![JUnit 5](https://img.shields.io/badge/JUnit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A22?style=for-the-badge&logo=apachemaven&logoColor=white)
![GitHub Actions](https://img.shields.io/badge/GitHub_Actions-2088FF?style=for-the-badge&logo=github-actions&logoColor=white)
![Allure Report](https://img.shields.io/badge/Allure_Report-ECAA1A?style=for-the-badge&logo=qgis&logoColor=white)

Este projeto é um laboratório prático de automação de testes de Backend validando os contratos e comportamentos das APIs públicas **DummyJSON** e **Restful-Booker**. Construído inteiramente com stack tecnológica atualizada visando robustez estrutural, padronização corporativa e legibilidade utilizando boas práticas ágeis.

## 🛠️ Stack Tecnológica & Padrões

*   **Java 21**: Aproveitando máxima performance e recursos modernos da linguagem.
*   **RestAssured**: Framework principal de validação para simular o tráfego HTTP, asserções JSON e verificação de contratos.
*   **JUnit 5 (Jupiter)**: Motor de estruturação e execução dos cenários de teste, assegurando o ciclo de vida (*BeforeAll/After*, etc.).
*   **Maven**: Ferramenta oficial para gerenciamento seguro de dependências e automação dos *builds*.

### Padrões de Qualidade
*   **AAA (Arrange, Act, Assert)**: O comportamento interno dos métodos é estritamente limpo e separado nessas três etapas garantindo que qualquer desenvolvedor perceba o objetivo do teste rapidamente.
*   **Service Object Pattern (Client)**: Chamadas HTTP foram encapsuladas em classes clientes (ex: `DummyJsonClient`), separando o setup da comunicação da lógica do teste.
*   **Configurações em BaseTest**: Centralização do comportamento ambiente da API.

---

## 🏗️ Estrutura do Projeto (src)

O foco do projeto é puramente estrutural, demonstrando escalabilidade para múltiplos microserviços.
```text
src/test/java/
 ├── client/         # Serviços que abrigam os requests/spec builders de cada provider (DummyJsonClient, RestfulBookerClient)
 ├── config/         # Configurações de ambiente, endpoints-base genéricos (BaseTest)
 └── tests/          # Suítes com cenários focados nos Asserts (TestDummyJsonProducts, TestRestfulBookerAuth)
```

---

## 🕹️ Como Executar os Testes

Assegure-se de ter o **Java 21+** e o **Apache Maven** devidamente instalados no seu ambiente.

1. **Baixe as dependências e rode a suíte completa** via linha de comando no diretório raiz do projeto:
   ```bash
   mvn clean test
   ```

2. **Visualizar Relatórios (Allure Report):**
   O projeto conta com *Continuous Integration (CI)* via **GitHub Actions**. Sempre que há alterações no código, os testes rodam automaticamente e o relatório é publicado no **GitHub Pages**, provendo métricas visuais sobre as asserções e mapeando as falhas induzidas caso existam divergências nas APIs reais.

## 🔗 Sobre o Monorepo

> [!NOTE] 
> O código original deste teste compõe uma parte acoplada do meu [Portfólio Interativo Web principal](https://github.com/jrcosta/portifolio-web). Foi modularizado via *Git Submodules* para provar independência e ao mesmo tempo integridade no ecossistema final.

🌐 Encontre-me no GitHub: [@jrcosta](https://github.com/jrcosta)
