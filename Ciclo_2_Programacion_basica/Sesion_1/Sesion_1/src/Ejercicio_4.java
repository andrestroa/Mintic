import java.util.Scanner;
public class Ejercicio_4 {
    public static void main(String[] args) throws Exception {
        /*Ejercicio estructura condicional anidado , ejemplo hipotetico de verificación de unidades en bodega y 
        *Unidades a vender, se indicaran cuantas unidades hacen falta vender y una alerta si solo hay 10 o menos
        *En bódega, además se indicara cuantas si es posible comprar más o no
        */
        Scanner read = new Scanner(System.in);
        System.out.println("Ejercicio estructura condicional anidado");
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
            System.out.println("Tiene que comunicarse con el proveedor hacen falta " + (totalQuantity - minQuantity) + 
            " en bodega");
            System.out.println("Ingrese el dinero disponible para compra");
            int moneyAvailable = read.nextInt();
            if (moneyAvailable <= (((totalQuantity - minQuantity)*-1)* 3350)){
                System.out.println("No se puede hacer la compra de " + ((totalQuantity - minQuantity) * -1) + " porque la compra cuesta" + 
                ((totalQuantity - minQuantity)* 3350 * -1) + "  pesos colombianos" );
            }else{
                System.out.println("Podemos hacer la compra de " + (totalQuantity - minQuantity) + " unidades por un valor de " + 
                (((totalQuantity - minQuantity)*-1)* 3350) + " pesos colombianos");
            }
            
        }
    }
}
