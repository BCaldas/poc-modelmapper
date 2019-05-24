
# POC ModelMapper

Pequena POC para demonstrar o uso da bilbioteca Java ModelMapper para mapeamento de entidades para DTO's e vice e versa junto com Spring Boot.

## Tecnologias Usadas:

- Java 8
- Spring Boot
- H2 (Banco de dados em memória)

## Bibliotecas de Terceiros:

- ModelMapper (http://modelmapper.org/)

## Instalação

- Clone o repositório dentro da pasta desejada.
- Instale as dependências necessárias com o comando:
```bash
$ mvn install
```
- Rode o servidor com o comando:
```bash
$ mvn spring-boot:run
```
- O Banco de dados é um banco em memória embutido no projeto, ele fica online junto com a API.
- O console de adm do BD pode ser acessado em http://localhost:8080/h2-console/.

## Observações

- O arquivo "data.sql" que se encontra na pasta resource já possui dados para popular o BD ao subir a aplicação.

## Requerimentos

- Java SDK 1.8
- Algum cliente para Api Rest como o Postman (https://www.getpostman.com/) ou outro.

## Endpoints
- /clientes - Retorna todos os clientes.
- /clientes/{id}/apolices - Retorna todas as apólices de um cliente.
- /apolices - Retorna todas as apolices.