# **EXAMEN DE SPRING DIM XLVI ABR24**
Empleo Nombre y apellidos: _General CGET/GC D. XXX XXX XXX_   

Fecha: _22 de abril de 2024_
<hr>

## **Normas Generales para la Prueba**
1. Durante la realización del examen queda prohibido el uso ( incluido funcionamiento en segundo plano) de cualquier aplicación que facilite la conexión de cualquier tipo con un tercero.   
_El incumplimiento de este apartado supondrá  la calificación más baja (cero) en el presente examen._
1. Todas las páginas del examen deben tener su nombre y apellidos manuscrito.    
1. Inicie una grabación de sus dos pantallas, al completo,  con la aplicación `OBS`, recuerde que el formato de salida debe ser `.mkv`. Al finalizar el examen deberá subir la grabación a la carpeta `172.16.250.202/fase-presente/24.Spring/VIDEOS_EXAMEN`. En la grabación debe verse desde el commit `Inicio del examen práctico` hasta el commit `Fin del Examen`.  
    _La imposibilidad del visionado del vídeo, su visionado parcial, su falta  o no se grabe la totalidad de las pantallas supondrá la calificación más baja (cero) en el presente examen._
1.	Cuando finalice el examen teórico avise al profesor, que acudirá para hacer la entrega de la parte práctica y recoger la parte teórica. **NO SE OLVIDE DE FIRMAR SU EXAMEN**.
1.	Durante la realización del examen no se podrá abandonar el puesto donde está su equipo; el abandono del puesto supondrá la finalización del examen y se tendrá en cuenta para su corrección el código generado hasta el momento de abandonar su puesto.
1.	Hay 40 puntos en juego. El aprobado se consigue con 20 puntos. Antes de cada pregunta figura su valoración.
1. El tiempo para realizar el examen es de 180 minutos y el inicio del mismo se pondrá en el canal de la asignatura https://dim.institutomilitar.com/grain/EWAs32eGHyBt7eZnkWFi7Z/channel/backend-spring.

### **Fin de Normas Generales para la Prueba**

<p style="PAGE-BREAK-AFTER: always;"></p>

## **Parte teórica (5 puntos)**

1. **(1 punto)** ¿Qué anotación usaría si quiere introducir información procedente de un .properties en un bean? Explique porqué puede ser especialmente útil esta anotación cuando la api está ya compilada y deplegada en un servidor.
<br><br><br><br><br><br><br><br><br><br><br><br>
1. **(1 punto)** ¿Qué archivo no necesita declararse y es leído siempre por SpringBoot?
<br><br><br>
1. **(3 puntos)** ¿Dónde debería colocar una clase si quisiera no preocuparme por que sea escaneada en busca de anotaciones…? ¿Esto implica que siempre debo hacerlo así? Explíquelo.
<br><br><br><br><br><br><br><br><br><br><br><br>

### **Fin de parte teórica**

<p style="PAGE-BREAK-AFTER: always;"></p>

## **Parte práctica (35 puntos)**

La prueba consiste en realizar una serie de ejercicios en un tiempo límite de **3 horas** y subirlo a un repositorio online.
1. Abra el repositorio https://git.institutomilitar.com/joseluispuentes82/examenspring2024-nombreAlumno
1. Clone el repositorio a local , en el podrá encontrar un proyecto de **SpringBoot** que deberá completar. 
1. Tenga en cuenta las siguientes indicaciones:
    1. Modifique el `README.md` poniendo su nombre  y apellidos.
1. Realice un `commit` con la modificación anterior, con el texto `Inicio del examen práctico` y súbala al repositorio de  https://git.institutomilitar.com donde hizo el `clone`. 
1. Cuando se le pida `Muestre por consola.`  se refiere a que la consola del eclipse debe mostrar el resultado correcto que se le solicita utilizando el código implementado solicitado y cualquier otra cosa se valorará como 0 (cero).
1. Antes de finalizar el tiempo del examen (Normas Generales para la Prueba) deberá hacer un commit con su solución con el texto `Fin del Examen`, no se tendrá en cuenta ningún commit posterior. 
1. El examen está planteado sobre la temática de educación, con las relaciones que se irán exponiendo durante los distintos puntos del examen.
1.	Recuerde añadir toda la configuración que necesite a los archivos `build.gradle` y `application.properties` y arrancar H2.

