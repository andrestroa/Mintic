import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Ingrese el código del producto ");
        int codigo = Sc.nextInt();
        System.out.println("Ingrese el precio del producto ");
        int precioDeProducto = Sc.nextInt();
        System.out.println("Ingrese la cantidad en bodega del producto ");
        int cantidadEnBodega = Sc.nextInt();
        System.out.println("Ingrese la cantidad del producto que se requieren ");
        int cantidadRequerida = Sc.nextInt();
        
        Producto producto = new Producto(codigo, precioDeProducto, cantidadEnBodega, cantidadRequerida);

        ;

        if (producto.solicitarPedido() == true) {
            System.out.println("Es necesario solicitar más productos al proveedor");
        } else {
            System.out.println("Hay productos disponibles, no es necesario comunicarse con el proveedor");
        }
    }
}