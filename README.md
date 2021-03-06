# oesteBackEnd
_REST API para la consulta de dos entidades (Persona e Identidad) relacionadas entre si por una entidad con una relaci贸n de mucho a muchos_


### Pre-requisitos 馃搵

_Es necesario tener una base de datos con MySQL, los datos de conexi贸n se establecen en el archivo de propiedades del proyecto_

## Caracteristicas del proyecto 鈿欙笍

_Rutas y m茅todos para:_

* Crear una persona
* Editar una persona
* Obtener todos los registros de las personas
* Obtener una persona
* Eliminar una persona (eilminado l贸gico)
* Crear una identificaci贸n
* Editar una identificaci贸n
* Obtener todos los registros de identificaciones
* Obtener una identificaci贸n
* Eliminar una identificaci贸n (eilminado l贸gico)

_carateristicas de la entidad Persona:_

* name (string) [campo obligatorio]
* age (number)  [campo obligatorio]
* gender (string) ('H' o 'M') [campo no se deja como null]
* code (string) [m茅todo que genera una cadena de texto aleatoria de 10 caracteres y asigna en la creaci贸n]
* createdAt (date)

_caracteristicas de la entidad Identificaci贸n:_

* identificationName (string) [campo obligatorio]
* description (number) [campo obligatorio]
* createAt (date)


## Construido con 馃洜锔?

_Menciona las herramientas que utilizaste para crear tu proyecto_

* Java 11
* [Spring Boot](https://spring.io/projects/spring-boot) - El framework web usado
* [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [IDE STS](https://spring.io/tools)


## Versionado 馃搶

Usamos [SemVer](http://semver.org/) para el versionado. Para todas las versiones disponibles, mira los [tags en este repositorio](https://github.com/brakeencj/oesteBackEnd/tags).

## Autor 鉁掞笍

* **Gabriel Cervantes** - *Desarrollador Full Stack*  

## Expresiones de Gratitud 馃巵

* Comenta a otros sobre este proyecto 馃摙
* Invita una cerveza 馃嵑 o un caf茅 鈽? a alguien del equipo. 
* Da las gracias p煤blicamente 馃.
* etc.