<p style="PAGE-BREAK-AFTER: always;"></p>

### A partir de aquí se pide y se valora:

1. **(3 puntos)** Se valorará positivamente el uso correcto de estilo, existencia de código sobrante, buenas prácticas, organización correcta del proyecto (paquetes), uso adecuado de clase/s de configuración, uso adecuado de placeholder...
1. **(3 puntos)** Genere una nueva clase llamada `Aula`. Esta clase tendrá solo un campo propio de tipo `Proyector`. (Cargar beans por anotaciones @Component, @Bean e Inyección de dependencias @Autowired).<br>
A tener en cuenta:
    1. (1 punto) Haga que `Aula` sea un bean y que Spring lo añada a su contenedor. `Aula` no es, ni será una entidad. **¡NO tiene que persistirla!**
    1. (1 punto) Cargue además un bean que sea un `Proyector`.
    1. (1 punto) Haga uso de la inyección de dependencias para que al cargar el bean `Aula` se le inyecte de forma **obligatoria** el bean `Proyector`.
1. **(3 puntos)** Implemente el código necesario para persistir la clase `Proyector` (JPA Hibernate con ORM. XML).<br>
A tener en cuenta:
    1. (2,5 puntos) La clase `Proyector` es **externa** y no puede modificar, añadir, ni omitir nada de ella.
    1. (0,2 puntos) El id debe ser autogenerado.
    1. (0,1 puntos) La tabla debe llamarse `PROYECTORES_FISHER`.
    1. (0,1 puntos) La columna _herzios_ debe llamarse `ERCIO`.
    1. (0,1 puntos) La columna _distanciaMaxima_ debe llamarse `DISTANCIA_PROYECCION`.
1. **(3 puntos)** Implemente el código necesario para persistir las clases `Profesor` y `Colegio` (JPA Hibernate  @OneToMany).<br>
A tener en cuenta:
    1. (2,5 puntos) Use una **JoinColum**: Es decir, la clave ajena en una columna de la entidad `Profesor` que referencia a la clave primaria de la entidad `Colegio` (como hemos visto en clase).
    1. (0,1 puntos) Los id,s deben ser autogenerados.
    1. (0,1 puntos) No se desea persistir el campo _masculino_.
    1. (0,1 puntos) La columna _fechaInicioContrato_ de `Profesor` debe llamarse `FECHA_INICIO`.
    1. (0,1 puntos) La columna _id_ de `Profesor` debe llamarse `ID_PROFESOR`.
    1. (0,1 puntos) Recuerde sincronizar la relación.
1. **(4 puntos)** Implemente el código necesario para persistir una nueva entidad que se llamará `Asignatura` (JPA Hibernate @OneToMany).<br>
A tener en cuenta:
    1. (0,2 puntos) La clase `Asignatura` deberá tener un campo llamado _english_ (boolean), un campo llamado _nombre_ (String), un campo llamado _inicio_ (Instant) y un campo llamado _fin_ (Instant).
    1. (0,3 puntos) Implemente el código necesario para establecer una relación OneToMany entre `Profesor` y `Asignatura`.
    1. (3 puntos) Implemente el código necesario para, persistir adecuadamente la clase `Asignatura`. 
    1. (0,5 puntos) Implemente el código conveniente para que los nombres de las columnas sean adecuados y que la tabla se llame `ASIGNATURAS`.
1. **(2 puntos)** Implemente el código necesario para añadir la capa REST nivel HATEOAS (Data REST, endpoints HATEOAS).<br>
A tener en cuenta:
    1. (0,4 puntos) No debe exponer los repositorios que no tengan la anotación adecuada y debe añadir el prefijo “api” a sus url,s.
    1. (1 punto) Aplique y configure convenientemente la anotación adecuada a sus repositorios para exponerlos.
    1. (0,6 puntos) Implemente todo lo necesario para que sea HATEOAS (autodescubrimiento de URL,s), si es que no lo ha hecho anteriormente.
1. **(2 puntos)** Genere e implemente unos **Mixins** que hagan lo siguiente:
    1. Para `Asignatura`:
        1. La respuesta debe mostrar _inicioAsignatura_ en lugar de _inicio_.
        1. La respuesta debe mostrar _finAsignatura_ en lugar de _fin_.
    1. Para `Profesor`:
        1. La respuesta debe **ignorar** el campo _casado_.
        1. La respuesta debe seguir el **orden** siguiente: correo, nombre, fechaInicioContrato, area.
