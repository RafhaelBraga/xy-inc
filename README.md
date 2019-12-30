# XY Inc API
> Plataforma que fornece a inteligência ao dispositivo da XY Inc.

API desenvolvida sob demanda para fornecer inteligência ao dispositivo da empresa, que auxilia pessoas na localização de pontos de interesse (POIs). A plataforma conta com três serviços:
-   Serviço para cadastrar pontos de interesse, com 3 atributos: Nome do POI, coordenada X (inteiro não negativo) e coordenada Y (inteiro não negativo). Os POIs são armazenados em uma base de dados.    

-   Serviço para listar todos os POIs cadastrados.    

-   Serviço para listar POIs por proximidade. Este serviço recebe uma coordenada (X, Y) especificando um ponto de referência e uma distância máxima em metros (dmax). O serviço retorna todos os POIs da base de dados que estejam a uma distância menor ou igual a dmax a partir do ponto de referência.


## Requisitos para teste

[Download Intellij IDEA (Usada no desenvolvimento do projeto)](https://www.jetbrains.com/idea/download/)

[Download Postman (Usado para testar requisições)](https://www.getpostman.com/downloads/)

[Download MongoDB (Base de dados)](https://www.mongodb.com/download-center/community)

## Pacotes 
O projeto foi divido em pacotes para fins de organização:

-	Controllers: responsáveis por fazer o controle das requisições.
-	Documents: Classes do projeto, semelhantes a moldes.
-	Dtos: São usados para transferir os dados.
-	Repositories: São responsáveis pela interação com a base de dados.
-	Services: Responsáveis por fazer a interação dos repositories com o projeto, onde ficam as regras de negócio.

## Exemplos de uso e teste

Após importar o projeto no IntelliJ, clique no botão "Run" ou use o atalho "shift+F10".
![XYIncRun](https://user-images.githubusercontent.com/49730865/71592068-8722de80-2b0d-11ea-8365-994c22a06e8d.png)


Abra o Postman e clique no botão "Create a Request".
![XYIncCreateRequest](https://user-images.githubusercontent.com/49730865/71589790-ddd7ea80-2b04-11ea-971a-12ebb4d65946.png)


Para registrar um novo poi, altere o método para "POST", digite "http://localhost:8080/poi/add" na barra. Em Body marque a opção "raw" e altere o campo para "JSON".
![XYIncJSON](https://user-images.githubusercontent.com/49730865/71590007-bcc3c980-2b05-11ea-9969-30972a9ab045.png)



Digite os dados do poi no campo da requisição e clique em "Send".

![XYIncPost](https://user-images.githubusercontent.com/49730865/71590024-ccdba900-2b05-11ea-86c3-b58a2ee4fb83.png)

Para  visualizar todos os POIs registrados altere o método para "GET" e digite "http://localhost:8080/poi/list" na barra, depois clique em "Send". Os resultados serão mostrados no campo "Response".
![XYIncList](https://user-images.githubusercontent.com/49730865/71590038-debd4c00-2b05-11ea-9890-173726792022.png)


Para visualizar os POIs por proximidade, digite os dados da pesquisa no campo da requisição, digite "http://localhost:8080/poi/near" na barra, altere o método para "GET" e clique em "Send".
![XYIncNear](https://user-images.githubusercontent.com/49730865/71590049-ea107780-2b05-11ea-940b-4517071d6ff0.png)


Com a finalidade de facilitar os testes, foi implementado um meio de deletar todos os POIs cadastrados. Para tal, altere o método para "DELETE", digite "http://localhost:8080/poi/clear" na barra e clique em Send.
![XYIncDelete](https://user-images.githubusercontent.com/49730865/71590073-fb598400-2b05-11ea-8f0a-0745abf60bab.png)



## Autores

Rafhael Menezes Braga – rafhaelmbraga@gmail.com

[https://github.com/RafhaelBraga/xy-inc](https://github.com/RafhaelBraga/xy-inc)
