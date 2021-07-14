import java.util.Scanner;
public class Ejercicio_6 {
    /*Ejercicio estructura cíclica (For), ingrese la cantidad de productos que compro y su cantidad, para
    * Que le indiquen el precio
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ejercicio estructura cíclica (For)");

        int[] price = new int[10];
        price[1] = 2450;
        price[2] = 6540;
        price[3] = 1050;
        price[4] = 5000;
        price[5] = 9500;
        price[6] = 19222;
        price[7] = 99999;

        int[] userProducts = new int[10];
        int totalUserValue = 0;

        System.out.println("Ingrese la cantidad de productos que compro (Maximo 10 productos) :");
        int quantityOfProducts = leer.nextInt();

        for (int quantity = 1; quantity <=quantityOfProducts; quantity++) {
            System.out.println("Ingrese la cantidad de productos del tipo " + (quantity));
            userProducts[quantity] = leer.nextInt();
            totalUserValue += userProducts[quantity] * price[quantity];
        }
        System.out.println("El valor de su compra es de " + (totalUserValue));       
        
    }
}