1. **(4 puntos)** Implemente el código necesario para conseguir lo siguiente (**Listener**):<br>
A tener en cuenta:
    1. (1,8 puntos) Antes de crear un `Profesor` en la BBDD se genere un **log** con nivel WARN con el mensaje: “Se va a crear a ” + “nombre del profesor”. También se mostrará en consola en color **rojo**.
    1. (1,8 puntos) Después de borrar una `Asignatura` en la BBDD se genere un **log** con nivel ERROR con el siguiente mensaje: “Se ha borrado la asignatura con nº de control “ + “nº de control de asignatura aleatorio”. También se mostrará en consola en color **rojo**.
    1. (0,4 puntos) Además de por consola, se desea que estos log,s se guarden en un archivo llamado `**examen2024.log**` dentro de un directorio llamado _logs_, que se encontrará en la carpeta o paquete raíz.
1. **(3 puntos)** Aprovechando la potencia que le ofrece JPA, implemente el código necesario para configurar sus métodos y conseguir lo siguiente (Añadir código personalizado):<br>
A tener en cuenta:
    1. (1,2 puntos) Un método que encuentre los profesores por su área, **ignorando mayúsculas y minúsculas**, y devolviendo una lista con los mismos en caso de alguna coincidencia.  
        1. El parámetro del método se llamará **texto**.
        1. Configure la ruta para que se llegue a él con un **GET** a .....profesores/search/por-area?area=”valor que se desea buscar”. 
    1. (1,2 puntos) Un método que encuentre las asignaturas por su nombre, y devolviendo una lista con las 	mismas en caso de **coincidencia exacta**.
        1. Configure la ruta para que se llegue a él con un **GET** a .....asignaturas/search/por-nombre?nombre=”valor que se desea buscar”.
     1. (0,6 puntos) Un método que **prohíba borrar** los proyectores con una llamada REST. Este método no debe exponerse.
1. **(4 puntos)** Añadir código personalizado. Uso de **Controladores**:<br>
A tener en cuenta:
    1. (3 puntos) Implemente el código necesario para, haciendo uso de un controlador, exponer 3 métodos personalizados con las siguientes funcionalidades:
        1. (1 punto) Devuelva una lista con los profesores bilingües (dan alguna asignatura en inglés).
        1. (1 punto) Devuelva una lista con los profesores que dan alguna asignatura en español.
        1. (1 punto) Devuelva una lista con los profesores no bilingües (no dan ninguna asignatura en inglés).<br>
		A tener en cuenta:
            1. Las listas no deben tener elementos repetidos.
            1. Recuerde que no se trata solo de implementar los métodos, sino de exponerlos convenientemente para ser consumidos como un servicio web y ser autodescubribles (HATEOAS).
            1. Configure las rutas para que se llegue a ellos con un **GET** a ...profesores/search/bilingües, con un **GET** a ...profesores/search/en-spanish y con un **GET** a ...profesores/search/no-bilingues respectivamente.
    1. (1 punto) Implemente el código necesario para, haciendo uso de un controlador, exponer un método personalizado con la siguiente funcionalidad:
        1. Devuelva una lista con los proyectores filtrados por un _alcance mínimo_. Es decir, pasándole como parámetro un _alcance_, devuelva los que tienen un alcance mayor.<br>
		A tener en cuenta:
            1. Recuerde que no se trata solo de implementar el método, sino de exponerlo convenientemente para ser consumido como un servicio web y ser autodescubrible (HATEOAS).
            1. El parámetro del método se llamará **alcance**.
            1. Configure la ruta para que se llegue a él con un **GET** a ...proyectores/search/por-alcance-minimo?alcanceMinimo=”valor del alcance que se va a usar como filtro”.
1. **(4 puntos)** El código de la api compila, es robusto y responde correctamente a las llamadas desde **POSTMAN** (_GET, POST, PATCH y DELETE_) a los diferentes recursos.
1. **(5 puntos (extra))** Despliega la API en Heroku, usando la BD de AivenSQL (se valorará que el código entregado contenga todo lo necesario y **sólo** lo necesario para su funcionamiento en Heroku).

### **Fin de parte práctica**

### **FIN EXAMEN**
