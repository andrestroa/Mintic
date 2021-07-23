# RETO 3

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

El  programa  debe  mostrar  por  pantalla  el  número  del  departamento  con  la  menor
cantidad total de nuevas antenas instaladas independientemente del tipo, seguido de su
valor. Luego, en una nueva línea se debe mostrar el número del departamento con la
mayor  cantidad  total  de  nuevas  antenas  instaladas  independientemente  del  tipo,
seguido  de  su  valor.  Finalmente,  para  cada  uno  de  los  departamentos  (en  orden
ascendente  por  número y en líneas distintas)  se debe  mostrar  se debe  mostrar  su
número seguido de la proporción porcentual de nuevas antenas instaladas del tipo “a”
respecto al total de nuevas antenas instaladas en ese departamento, formateado a 2
cifras decimales y separado por espacio. Si un departamento no tiene ninguna antena
nueva instalada, la proporción porcentual antes mencionada debe ser de 0.00%.
Además, si hay más de un departamento con iguales cantidades mínimas o máximas,
se debe mostrar la que tenga menor número.

**Ejemplo 1**
**Entrada Esperada**
3 5
1 63000 24 c
3 617500 13 f
2 230200 0 b
1 577800 11 c
2 759600 21 a

**Salida Esperada**
3 0
2 45
1 0.00%
2 24.44%
3 0.00%

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
3 1
2 35
1 100.00%
2 28.57%
3 100.00%
4 0.00%
5 0.00%

**Nota**: Tenga en cuenta que múltiples valores de entrada pueden estar en una misma
línea.
**Nota**: Por favor NO incluya mensajes en los inputs.
**Nota**: Las tildes y cualquier otro signo ortográfico han sido omitidos a propósito en las
entradas  y  salidas  del  programa. Por  favor  NO  use  ningún  signo  dentro  del
desarrollo de su solución ya que estos pueden representar errores en la calificación
automática de Codegrade.
**Nota**: El archivo debe llamarse  reto3.py, de lo contrario no podrá ser cargado en la
plataforma de Codegrade.