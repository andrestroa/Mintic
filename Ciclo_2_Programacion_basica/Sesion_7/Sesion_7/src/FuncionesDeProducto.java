import java.util.Scanner;
import java.util.ArrayList;


public class FuncionesDeProducto {
    //Solicita los datos del producto y bodega al usuario
    ArrayList<Producto> listaDeProductos = new ArrayList<>();
    Scanner Sc = new Scanner(System.in);

    public ArrayList<Producto> datosDeUsuario(int totalProductos){
        for(int proUsuario = 0; proUsuario < totalProductos; proUsuario++){
            System.out.println("Ingrese el código del producto " + (proUsuario+1) + ": ");
            int codigo = Sc.nextInt();
            System.out.println("Ingrese el precio de compra del producto " + (proUsuario+1) + ": ");
            int precioDeProducto = Sc.nextInt();
            System.out.println("Ingrese la cantidad en bodega del producto " + (proUsuario+1) + ": ");
            int cantidadEnBodega = Sc.nextInt();
            System.out.println("Ingrese la cantidad minima requeria del producto " + (proUsuario+1) +" en inventario");
            int cantidadRequerida = Sc.nextInt();
            System.out.println("Ingrese la cantidad maxima en bodega del producto " + (proUsuario+1) +" que se puede almacenar");
            int cantidadMaximaBodega = Sc.nextInt();
            
            Producto producto = new Producto(codigo, precioDeProducto, cantidadEnBodega, cantidadRequerida,cantidadMaximaBodega);
            listaDeProductos.add(producto);
        }
        return listaDeProductos;
    }   


    //Verifica si el producto hace falta o no e imprime un mensaje
    public static void comunicacionProveedor(ArrayList<Producto> listaDeProductos) {

        for(int productoEnLsita = 0;productoEnLsita < listaDeProductos.size(); productoEnLsita++){
            if (listaDeProductos.get(productoEnLsita).solicitarPedido()){
                System.out.println("Alerta, es necesario solicitar unidades del producto " + listaDeProductos.get(productoEnLsita).getCodigo() );
            }
            else{
                System.out.println("No es necesario solicitar unidades del producto " + listaDeProductos.get(productoEnLsita).getCodigo() );
            }
        }
    }

    //Varifica el producto con menor cantidad de unidades
    public static void productoMenorCantidad(ArrayList<Producto> listaDeProductos) {
        int[] valorMenor = new int[2];
        valorMenor[0] = 1000000000;

        for (int cantidades = 0; cantidades < listaDeProductos.size(); cantidades++){
            if (listaDeProductos.get(cantidades).getCantidadEnBodega() < valorMenor[0]){
                valorMenor[0] = listaDeProductos.get(cantidades).getCantidadEnBodega();
                valorMenor[1] = listaDeProductos.get(cantidades).getCodigo();              
            }
        }

        System.out.println("El producto con menor cantidad en bodega es el " + valorMenor[1] + 
                            "\ny la cantidad es " + valorMenor[0]);
    }
    //Varifica el producto con mayor cantidad de unidades
    public static void productoMayorCantidad(ArrayList<Producto> listaDeProductos) {
        int[] valorMayor = new int[2];
        valorMayor[0] = 0;

        for (int cantidades = 0; cantidades < listaDeProductos.size(); cantidades++){
            if (listaDeProductos.get(cantidades).getCantidadEnBodega() > valorMayor[0]){
                valorMayor[0] = listaDeProductos.get(cantidades).getCantidadEnBodega();
                valorMayor[1] = listaDeProductos.get(cantidades).getCodigo();              
            }
        }

        System.out.println("El producto con mayor cantidad en bodega es el " + valorMayor[1] + 
                            "\ny la cantidad es " + valorMayor[0]);
    }

    //Pide al usuario el código del producto a comprar y la cantidad a comprar e imprime el precio total y el precio total con descuento
    public static void totalProducto(ArrayList<Producto> listaDeProductos) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Ingrese el código sel producto que quiere comprar: ");
        int codigoCompraUsuario = Sc.nextInt();
        System.out.println("Ingrese las unidades que va a comprar ");
        int unidadesCompraUsuario = Sc.nextInt();

        for (int productoEnLsita = 0; productoEnLsita < listaDeProductos.size(); productoEnLsita++){
            int precioFinal = 0;
            if (listaDeProductos.get(productoEnLsita).getCodigo() == codigoCompraUsuario){
                precioFinal = (listaDeProductos.get(productoEnLsita).getPrecioDeCompra() * unidadesCompraUsuario);
                System.out.println("El total a pagar por ese producto es de " + precioFinal);
                System.out.println("Pero con descuento es de " + (precioFinal - (precioFinal * (listaDeProductos.get(productoEnLsita).getPorcentajeDescuento()))));
            }
        }
    }
}

