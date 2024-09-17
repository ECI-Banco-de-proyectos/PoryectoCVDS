# Escuela Colombiana de Ingeniería Julio Garavito
# Proyecto Ciclos de vida del desarrollo de software 2020-1
# Grupo 2
## Integrantes: 
>- Germán Andres Ospina Quintero
>- Nicolás Ortega Limas
>- Juan Sebastián Nieto Molina 
>- Brayan Steven Burgos Delgado

## Roles:
|     Nombre    |     Rol         |
|:--------------:|:-------------: |
|Germán Andres Ospina Quintero |Team Developer    |
|Nicolas Ortega Limas |Team Developer   |
|Juan Sebastián Nieto Molina |Team Developer   |
|Brayan Steven Burgos Delgado |Team Developer   |
|Ing. Julián Mauricio Velasco Briceño |Product Owner   |

## Definición del proyecto y documentación del proyecto:
### Asignación de áreas
Para la asignación de áreas nos basamos en el organigrama presentado por la Escuela Colombiana de Ingenieria Julio Garavito, debemos tener presente que para la fecha 16/05/2020, el organigrama tuvo su ultima actualizacion en 2017. Podrá verlo en el siguiente [link.](https://www.escuelaing.edu.co/uploads/descargables/5564_organigrama_2017_modificado.pdf)

### Descripción General
Esta aplicación tiene como objetivo principal brindar a la comunidad una herramienta fácil y eficiente para la socialización de iniciativas.
Permite a los usuarios proponer e interactuar activamente con las
propuestas; registrando votos, reacciones y comentarios, además de brindar
la opción de poder visualizar los datos en gráficas, de tal manera que sean mucho más amenos al usuario.

### Funcionalidades más Importantes y Manual de Usuario

Cualquier persona que quiera visualizar la información presente en el sistema puede registrase como un usuario básico:
![enter image description here](https://github.com/ECI-Banco-de-proyectos/ProyectoCVDS/blob/master/imagenes/Registro.PNG?raw=true)
Una vez registrado puede logearse ingresando en el botón de abajo presente en la página anterior:
![enter image description here](https://github.com/ECI-Banco-de-proyectos/ProyectoCVDS/blob/master/imagenes/Ingreso.PNG?raw=true)
En nuestro caso ingresaremos como usuario administrador, para poder ver todas las funcionalidades de ofrece la plataforma (german, german):
En está pagina el usuario puede visualizar los datos de todos los usuarios:
![enter image description here](https://github.com/ECI-Banco-de-proyectos/ProyectoCVDS/blob/master/imagenes/Datos%20del%20usuario.PNG?raw=true)
Dando click en el bóton de la última columna es posible modificar el rol de usuario seleccionado:
![enter image description here](https://github.com/ECI-Banco-de-proyectos/ProyectoCVDS/blob/master/imagenes/Modificaci%C3%B3n%20Datos%20del%20Usuario.PNG?raw=true)
En la pestaña Busqueda de Iniciativas se pueden ver todos los datos de las iniciativas registradas:
![enter image description here](https://github.com/ECI-Banco-de-proyectos/ProyectoCVDS/blob/master/imagenes/Busqueda%20de%20iniciativas.PNG?raw=true)
En la parte inferior se puede ver el número de iniciativas por área en forma de un diagrama de barras:
![enter image description here](https://github.com/ECI-Banco-de-proyectos/ProyectoCVDS/blob/master/imagenes/Iniciativas%20por%20%C3%81rea.PNG?raw=true)
En botón con la imagen del lapiz de la penúltima columna se pueden modificar aspectos de las iniciativas, adicionalmente en la opción presente en la última es posible votar por la iniciativa y dejar su comentario sobre esta:
![enter image description here](https://github.com/ECI-Banco-de-proyectos/ProyectoCVDS/blob/master/imagenes/Modificar%20Iniciativa.PNG?raw=true)
![enter image description here](https://github.com/ECI-Banco-de-proyectos/ProyectoCVDS/blob/master/imagenes/Comentario_Voto_Iniciativa.PNG?raw=true)

## Funcionalidades más importantes:
>- Permitir al usuario un inicio de sesión que corresponda con su información.
>- Permitir al usuario consultar por iniciativas
>- Permitir a los usuarios comunes registrar iniciativas y votar por ellas.
>- Permitir a los usuarios administradores modificar las iniciativas
>- Permitir a los usuarios administradores modificar información de otros usuarios.

### Modelo E-R
![Modelo de Entidad y relaciones](https://github.com/ECI-Banco-de-proyectos/ProyectoCVDS/blob/master/imagenes/BD.PNG?raw=true)

### Diagrama de clases
![Modelo de Entidad y relaciones](https://github.com/ECI-Banco-de-proyectos/ProyectoCVDS/blob/master/imagenes/Diagrama%20de%20clases.JPG)

## Descripción de la arquitectura:

### Capa aplicación:
>- [Apache Maven](https://maven.apache.org/) (Project Management tool)
>- [Eclipse IDE](https://www.eclipse.org/)
>- [Guice](https://github.com/google/guice) (Inyección de Dependencias)
>- [Shiro](https://shiro.apache.org/) (Autenticación)

### Enlace a BD:
>- [PostgreSQL](https://www.postgresql.org/) (DataBase Management)

### Cloud Application Platforms:
>- [Heroku – Bootstrap](https://getbootstrap.com/) (Despliegue WEB)

### Capa de presentación:
>- [PrimeFaces](https://www.primefaces.org/) (Framework)
>- [JSF](http://www.javaserverfaces.org/) (UI Framework)

## Entrada a Heroku
En nuestro proyecto usamos la plataforma cloud de Heroku que se encuentra aquí
[Banco de Proyectos](https://proyectocvds2.herokuapp.com/faces/Registro.xhtml)

## Entrada a Circle ci
[Integración continua](https://app.circleci.com/pipelines/github/ECI-Banco-de-proyectos/ProyectoCVDS)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/dcf2a69020cc4bd2a9a47b956a55146f)](https://app.codacy.com/gh/ECI-Banco-de-proyectos/ProyectoCVDS?utm_source=github.com&utm_medium=referral&utm_content=ECI-Banco-de-proyectos/ProyectoCVDS&utm_campaign=Badge_Grade_Dashboard)
[![CircleCI](https://circleci.com/gh/ECI-Banco-de-proyectos/ProyectoCVDS/tree/master.svg?style=svg)](https://circleci.com/gh/ECI-Banco-de-proyectos/ProyectoCVDS/tree/master)

## Análisis Estático de Código con Codacy
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/39c3005f4d474aee881294dc88c1997b)](https://www.codacy.com/gh/ECI-Banco-de-proyectos/ProyectoCVDS?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=ECI-Banco-de-proyectos/ProyectoCVDS&amp;utm_campaign=Badge_Grade)

## Información de datos de acceso a la base de datos POSTGRESQL
>- host : ec2-3-91-112-166.compute-1.amazonaws.com
>- db: d52r0cth9ad4d6
>- user: nxztwufxsnpfki
>- port: 5432
>- pw: 74afdfee69819ba81f37f0f3c0bbcf1d2142f6760609f62db15392a3f2303d17 

## Informacion de la entrada a Taiga:
Enlace a la aplicacion de gestion del proyecto Taiga:
[Iniciativa y proyectos en Taiga](https://tree.taiga.io/project/germanaoq-plataforma-banco-de-iniciativas-de-proyectos/timeline)

## Comandos MVN para poder compilar el proyecto:
```mvn tomcat7:run``` 

```mvn package```

## Descripción de nuestro proceso:

### Metodología.

En este proyecto pusimos en práctica la utilización de **la metodología Scrum** en la cual el equipo se reúne y planea lo que se realizará en los diferentes Sprint, la herramienta que se utilizo fue **Taiga.io** la cual nos permite realizar las historias de usuario y repartir las tareas entre los integrantes.

Al finalizar cada Sprint, el equipo se reúne para planear el siguiente y se comentan lo que sucedió con el anterior.
Para el primer Sprint decidimos usar tres acercamientos, el primero que usamos en **la historia de usuario uno** fue realizar el desarrollo con todo el equipo, para así poder entender y aportar colectivamente a las bases de la aplicación, luego procedimos a dividirnos por parejas para continuar desarrollando **las historias de usuario dos, tres y cuatro** y finalmente decidimos que cada integrante escogiera las tareas de la historia de usuario faltante (**Historia cinco**).

Para el caso del segundo Sprint decidimos variar la manera en la que estabamos trabajando, decidimos dividir las historias de usuario por parejas inicialmente para que luego cada pareja lo dividiera como viera necesario.

En este caso **Sebastián y Brayan** decidieron seguir desarrollando las historias juntos **(Historias 6 y 7)** y en el caso de **Germán y Nicolás** las dividieron **(Historia 8 y 9)** y dejaron una sola para desarrollar como pareja **(Historia 10)**.

Para el caso del tercer Sprint los que se decidió fue dividir nuevamente las historias de usuario por parejas, para luego ser divididas individualmente. Sebastián y Brayan decidieron tomar las **historias numero 11 y 12**, Germán y Nicolás decidimos tomar las **historias 13 y 14**.

## Análisis de Sprints:

### Sprint Uno
Imagen del 'sprint-burndown chart', y una descripción breve de los problemas encontrados y mejoras realizadas al proceso.

![Sprint 1 Burndown chart](https://github.com/ECI-Banco-de-proyectos/ProyectoCVDS/blob/master/imagenes/sprint%201%20grafica.JPG)

En el Sprint uno el mayor problema que tuvimos fue el entendimiento de la importancia que tiene manejar correctamente la herramienta de gestión de proyecto de Taiga, más allá de que nuestro desarrollo terminó correctamente, no actualizamos las tareas de estado en Taiga, lo que llevó a que al cerrar las tareas después de la fecha final del Sprint nos generará una gráfica que no correspondía a nuestro trabajo real.



Imagen del 'sprint-backlog'

![Sprint 1](https://github.com/ECI-Banco-de-proyectos/ProyectoCVDS/blob/master/imagenes/sprint%201%20Backlog%201.JPG)

![Sprint 1](https://github.com/ECI-Banco-de-proyectos/ProyectoCVDS/blob/master/imagenes/sprint%201%20Backlog%202.JPG)


### Sprint 2:

Imagen del 'sprint-burndown chart'

![Sprint 2](https://github.com/ECI-Banco-de-proyectos/ProyectoCVDS/blob/master/imagenes/sprint%202%20grafica.JPG)

Para el caso del Sprint dos corregimos la mayoría de problemas surgidos en el Sprint uno y mejoramos en general nuestro desempeño.

Imagen del 'sprint-backlog'

![Sprint 2](https://github.com/ECI-Banco-de-proyectos/ProyectoCVDS/blob/master/imagenes/sprint%202%20Backlog%201.JPG)

![Sprint 2](https://github.com/ECI-Banco-de-proyectos/ProyectoCVDS/blob/master/imagenes/sprint%202%20Backlog%202.JPG)

![Sprint 2](https://github.com/ECI-Banco-de-proyectos/ProyectoCVDS/blob/master/imagenes/sprint%202%20Backlog%203.JPG)


### Sprint 3:

Imagen del 'sprint-burndown chart'

![Sprint 3](https://github.com/ECI-Banco-de-proyectos/ProyectoCVDS/blob/master/imagenes/Grafica%20sprint%203.JPG)

Para el caso del Sprint tres corregimos la mayoría de problemas surgidos en el Sprint uno y dos y mejoramos en general nuestro desempeño logrando terminar satisfactoriamente el desarrollo del proyecto.

Imagen del 'sprint-backlog'

![Sprint 3](https://github.com/ECI-Banco-de-proyectos/ProyectoCVDS/blob/master/imagenes/burndown%20chart%201.JPG)

![Sprint 3](https://github.com/ECI-Banco-de-proyectos/ProyectoCVDS/blob/master/imagenes/burndown%20chart%202.JPG)

![Sprint 3](https://github.com/ECI-Banco-de-proyectos/ProyectoCVDS/blob/master/imagenes/burndown%20chart%203.JPG)

### Reporte de pruebas usando EclEMMA

![Pruebas 1](https://github.com/ECI-Banco-de-proyectos/ProyectoCVDS/blob/master/imagenes/Reporte%20pruebas%201.JPG)

![Pruebas 2](https://github.com/ECI-Banco-de-proyectos/ProyectoCVDS/blob/master/imagenes/Reporte%20pruebas%202.JPG)




