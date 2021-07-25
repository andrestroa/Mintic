import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);

        //ArrayList donde se van a almacenar los productos ingresados por el usuario
        ArrayList<Producto> listaDeProductos = new ArrayList<>();
        System.out.println("Ingresee cuantos productos va a verificar: ");
        int totalProductos = Sc.nextInt();

        FuncionesDeProducto fdp = new FuncionesDeProducto();
        listaDeProductos = fdp.datosDeUsuario(totalProductos);
        FuncionesDeProducto.comunicacionProveedor(listaDeProductos);
        FuncionesDeProducto.productoMenorCantidad(listaDeProductos);
        FuncionesDeProducto.productoMayorCantidad(listaDeProductos);
        FuncionesDeProducto.totalProducto(listaDeProductos);
    }
}