import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int elements;
        int codes[] = new int[10];
        int quantity[] = new int[10];
        int minQuantity[] = new int[10];
        ArrayList<Integer> minValues = new ArrayList<Integer>();
        int maxValues[] = new int[3];
        int lowestProducts[] = new int[3];
        lowestProducts[0] = 100000000;

        //Recibe la cantidad de elementos a verificar
        System.out.println("Ingrese la cantidad de productos a verificar");
        elements = Integer.valueOf(lectura.nextLine());

        System.out.println("Ingrese el código de cada producto,"); 
        System.out.println("luego la cantidad que hay en bodega y por ultimo la cantidad que el cliente necesita ");
        
        //Recibe los calores de código, catidad total y cantidad requerida
        for (int producto = 0; producto < elements; producto++){            
            System.out.println("Ingrese el código del producto " + (producto+1));
            codes[producto] = Integer.valueOf(lectura.nextLine());
            System.out.println("Ingrese la cantidad en bodega del producto " + (producto+1));
            quantity[producto] = Integer.valueOf(lectura.nextLine());
            System.out.println("Ingrese la cantidad que necesita el cliente del producto " + (producto+1));
            minQuantity[producto] = Integer.valueOf(lectura.nextLine());
        }
        //Verifica si los valores de bodega son menores a la cantidad que se necita
        for (int amount = 0; amount < elements;amount++){
            if (quantity[amount] < minQuantity[amount]){
                minValues.add(codes[amount]);                
                }
            }
        //Verifica el valor maximo
        for (int amount_2 = 0; amount_2 < elements; amount_2++) {
            if (quantity[amount_2] > maxValues[0]){
                maxValues[0] = quantity[amount_2];
                maxValues[1] = codes[amount_2];
                }
            }
        //Varifica el menor valor
        for (int amount_3 = 0; amount_3 < elements;amount_3++) {
            if (quantity[amount_3] < lowestProducts[0]){
                lowestProducts[0] = quantity[amount_3];
                lowestProducts[1] = codes[amount_3];
                }
            }
        //Imprime los valores
        for (int code = 0; code < minValues.size(); code++) {
            System.out.println(minValues.get(code));}

        System.out.println("Código con mayor número de unidades " + maxValues[1] );
        System.out.println("Código con menor número de unidades " + lowestProducts[1] );
    }
}
