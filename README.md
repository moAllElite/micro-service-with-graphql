MICROSERVICE WITH GRAPHQL
# Configuration et installation

##   Prérequis
   
Assurez d'avoir ces outils installés avant l'exécution du projet:

- Java Development Kit (JDK) 17 ou supérieur 
- Maven
- Docker (optionnel pour containerisation)
##  Installation
  Cloner le répositoire:
  git clone git remote add origin 

Naviger dans les dossiers  du projet 
Faite un mvn clean install pour builder les dépendances du projet 


# Usage
Tester vos endpoints via GraphiQL
  ````
   http://localhost:9090/graphiql?path=/graphql
  ````
## GraphiQL

 - get all students 

![img.png](img.png)

![img_2.png](img_2.png)

- count students

![img_1.png](img_1.png)

- gateway on create new school on port `8222`

![img_3.png](img_3.png)

- gateway redirect on find all teachers

![img_5.png](img_5.png)