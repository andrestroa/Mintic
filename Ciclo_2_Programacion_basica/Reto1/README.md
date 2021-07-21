# RETO 1.21
## Nombre del reto: Diseño de sistema estadístico para escuela
### Descripción del reto con su respectiva solución:

Una escuela  primaria desea implementar  un sistema estadístico de clasificación  de
notas de los exámenes de sus estudiantes. 
La escuela utiliza un sistema de notas basado en números que van desde el 0 hasta el
100, con diferentes rangos con labels que enfatizan el desempeño de los estudiantes. 
El  sistema  debe  generar  datos estadísticos  que  puedan  ayudar  a  los  profesores  a
identificar  grupos  o  estudiantes  con  dificultades. Actualmente  se  cuenta  con  la
información de las calificaciones de los exámenes para cada uno de los estudiantes de
la clase F,  el sistema debe  generar los datos estadísticos  a partir  de los siguiente
información:

|  Nombre |Género   |Materia   |Nota   |
| ------------ | ------------ | ------------ | ------------ |
| maria  |  f | matematicas  |81.2   |
| nicolas  |m   | matematicas  | 92.9  |
|  maria |  f | idiomas  | 86.1  |
|  nicolas | m  | idiomas  |  68.9 |

Las calificaciones en la escuela se asignan con la siguiente escala de rangos:

|  Rango de notas |  Calificación  |
| ------------ | ------------ |
| (90 - 100]  | Excelente  |
|  (80 - 90] |  Sobresaliente |
| (60 - 80]  | Regular  |
|  (30 - 60] |  Insuficiente |
|   [0 - 30]| Deficiente  |

El algoritmo debe ser capaz de responder a las siguientes preguntas:
-  ¿Cuál es la varianza de las calificaciones para todo el grupo?
-  ¿Qué porcentaje de los exámenes fueron Regulares?
-  ¿Cuál es la materia con el mayor número de exámenes aprobados?
-  ¿Cuál es el estudiante con el mejor desempeño para la materia química?

#### EJEMPLO
Para facilitar el proceso de ingreso y manipulación de los datos, lostring se les asignará un identificador numérico único por categorías:

|  Nombre |  Identificador |
| ------------ | ------------ |
|   armando| 1  |
|  nicolas | 2  |
|  daniel | 3  |
| maria  | 4  |
|  marcela |  5 |
|  alexandra | 6  |

|  Materia  |  Identificador |
| ------------ | ------------ |
| Identificador  |  1 |
|  Identificador |   2|
|  Identificador | 3  |

| Género  |  Identificador |
| ------------ | ------------ |
|  m |  0 |
|  f |  1 |

| Entrada del programa |
| ------------ |
|  18| 
| 1.0 0.0 1.0 76.3| 
| 1.0 0.0 2.0 54.4| 
| 1.0 0.0 3.0 17.5| 
| 2.0 0.0 1.0 3.6| 
| 2.0 0.0 2.0 76.7| 
| 2.0 0.0 3.0 46.4| 
| 3.0 0.0 1.0 56.0| 
| 3.0 0.0 2.0 50.0| 
| 3.0 0.0 3.0 5.2| 
| 4.0 1.0 1.0 88.5| 
| 4.0 1.0 2.0 91.1| 
| 4.0 1.0 3.0 58.2| 
| 5.0 1.0 1.0 22.2| 
| 5.0 1.0 2.0 19.1| 
| 5.0 1.0 3.0 11.9| 
| 6.0 1.0 1.0 74.0| 
| 6.0 1.0 2.0 13.7| 
| 6.0 1.0 3.0 88.8 |

| Salida del programa |
| ------------ |
| 910.37|
|0.17|
|quimica|
|maria  |

Otro aspecto importante es el formato de entrada de los datos, la primera línea de la
entrada se trata del número de registros que se deben leer. Las líneas de los registros
tienen un formato de tabla, el orden de las columnas es: nombre, género, materia ycalificación,  las columnas están separadas por un espacio. Se recomienda copiar  ypegar este ejemplo en la terminal para realizar pruebas.

#### Notas:
-  Prestar especial cuidado a las notaciones de los rangos.
-  Se considera aprobado a una calificación igual o mayor a Regular.
-  Los  elementos  con  un  identificador  menor  tienen  prioridad,  al  ejecutar  un proceso y este arroja varios posibles resultados, se debe imprimir el que tenga menor identificador.





