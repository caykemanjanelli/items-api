# Items

### PROPÓSITO

> Consult items from item master on RMS database

#### TECNOLOGIAS ENVOLVIDAS

- Java 11
- Maven
- Spring Boot

##### DEPENDÊNCIAS E VERSÕES

- Java OpenJDK 11: ([Download](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- Maven 3.5.4+ : ([Download](https://maven.apache.org/download.cgi))

##### DEPENDÊNCIAS C&A

- Banco de Dados: Oracle RMS: ([TNS](src/main/resources/application.yml))

##### Projetos que consomem esse web service:

- [estoque-desbloqueio](https://git.company.com.br/products/estoque/estoque-desbloqueio)
- [export-online-stock](https://git.company.com.br/products/exportbi/export-online-stock)

#### URLs Ambientes / Documentação:

- Homologação: http://items-company-products.apps.ocpvh1.company.com.br/items

  - health da Aplicação: http://items-company-products.apps.ocpvh1.company.com.br/items/actuator/health
  - Swagger: http://items-company-products.apps.ocpvh1.company.com.br/items/swagger-ui.html#/
  - Spring actuator: http://items-company-products.apps.ocpvh1.company.com.br/items/actuator
  - Monitoria: ([Grafana](https://grafana-openshift-monitoring.apps.ocpvh1.company.com.br/d/85a562078cdf77779eaa1add43ccec1e/kubernetes-compute-resources-namespace-pods?orgId=1&refresh=10s&var-datasource=prometheus&var-cluster=&var-namespace=company-products&var-interval=4h&from=1596286220382&to=1596289820382))

- Produção: http://items-company-products.apps.ocpvp1.company.com.br/items/
  - health da Aplicação: http://items-company-products.apps.ocpvp1.company.com.br/items/actuator/health
  - Swagger: http://items-company-products.apps.ocpvp1.company.com.br/items/swagger-ui.html#/
  - Spring actuator: http://items-company-products.apps.ocpvp1.company.com.br/items/actuator
  - Monitoria: ([Grafana](https://grafana-openshift-monitoring.apps.ocpvp1.company.com.br/d/85a562078cdf77779eaa1add43ccec1e/kubernetes-compute-resources-namespace-pods?orgId=1&refresh=10s&var-datasource=prometheus&var-cluster=&var-namespace=company-products&var-interval=4h&from=1596286220382&to=1596289820382))

### PASSO 01 - Baixando o Projeto + GIT FLOW

Saiba mais como baixar o projeto e iniciar usando **GitFlow**:

<a href="https://git.company.com.br/vikings/readme-auxiliar/-/blob/develop/template/GITFLOW_README.md" target="_blank">Clique aqui</a>

### PASSO 2 - BUILD - UTILIZAÇÂO VIA DOCKER CONTAINER

Saiba mais como realizar o build do projeto via Container **Docker**:

<a href="https://git.company.com.br/vikings/readme-auxiliar/-/blob/develop/template//DOCKER_README.md" target="_blank">Clique aqui</a>

### PASSO 3 - DEPLOY - OPENSHIFT

Saiba mais como Analisar/Debugar o Deploy no **OPENSHIFT**:

<a href="https://git.company.com.br/vikings/readme-auxiliar/-/tree/develop/template/OPENSHIFT_README.md" target="_blank">Clique aqui</a>

### Dicas:

Agora algumas dicas para ajudar o dev

<a href="https://git.company.com.br/vikings/readme-auxiliar/-/tree/develop/template/DICAS_README.md" target="_blank">Clique aqui</a>

### FAQ - CONTATOS - TROUBLESHOOTING

##### Maintainers: Vikings Squad

##### Desenvolvedores: Vikings Squad
