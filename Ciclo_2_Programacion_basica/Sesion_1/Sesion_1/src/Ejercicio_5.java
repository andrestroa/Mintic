import java.util.Scanner;
public class Ejercicio_5 {
    public static void main(String[] args) {
        /*Ejercicio estructura dependiendo de o Según (switch), ingresa el dia de su comprar y su valor de compra
        *Para saber su descuento y su valor a pagar
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ejercicio estructura dependiendo de o Según (switch)");

        double[] descount = new double[10];
        descount[1] = 0.05;
        descount[2] = 0.03;
        descount[3] = 0.10;
        descount[4] = 0.04;
        descount[5] = 0.06;
        descount[6] = 0.02;
        descount[7] = 0.01;

        System.out.println("Ingrese el día en que realizo la compra (1-7): ");
        int userDay = leer.nextInt();
        int userValue = 0;

        
        switch (userDay){
            case 1:
                System.out.println("Ingrese el valor de la compra: ");
                userValue = leer.nextInt();
                System.out.println("Su compra tiene un descuento del " + (descount[userDay]) + " su compra ahora tiene un valor de " 
                + (userValue - (descount[userDay] * userValue)));
            case 2:
                System.out.println("Ingrese el valor de la compra: ");
                userValue = leer.nextInt();
                System.out.println("Su compra tiene un descuento del " + (descount[userDay]) + " su compra ahora tiene un valor de " 
                + (userValue - (descount[userDay] * userValue)));
            case 3:
                System.out.println("Ingrese el valor de la compra: ");
                userValue = leer.nextInt();
                System.out.println("Su compra tiene un descuento del " + (descount[userDay]) + " su compra ahora tiene un valor de " 
                + (userValue - (descount[userDay] * userValue)));
            case 4:
                System.out.println("Ingrese el valor de la compra: ");
                userValue = leer.nextInt();
                System.out.println("Su compra tiene un descuento del " + (descount[userDay]) + " su compra ahora tiene un valor de " 
                + (userValue - (descount[userDay] * userValue)));
            case 5:
                System.out.println("Ingrese el valor de la compra: ");
                userValue = leer.nextInt();
                System.out.println("Su compra tiene un descuento del " + (descount[userDay]) + " su compra ahora tiene un valor de " 
                + (userValue - (descount[userDay] * userValue)));
            case 7:
                System.out.println("Ingrese el valor de la compra: ");
                userValue = leer.nextInt();
                System.out.println("Su compra tiene un descuento del " + (descount[userDay]) + " su compra ahora tiene un valor de " 
                + (userValue - (descount[userDay] * userValue)));
        }

    }
}
