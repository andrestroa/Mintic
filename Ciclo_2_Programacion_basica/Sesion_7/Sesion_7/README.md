# Sesión # 7: Componente Práctico

Implementar una clase llamada Producto, la cual tenga los siguientes atributos y métodos:

**Atributos:**
- Código
- Precio de compra
- Precio de venta
- Cantidad en bodega
- Cantidad mínima requerida en bodega.
- Cantidad máxima de inventario permitida.
- Porcentaje de Descuento.

**Métodos:**
- Solicitar pedido: devuelva true si debe solicitar el producto al proveedor y false en caso contrario.
- Calcular total a pagar : devuelva la cantidad total a pagar al proveedor dado una cantidad de unidades de compra.


**Diseñar un programa que:**

- Consulte el número de productos a manejar.
- Cree una vector de productos en el cual se guardarán las instancias de cada uno de ellos.
- Solicite por consola el código, el precio de compra, el precio de venta, la cantidad en bodega, la cantidad mínima requerida y la cantidad máxima de inventario permitida para cada uno de los productos a manejar.
- Recorra el vector de productos y arroje una alerta en caso tal se deba solicitar el pedido al proveedor.
- Indique cuál es el código del producto que tiene mayor cantidad de unidades en bodega, si hay varios que cumplen con la condición, indicar el primero de ellos.
- Leer un código de producto y una cantidad de unidades de compra, indicar el total a pagar por ese pedido. Para ello utilice el método creado en la clase Producto pasando por parámetro la cantidad de unidades de compra.
- Cambiar la cantidad mínima requerida en bodega de un producto (leer código de producto), validar en el método set de la variable correspondiente que la nueva cantidad no sea menor a 0, en caso de serlo establecer la cantidad mínima como 0.

**Para tener en cuenta: el porcentaje de descuento es el mismo para todos los productos, y es del 1%.**

