# Projeto do Bootcamp - DIO

## Desenvolvendo um Sistema de Gerenciamento de Pessoas em API REST com Spring Boot

### Repositório criado para compartilhar o projeto de API REST com Spring Boot - Java

Neste projeto foram desenvolvidos e abordados os seguintes tópicos:

* Setup inicial de projeto com o Spring Boot Initialzr 
* Criação de modelo de dados para o mapeamento de entidades em bancos de dados
* Desenvolvimento de operações de gerenciamento de usuários (Cadastro, leitura, atualização e remoção de pessoas de um sistema).
* Relação de cada uma das operações acima com o padrão arquitetural REST e a aplicação de cada um dos conceitos REST envolvidos durante o desenvolvimento do projeto.
* Desenvolvimento de testes unitários para validação das funcionalidades
* Implantação do sistema na nuvem através do Heroku

##### O foi utilizado:
- Java 11
- Maven 3.6.3
- Spring Boot (última versão estável lançada)
- GIT/ GITHUB para versionamento de código
- Heroku para deploy na nuvem
- sdkman.io
- Intellij Community

Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run 
```
Dica: se estiver utilizando Windows
```shell script
./mvnw spring-boot:run 
```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

``
http://localhost:8080/api/v1/people
``
