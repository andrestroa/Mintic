import java.util.Scanner;
public class Ejercicio_1 {
    public static void main(String[] args) throws Exception {
        /*Ejercicio de condiciones simples, ejemplo hipotetico de verificación de unidades en bodega y unidades a vender
        */
        Scanner read = new Scanner(System.in);
        System.out.println("Ejercicio de condicion simple "); 
        System.out.println("Ingrese la cantidad de unidades en la bodega: ");        
        int totalQuantity = read.nextInt();
        System.out.println("Ingrese la cantidad de unidades que necesita: ");
        int minQuantity = read.nextInt();
        
        if (totalQuantity >= minQuantity){
            System.out.println("No hay necesidad de comunicarse con el proveedor");
        }
        if (totalQuantity <= minQuantity){
            System.out.println("Tiene que comunicarse con el proveedor, no hay tantas unidades");
        }
    }
}