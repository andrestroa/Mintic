import java.util.Scanner;
public class Ejercicio_3 {
    public static void main(String[] args) throws Exception {
        /*Ejercicio de condiciones múltiples , ejemplo hipotetico de verificación de unidades en bodega y 
        *Unidades a vender, se indicaran cuantas unidades hacen falta vender y una alerta si solo hay 10 o menos
        *En bódega
        */
        Scanner read = new Scanner(System.in);
        System.out.println("Ejercicio de condiciones múltiples ");
        System.out.println("Ingrese la cantidad de unidades en la bodega: ");        
        int totalQuantity = read.nextInt();
        System.out.println("Ingrese la cantidad de unidades que necesita: ");
        int minQuantity = read.nextInt();
        
        if (totalQuantity >= minQuantity){
            if (totalQuantity - minQuantity <= 10){
                System.out.println("No hay necesidad de comunicarse con el proveedor pero quedan solamente " + 
                (totalQuantity - minQuantity) + " Unidades disponibles");
            } else {
                System.out.println("No hay necesidad de comunicarse con el proveedor y quedan " + 
                (totalQuantity - minQuantity) + " Unidades por vender");
            }
        }
        else{
            System.out.println("Tiene que comunicarse con el proveedor, no hay tantas unidades");
        }
    }
}