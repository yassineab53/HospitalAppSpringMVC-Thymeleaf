# Application de Gestion des Patients

## Description
Ce projet est une application simple pour gérer des patients. L'application permet de stocker et de gérer les informations des patients dans une base de données H2 ou MySQL, tout en respectant l'architecture MVC côté serveur.

## Fonctionnalités
Chaque patient est défini par les attributs suivants :
- **ID** (type : `Long`) : Identifiant unique du patient.
- **Nom** (type : `String`) : Nom du patient.
- **Date de naissance** (type : `Date`) : Date de naissance du patient.
- **Malade ou non** (type : `boolean`) : Indique si le patient est malade.
- **Score** (type : `int`) : Score du patient.

## Technologies utilisées
- **Langage de programmation** : Java
- **Frameworks** : Spring Boot
- **Base de données** : H2 / MyQSL
- **Architecture** : Modèle-Vue-Contrôleur (MVC)

## Configuration du projet
### Prérequis
- Java 17 ou supérieur
- Maven pour la gestion des dépendances
- Une instance de MySQL (si MySQL est utilisé)

### Installation
1. Clonez ce dépôt :
   ```bash
   git clone <URL_DU_DEPOT>

2. Accédez au répertoire du projet  :
   ```bash
   cd gestion-patients

3. Configurez la base de données dans le fichier application.properties :
   ```bash
   spring.application.name=hospiral-app-spring-mvc
   server.port=8089
   spring.datasource.url=jdbc:h2:mem:patients-db
   spring.h2.console.enabled=true

4. Lancez l'application :
   ```bash
   mvn spring-boot:run

### Utilisation
Une fois l'application démarrée :

- Accédez à l'application via http://localhost:8080.
- Gérez les patients en utilisant les fonctionnalités CRUD (Créer, Lire, Mettre à jour, Supprimer).

### Contribuer
Les contributions sont les bienvenues ! Créez une issue ou soumettez une pull request pour toute amélioration.

### Auteur
Ce projet a été développé par **Yassine Abbou** dans le cadre d'une activité pratique avec le prof **Mohamed Youssfi**