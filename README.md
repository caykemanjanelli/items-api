# Items

## PROPÓSITO

> Consult items of a marketing

### URLs Ambientes / Documentação

- health da Aplicação: <http://items-company-products.apps.ocpvh1.company.com.br/items/actuator/health>

### Buildando imagem Docker

Caso altere o dockerfile, executar comando de build abaixo:

> Caso não passe o nome do service que deseja buildar ele fará tudo em cascata.
´´´sh
docker-compose build items-api
´´´

### PASSO 1 - Setup - primeira vez

 Instalando dependencias

 ```sh
 docker-compose run --rm items-api mvn install
 ```

### PASSO 2 - Up

 Após executado o passo 01, para executar a aplicação

 ```sh
 docker-compose up items-api
 ```
