# ByCoders Challenge
Este projeto foi configurado para ser executado em container do Docker.

## Precisamos dos seguintes programas instalados:
- Java 17
- Docker - https://docs.docker.com/install/
- Docker compose - https://docs.docker.com/compose/install/


## Configuração do projeto Spring Boot

Antes de iniciar os containers dos projetos usando o **Docker Compose** é necessário fazer o build do projeto API usando o **Maven** com o seguinte comando:

```
 ./mvnw clean install
```

Este comando irá gerar o arquivo binário .jar que será executado no container do backend. Antes de criar o jar, o Maven executa os testes que foram configurados dentro do pacote de testes do Spring.

_Este comando deve ser executado no Terminal da raiz do projeto **bycoders-api**_.


## Iniciando os containers e executando o projeto

Foi configurado três containers para criar a solução do desafio:
- Banco de dados Postgresql executando na porta 5432.
- Spring Boot executando na porta 8080 usando o Java 17.
- ReactJS executando na porta 3000 usando o Node.js.

Para iniciar os containers e executar as aplicações basta rodar o seguinte comando na raiz do projeto onde está localizado o arquivo _**docker-compose.yml**_:

```
  docker-compose up --build
```

Este comando irá fazer o download das imagens, criar os container e executa-los.

## Acessando a aplicação

### Frontend
Após o início dos containers deve ser possível acessar as aplicações. Abra em seu navegador o link http://localhost:3000 para acessar o projeto frontend. Por ele é possível fazer o upload do arquivo CNAB.txt e visualizar as informações que foram armazenadas no banco de dados.

##### Obs: O item **Saldo em conta** da lista dos registros cadastrados na web é a **soma de todas as entradas financeiras** da loja que estará sendo exibida na listagem dos registros.

### Backend
Assim como o projeto frontend, o backend estará sendo executado e pode ser acessado pelo link http://localhost:8080.

**A documentação de como utilizar a api estará na seguinte url: http://localhost:8080/swagger-ui/index.html.**

### Bando de Dados
As credenciais para acessar o banco de dados desta aplicação são as seguintes:

- HOST: **localhost**
- PORTA: **5432**
- USERNAME: **postgres**
- SENHA: **docker**
- NOME DO BANCO: **bycoders**

### Obrigado! **@allcantara**