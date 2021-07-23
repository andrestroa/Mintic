# RETO 4

#### Nombre del reto: Ampliación de la Infraestructura de Telecomunicaciones en Zonas Rurales o de Difícil Acceso
#### Autor reto: Eduardo David Angulo Madrid
#### Descripción del reto con su respectiva solución:

En el año 2015, los líderes mundiales adoptaron un conjunto de objetivos globales para
erradicar la pobreza, proteger el planeta y asegurar la prosperidad para todos como
parte de una nueva agenda de desarrollo sostenible. Uno de estos objetivos es el de
industria,  innovación  e  infraestructura  y  una  de  sus  metas  busca  aumentar
significativamente el acceso a la tecnología de la información y las comunicaciones y
esforzarse  por  proporcionar  acceso  universal  y  asequible  a  Internet  en  los  países
menos adelantados.
Debido a esto, el Ministerio de Tecnologías de la Información y las Comunicaciones
(MinTIC) desea que usted construya un sistema para determinar la cantidad a instalar
de nuevas antenas para la transmisión de información en múltiples zonas rurales o de
difícil acceso en varios departamentos, en pos del mejoramiento de la calidad de vida
de los ciudadanos.
Para ello, el sistema debe recibir como entrada la cantidad de departamentos (n) a
tratar, numerados de 1 a n, seguido de la cantidad de terrenos que se analizarán para
calcular la cantidad de nuevas antenas a instalar (m), si la cantidad de departamentos
es menor a 1 se debe leer nuevamente ambos valores hasta que se ingrese un n válido.
Luego, para los m terrenos a analizar se debe leer el número del departamento donde
se encuentra el terreno, seguido del área del mismo en m
, la cantidad de antenas
previamente  instaladas  y  el  tipo  de  las  nuevas  antenas.  La  cantidad  de  antenas
previamente instaladas debe ser un número entero mayor o igual a 0 y si este valor no
es válido, se debe volver a leer los 4 datos previamente mencionados hasta que la
cantidad de antenas previamente instaladas sea válida. 

Las antenas previamente instaladas tienen un rango de alcance  de 18400 m2 y las nuevas antenas a instalar tienen un rango de 35600 m2  y 7400 m2, 6800 m2, 59300 m2
, 24200 m2 y 7400 m2 para los tipos “a”, “b”, “c”, “d” y “e” respectivamente.

Adicionalmente, si no se encuentra el departamento donde se encuentra el terreno o el
tipo de las nuevas antenas no está entre los antes mencionados, no se debe calcular la
cantidad de nuevas antenas a instalar. Luego, se debe calcular la cantidad de nuevas
antenas a instalar del tipo deseado en el departamento seleccionado. Si esta cantidad
es negativa, se toma la cantidad a instalar como 0.
El programa debe mostrar por pantalla para cada uno de los departamentos:
-  El número del departamento.
-  La cantidad total de antenas instaladas en el departamento.
-  El  tipo de  nueva  antena  con  menor  cantidad  instalada,  seguido  de  su valor
- correspondiente.
-  El  tipo  de  nueva  antena  con  mayor  cantidad  instalada,  seguido  de  su  valor correspondiente.

Si hay más de un tipo de nueva antena con iguales cantidades mínimas o máximas
instaladas, se debe mostrar la primera de manera alfabética.
Finalmente, para cada tipo de antena se debe mostrar:
-  El número del departamento con menor cantidad de antenas instaladas del tipo
   correspondiente, seguido del tipo de la nueva antena y el valor de las nuevas
   antenas instaladas de ese tipo.
- El número del departamento con mayor cantidad de antenas instaladas del tipo
   correspondiente, seguido del tipo de la nueva antena y el valor de las nuevas
   antenas instaladas de ese tipo.
Si hay más de un departamento con iguales cantidades mínimas o máximas de la
cantidad de antenas instaladas del tipo correspondiente, se debe mostrar la que
tenga menor número.

**Ejemplo 1**
**Entrada Esperada**
3 5
1 63000 24 c
3 617500 13 f
2 230200 0 b
1 577800 11 c
2 759600 21 a
**Salida Esperada**
1
7
a 0
c 7
2
45
c 0
b 34
3
0
a 0
a 0
1 a 0
2 a 11
1 b 0
2 b 34
2 c 0
1 c 7
1 d 0
1 d 0
1 e 0
1 e 0
**Ejemplo 2
Entrada Esperada**
5 8
3 554800 29 a
5 690500 24 d
4 510000 29 b
4 373600 8 c
2 753000 23 a
2 966200 20 d
1 332400 4 a
2 32100 12 d
**Salida Esperada**
1
8
b 0
a 8
2
35
b 0
d 25
3
1
b 0
a 1
4
4
a 0
c 4
5
11
a 0
d 11
4 a 0
2 a 10
1 b 0
1 b 0
1 c 0
4 c 4
1 d 0
2 d 25
1 e 0
1 e 0
**Nota**: Tenga en cuenta que múltiples valores de entrada pueden estar en una mismalínea separados por espacios.
**Nota**: Por favor NO incluya mensajes en los inputs.
**Nota**: Las tildes y cualquier otro signo ortográfico han sido omitidos a propósito en las
entradas  y  salidas  del  programa. Por  favor  NO  use  ningún  signo  dentro  del
desarrollo de su solución ya que estos pueden representar errores en la calificación
automática de Codegrade.
**Nota**: El archivo debe llamarse  reto4.py, de lo contrario no podrá ser cargado en la
plataforma de Codegrade.
