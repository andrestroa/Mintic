import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        //ArrayList donde se van a almacenar los productos ingresados por el usuario
        ArrayList<Producto> listaDeProductos = new ArrayList<>();
        System.out.println("Ingresee cuantos productos va a verificar: ");
        int totalProductos = Sc.nextInt();

        for(int proUsuario = 0; proUsuario < totalProductos; proUsuario++){
            System.out.println("Ingrese el código del producto " + (proUsuario+1) + ": ");
            int codigo = Sc.nextInt();
            System.out.println("Ingrese el precio del producto " + (proUsuario+1) + ": ");
            int precioDeProducto = Sc.nextInt();
            System.out.println("Ingrese la cantidad en bodega del producto " + (proUsuario+1) + ": ");
            int cantidadEnBodega = Sc.nextInt();
            System.out.println("Ingrese la cantidad del producto " + (proUsuario+1) +" que se requieren");
            int cantidadRequerida = Sc.nextInt();
            
            Producto producto = new Producto(codigo, precioDeProducto, cantidadEnBodega, cantidadRequerida);
            listaDeProductos.add(producto);
        }
        for(int productoEnLsita = 0;productoEnLsita < listaDeProductos.size(); productoEnLsita++){
            if (listaDeProductos.get(productoEnLsita).solicitarPedido()){
                System.out.println("Es necesario solicitar unidades del producto " + listaDeProductos.get(productoEnLsita).getCodigo() );
            }
            else{
                System.out.println("No es necesario solicitar unidades del producto " + listaDeProductos.get(productoEnLsita).getCodigo() );
            }
        }

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
}