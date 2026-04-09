# 🌌 Automação de API RestAssured (SWAPI)

Este projeto é um laboratório prático de automação de testes de Backend validando os contratos e comportamentos da clássica **Star Wars API (SWAPI)**. Construído inteiramente com stack tecnológica atualizada visando robustez estrutural, padronização corporativa e legibilidade utilizando boas práticas ágeis.

## 🛠️ Stack Tecnológica & Padrões

*   **Java 21**: Aproveitando máxima performance e recursos modernos da linguagem.
*   **RestAssured**: Framework principal de validação para simular o tráfego HTTP, asserções JSON e verificação de contratos.
*   **JUnit 5 (Jupiter)**: Motor de estruturação e execução dos cenários de teste, assegurando o ciclo de vida (*BeforeAll/After*, etc.).
*   **Maven**: Ferramenta oficial para gerenciamento seguro de dependências e automação dos *builds*.

### Padrões de Qualidade
*   **AAA (Arrange, Act, Assert)**: O comportamento interno dos métodos é estritamente limpo e separado nessas três etapas garantindo que qualquer desenvolvedor perceba o objetivo do teste rapidamente.
*   **Service Object Pattern (Client)**: Chamadas HTTP foram encapsuladas em classes clientes (ex: `SwapiClient`), separando o setup da comunicação do que é de fato a lógica do teste.
*   **Configurações em BaseTest**: Centralização do comportamento ambiente da API.

---

## 🏗️ Estrutura do Projeto (src)

O foco do projeto é puramente estrutural, demonstrando manutenibilidade escalável.
```text
src/test/java/
 ├── client/         # Serviços que abrigam os requests/spec builders (Ex: SwapiClient)
 ├── config/         # Configurações de ambiente, endpoints-base e abstração (BaseTest, Environment)
 └── tests/          # Suítes com cenários focados contendo os Asserts do fluxo (TestPeople, TestRoot)
```

---

## 🕹️ Como Executar os Testes

Assegure-se de que tenha o **Java 21+** e o **Apache Maven** devidamente instalados no seu ambiente.

1. **Baixe as dependências e rode a suíte completa** via linha de comando no diretório raiz do projeto:
   ```bash
   mvn clean test
   ```

2. **Validar Resoluções (Opcional):**
   *(Este repositório pode ser integrado junto a plugins do Allure Metrics no pom.xml futuramente visando integração ao CI/CD ou GitLab Pages)*.

## 🔗 Sobre o Monorepo

> [!NOTE] 
> O código original deste teste compõe uma parte acoplada do meu [Portfólio Interativo Web principal](https://github.com/jrcosta/portifolio-web). Foi modularizado via *Git Submodules* para provar independência e ao mesmo tempo integridade no ecossistema final.

✍ Desenvolvido por [Eneri Junior](https://github.com/jrcosta). Engenheiro de Automação de Cargas de Trabalho QA.
