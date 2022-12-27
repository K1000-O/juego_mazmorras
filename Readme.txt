 /*********************************************************************************************\
|***********************************************************************************************|
|*****************************    TÍTULO DEL JUEGO DE MAZMORRAS    *****************************|
|***********************************************************************************************|
 \*********************************************************************************************/


A lo largo de este fichero, vamos a ir introduciendo los cambios realizados en cada versión.

La idea del proyecto, es realizar primero el código para el funcionamiento backend de la mazmorra. Tras ello, si el proyecto sigue en pie, se realizaría la interfaz del juego.

V-0.0.1:
    -   Comienzo de la recopilación de las ideas del juego.
    -   Comienzo desarrollo del PDF (documentación) de la aplicación.
    -   Comienzo de la clase Game. Será un patrón de diseño Singleton.
        +   Se encargará de crear, guardar y cargar el juego y los datos necesarios para su correcto funcionamiento.
            +   IMPORTANTE ==> A la hora de cargar es: loadGame if .dat exists else createGame
    -   Comienzo de la clase Player y la correspondiente clase abstracta Race.
    -   RACE:
        +   Human: started.
        +   Goblin: started.
        +   Dwarf: to start.
        +   Elf: to start.
        +   Orc: to start (It's useful on the game?).