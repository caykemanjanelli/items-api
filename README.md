# Items

## PROPÓSITO

> Consult items from item master on RMS database


### URLs Ambientes / Documentação

- Homologação: <http://items-company-products.apps.ocpvh1.company.com.br/items>

  - health da Aplicação: <http://items-company-products.apps.ocpvh1.company.com.br/items/actuator/health>
  - Swagger: <http://items-company-products.apps.ocpvh1.company.com.br/items/swagger-ui.html#/>
  - Spring actuator: <http://items-company-products.apps.ocpvh1.company.com.br/items/actuator>
  - Monitoria: ([Grafana](https://grafana-openshift-monitoring.apps.ocpvh1.company.com.br/d/85a562078cdf77779eaa1add43ccec1e/kubernetes-compute-resources-namespace-pods?orgId=1&refresh=10s&var-datasource=prometheus&var-cluster=&var-namespace=company-products&var-interval=4h&from=1596286220382&to=1596289820382))

- Produção: <http://items-company-products.apps.ocpvp1.company.com.br/items/>
  - health da Aplicação: <http://items-company-products.apps.ocpvp1.company.com.br/items/actuator/health>
  - Swagger: <http://items-company-products.apps.ocpvp1.company.com.br/items/swagger-ui.html#/>
  - Spring actuator: <http://items-company-products.apps.ocpvp1.company.com.br/items/actuator>
  - Monitoria: ([Grafana](https://grafana-openshift-monitoring.apps.ocpvp1.company.com.br/d/85a562078cdf77779eaa1add43ccec1e/kubernetes-compute-resources-namespace-pods?orgId=1&refresh=10s&var-datasource=prometheus&var-cluster=&var-namespace=company-products&var-interval=4h&from=1596286220382&to=1596289820382))

### Buildando imagem Docker

Caso altere o dockerfile, executar comando de build abaixo:

> Caso não passe o nome do service que deseja buildar ele fará tudo em cascata.
´´´sh
docker-compose build items-api
´´´

### PASSO 1 - Setup - primeira vez

 Install dependencias

 ´´´sh
 docker-compose run --rm items-api mvn install
 ´´´

### PASSO 2 - Up

 Apos executado o passo 01, pode-se executar a aplicação

 ´´´sh
 docker-compose up items-api
 ´´´
