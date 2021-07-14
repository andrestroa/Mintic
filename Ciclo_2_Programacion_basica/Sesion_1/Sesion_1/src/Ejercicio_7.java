import java.util.Scanner;
public class Ejercicio_7 {
    /*Ejercicio de integración estructuras condicionales y cíclicas (while if-else) (for if-else)
    * Indica el valor de sus productos y el total de ventas de la empresa
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ejercicio de integración estructuras condicionales y cíclicas (while if-else) (for if-else)");

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

        

        Boolean servingUser = false;
        int client = 1;
        int userDecision = 0;
        int totalSells = 0;

        while (servingUser != true) {
            System.out.println("Cliente número " + client);
            System.out.println("Ingrese la cantidad de productos que compro (Maximo 10 productos) :");
            int quantityOfProducts = leer.nextInt();            

            for (int quantity = 1; quantity <=quantityOfProducts; quantity++) {
                System.out.println("Ingrese la cantidad de productos del tipo " + (quantity));
                userProducts[quantity] = leer.nextInt();
                totalUserValue += userProducts[quantity] * price[quantity];
                totalSells += userProducts[quantity] * price[quantity];
            }
            System.out.println("El valor de su compra es de " + (totalUserValue));
            client++;
            totalUserValue = 0;

            System.out.println("Hay más clientes por atender: ");
            System.out.println("1. SI ");
            System.out.println("2: No ");
            userDecision = leer.nextInt();
            if (userDecision == 2){
                servingUser = true;
                System.out.println("Gracias por su compras");
            }
        }
        System.out.println("El total de ventas de la empresa fue de "  + (totalSells));
    }
}