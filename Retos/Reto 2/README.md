# RETO 2


#### Nombre del reto: Ampliación de la Infraestructura de Telecomunicaciones en Zonas Rurales o de Difícil Acceso
#### Autor reto: Eduardo David Angulo Madrid
#### Descripción del reto con su respectiva solución:

En el año 2015, los líderes mundiales adoptaron un conjunto de objetivos globales para erradicar la pobreza, proteger el planeta y asegurar la prosperidad para todos como parte de una nueva agenda de desarrollo sostenible. Uno de estos objetivos es el de industria, innovación e infraestructura y una de sus metas busca aumentar significativamente el acceso a la tecnología de la información y las comunicaciones y esforzarse por proporcionar acceso universal y asequible a Internet en los países menos adelantados.
Debido a esto, el Ministerio de Tecnologías de la Información y las Comunicaciones (MinTIC) desea que usted construya un sistema para determinar la cantidad a instalar de nuevas antenas para la transmisión de información en múltiples zonas rurales o de difícil acceso, en pos del mejoramiento de la calidad de vida de los ciudadanos.
Para ello, el sistema debe recibir como entrada un número mayor o igual a 0 de zonas a analizar. Posteriormente, por cada zona se debe leer el área en la que se desean instalar las nuevas antenas en m2, así como la cantidad de antenas previamente instaladas y el tipo de las nuevas antenas. Luego, se debe calcular la cantidad de antenas a instalar del tipo deseado, si esta cantidad es negativa, se toma la cantidad a instalar como 0. 
Además, la cantidad de antenas previamente instaladas tiene que ser un número entero mayor o igual a 0 y el tipo de las nuevas antenas tiene que estar entre los antes mencionados, en caso contrario la cantidad de antenas a instalar se toma como 0.
Las antenas previamente instaladas tienen un rango de alcance de 18400 m2 y las nuevas antenas a instalar tienen un rango de 35600 m2, 6800 m2, 59300 m2, 24200 m2 y 7400 m2 para los tipos “a”, “b”, “c”, “d” y “e” respectivamente.
Finalmente se debe mostrar por pantalla, la cantidad total de nuevas antenas instaladas independientemente del tipo. Luego, para cada uno de los tipos de nuevas antenas, en líneas distintas, se debe mostrar su nombre seguido de su proporción porcentual correspondiente respecto al total de nuevas antenas instaladas, formateado 2 cifras decimales y separado por espacio. Si no se instalan nuevas antenas todas las proporciones porcentuales antes mencionadas deben ser 0.00%.


| Entrada Esperada   |  Salida Esperada |
| ------------ | ------------ |
| 4  |523 |
|  984556.95 7 c   |a 0.00% |
| 4231151.24 26 e    | b 0.00%  |
| 67921.33 21 d   | c 2.87%|
| 182856.1 -1 c     | d 0.00%  |
||e 97.13% |

|  Entrada Esperada    | Salida Esperada   |
| ------------ | ------------ |
| 0 | 0 |
|   | a 0.00%   |
|   |  b 0.00%  |
|   |  c .00%  |
||d .00% |
||e .00% |


**Nota**: Ten en cuenta que cada variable debe ser manejada como una entrada diferente.
A continuación, ejemplificamos cómo debes hacerlo y cómo no.
- No lo hagas así:
var_1 = valor1 valor2 valor3
- Hazlo así:
  var_1 = valor1
  var_2 = valor2
  var_3 = valor3
  
**Nota**: Por favor NO incluya mensajes en los inputs.

**Nota**: Las tildes y cualquier otro signo ortográfico han sido omitidos a propósito en las entradas y salidas del programa. Por favor NO use ningún signo dentro del desarrollo de su solución ya que estos pueden representar errores en la calificación automática de Codegrade.

**Nota**: El archivo debe llamarse reto2.py, de lo contrario no podrá ser cargado en la plataforma de Codegrade.

