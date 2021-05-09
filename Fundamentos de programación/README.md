# RETO 1

En el año 2015, los líderes mundiales adoptaron un conjunto de objetivos globales para erradicar la pobreza, proteger el planeta y asegurar la prosperidad para todos como parte de una nueva agenda de desarrollo sostenible. Uno de estos objetivos es el de industria, innovación e infraestructura y una de sus metas busca aumentar significativamente el acceso a la tecnología de la información y las comunicaciones y esforzarse por proporcionar acceso universal y asequible a Internet en los países menos adelantados.

Debido a esto, el Ministerio de Tecnologías de la Información y las Comunicaciones (MinTIC) desea que usted construya un sistema para determinar la cantidad a instalar de nuevas antenas para la transmisión de información en zonas rurales o de difícil acceso, en pos del mejoramiento de la calidad de vida de los ciudadanos.

Para ello, el sistema debe recibir como entrada el área de la zona en la que se desean instalar las nuevas antenas en m2, así como la cantidad de antenas previamente instaladas y el tipo de las nuevas antenas. Las antenas previamente instaladas tienen un rango de alcance de 18400 m2 y las nuevas antenas a instalar tienen un rango de 35600 m2, 6800 m2, 59300 m2, 24200 m2 y 7400 m2 para los tipos “a”, “b”, “c”, “d” y “e” respectivamente.

Finalmente se debe mostrar por pantalla, la cantidad de nuevas antenas necesarias para instalar. Si esta cantidad es negativa, se debe mostrar el valor 0.

Además, la cantidad de antenas previamente instaladas tiene que ser un número entero mayor o igual a 0 y el tipo de las nuevas antenas tiene que estar entre los antes mencionados, en caso contrario, mostrar por pantalla el mensaje “error en los datos”.

|  **Entrada Esperada** |**Salida Esperada**   |
| ------------ | ------------ |
| **984556.95** *7*   **c  **  |15   |
| **4231151.24** *26*  **e **   |  508 |
| **67921.33** *21*  **d **  |   0  |
| **182856.1** *-1*  **c **   |  error en los datos |




Nota: Ten en cuenta que cada variable debe ser manejada como una entrada diferente. A continuación, ejemplificamos cómo debes hacerlo y cómo no.



## No lo hagas así:
**var_1** = valor1 valor2 valor3



## Hazlo así:
**var_1** = valor1

**var_2** = valor2

**var_3** = valor3



**Nota:** *Las tildes y cualquier otro signo ortográfico han sido omitidos a propósito en las entradas y salidas del programa. Por favor NO use ningún signo dentro del desarrollo de su solución ya que estos pueden representar errores en la calificación automática de Codegrade.*
