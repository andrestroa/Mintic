# Sesión # 2: Componente Práctico

Una determinada empresa tiene tres listas de tamaño N, las cuales corresponden a:

1: El código del producto
2: La cantidad en bodega del producto.
3: La cantidad mínima requerida del producto.

Para el sistema de inventario es importante conocer si es necesario solicitar un determinado producto a su proveedor de acuerdo a la cantidad mínima requerida. Se requiere un algoritmo que:

●	Lea el número de productos.
●	Lea las 3 listas y almacene cada lista en un vector.
Una vez leídos los datos:
●	Indique los códigos de los productos de los cuales se deben realizar los pedidos.
●	Indique el código del producto con mayor y menor número de unidades en bodega.


## Ejemplos: 

Tamaño de las listas: 7

### Lista de códigos   

|Código 1   | Código 2  |Código 3  | Código 4  |Código 5   | Código 6  | Código 7  |
| ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ |
| 354 |256|127|390|35|562|236|

### Lista de cantidad en bodega 
|Cantidad 1   | Cantidad 2  |Cantidad 3  | Cantidad 4  |Cantidad 5   | Cantidad 6  | Cantidad 7  |
| ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ |
| 10 |150|56|24|36|90|15|

### Lista de cantidad mínima requerida

|MinQ 1   | MinQ 2  |MinQ 3  | MinQ 4  |MinQ 5   | MinQ 6  | MinQ 7  |
| ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ |
| 17 |34|60|56|32|16|5                |


Códigos de productos que son necesario pedir: 
- 354 
- 127 
- 390
- Código con mayor número unidades: 256
- Código con menor número  unidades: 354