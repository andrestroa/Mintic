# RETO 5

#### Nombre del reto: Ampliación de la Infraestructura de Telecomunicaciones en Zonas Rurales o de Difícil Acceso
#### Autor reto: Eduardo David Angulo Madrid
#### Descripción del reto con su respectiva solución:

En el año 2015, los líderes mundiales adoptaron un conjunto de objetivos globales para erradicar la pobreza, proteger el planeta y asegurar la prosperidad para todos como parte de una nueva agenda de desarrollo sostenible. Uno de estos objetivos es el de industria, innovación e infraestructura y una de sus metas busca aumentar significativamente el acceso a la tecnología de la información y las comunicaciones y esforzarse por proporcionar acceso universal y asequible a Internet en los países menos adelantados.
Debido a esto, el Ministerio de Tecnologías de la Información y las Comunicaciones (MinTIC) desea que usted construya un sistema para determinar la cantidad a instalar de nuevas antenas para la transmisión de información en múltiples zonas rurales o de difícil acceso en varios departamentos, en pos del mejoramiento de la calidad de vida de los ciudadanos.
Para ello, el sistema debe leer la información del archivo data.csv, que contiene los siguientes campos / columnas:
•	id_department: El número identificador del departamento (entre 1 y 32).
•	department_name: El nombre del departamento donde se encuentra el terreno.
•	terrain_area: El área del terreno en el que se quieren instalar las nuevas antenas en m2.
•	old_antenna: La cantidad de antenas previamente instaladas (mayor o igual a 0).
•	new_antenna_type: El tipo de las nuevas antenas que se desean instalar (tipos ‘a’, ‘b’, ‘c’, ‘d’ o ‘e’).
Las antenas previamente instaladas tienen un rango de alcance de 18400 m2 y las nuevas antenas a instalar tienen un rango de 35600 m2, 6800 m2, 59300 m2, 24200 m2 y 7400 m2 para los tipos “a”, “b”, “c”, “d” y “e” respectivamente.
Si la cantidad de nuevas antenas a instalar es negativa, se toma la esta cantidad como 0.
Adicionalmente, se debe recibir como entrada varios números identificadores de distintos departamentos.

El programa debe mostrar por pantalla para cada uno de los departamentos leídos previamente, en orden ascendente, la siguiente información haciendo uso de los datos del archivo data.csv:
•	El número identificador del departamento y el nombre del departamento.
•	La cadena ‘terrain area’.

•	La cadena ‘mean’, seguido de la media (promedio) del área de todos los terrenos en ese departamento, formateado a 2 cifras decimales.
•	La cadena ‘std’, seguido de la desviación estándar muestral del área de todos los terrenos en ese departamento, formateado a 2 cifras decimales.
•	La cadena ‘min’, seguido del área mínima de los terrenos en ese departamento, formateado a 2 cifras decimales.
•	La cadena ‘max’, seguido del área máxima de los terrenos en ese departamento, formateado a 2 cifras decimales.
•	La cadena ‘total’, seguido de la suma de las áreas de todos los terrenos en ese departamento, formateado a 2 cifras decimales.
•	La cadena ‘old antenna’.
•	La cadena ‘mean’, seguido de la media (promedio) de la cantidad de todas las antenas previamente instaladas en ese departamento, formateado a 2 cifras decimales.
•	La cadena ‘std’, seguido de la desviación estándar muestral de la cantidad de todas las antenas previamente instaladas en ese departamento, formateado a 2 cifras decimales.
•	La cadena ‘min’, seguido de la cantidad mínima de antenas previamente instaladas en ese departamento.
•	La cadena ‘max’, seguido de la cantidad máxima de antenas previamente instaladas en ese departamento.
•	La cadena ‘total’, seguido del total de antenas previamente instaladas en ese departamento.
•	La cadena ‘new antenna’.
•	La cadena ‘a’, seguido de la cantidad total de nuevas antenas instaladas de tipo ‘a’ en ese departamento.
•	La cadena ‘b’, seguido de la cantidad total de nuevas antenas instaladas de tipo ‘b’ en ese departamento.
•	La cadena ‘c’, seguido de la cantidad total de nuevas antenas instaladas de tipo ‘c’ en ese departamento.
•	La cadena ‘d’, seguido de la cantidad total de nuevas antenas instaladas de tipo ‘d’ en ese departamento.
•	La cadena ‘e’, seguido de la cantidad total de nuevas antenas instaladas de tipo ‘e’ en ese departamento.

**Ejemplo 1

Entrada Esperada**
1

**Salida Esperada**
1 Amazonas
terrain area
mean 1009781.01
std 575288.36
min 800.00
max 2000000.00
total 3168692800.00
old antenna
mean 14.95
std 9.04
min 0
max 30
total 46899
new antenna
a 14755
b 67290
c 8526
d 20211
e 59673


**Ejemplo 2**

**Entrada Esperada**

5 1 3

Salida Esperada
1 Amazonas
terrain area
mean 1009781.01
std 575288.36
min 800.00
max 2000000.00
total 3168692800.00
old antenna
mean 14.95
std 9.04
min 0
max 30
total 46899
new antenna
a 14755
b 67290
c 8526
d 20211
e 59673
3 Arauca
terrain area
mean 986232.47
std 583877.11
min 400.00
max 1999600.00
total 3049430800.00
old antenna
mean 15.12
std 9.00
min 0
max 30
total 46760
new antenna
a 13896
b 68308
c 7522
d 18645
e 61396
5 Bolivar
terrain area
mean 995445.83
std 581245.66
min 200.00
max 1998800.00
total 3162531400.00
old antenna
mean 15.11
std 8.99
min 0
max 30
total 47990
new antenna
a 14675
b 67261
c 7991
d 19568
e 63525

**Nota**: Tenga en cuenta que múltiples valores de entrada pueden estar en una misma línea separados por espacios.

**Nota**: Por favor NO incluya mensajes en los inputs.

**Nota**: Las tildes y cualquier otro signo ortográfico han sido omitidos a propósito en las entradas y salidas del programa. Por favor NO use ningún signo dentro del desarrollo de su solución ya que estos pueden representar errores en la calificación automática de Codegrade.

**Nota**: El archivo debe llamarse reto5.py, de lo contrario no podrá ser cargado en la plataforma de Codegrade.

**Nota**: El archivo data.csv debe encontrarse en la misma carpeta donde se encuentra el archivo reto5.py y debe leerse usando la ruta relativa del mismo.

