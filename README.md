# JavaFX_Retrofit_GET
Simple JavaFX cliente Rest API (get) implementado con Retrofit2

**Para que el servidor JSON funcione debemos iniciar un contenedor al que se le pasa el fichero JSON con las entidades y datos.** En nuestro programa el fichero es productos.json 

El comando para ejecutarlo es ....

>docker run -d -p 8080:80 -v /rutaA/productos.json:/data/db.json clue/json-server

El servicio REST API está accesible en http://localhost:8080

