import java.util.Scanner;
public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        /*Variables donde se van a guardar los datos del usuario, códigos, productos en bódega y productos
        necesario a vender, se crearon variables adicionales para cambiar la información ingresada*/
        
        //Alamacenamiento de datos
        int[] codes = new int[3];
        int[][] bodega = new int[4][3];
        int[][] minQuantity = new int[4][3];
        int productoCodigo1 = 0;
        int productoCodigo2 = 0;
        int productoCodigo3 = 0;
        //Cambio de tipo de datos
        String[] tempCodes = new String[4];
        String[] tempQuantity = new String[4];

        //Solicitud de códigos
        System.out.println("Ingrese los códigos separados por espacio ");
        String userCodes = String.valueOf(lectura.nextLine());
        tempCodes = userCodes.split(" ");
        for (int data = 0;data < 3;data++){
            codes[data]= Integer.parseInt(tempCodes[data]);
            }
        //Solicitud de productos en bodega
        for (int row = 0; row < 4; row++){
            System.out.println("Ingrese los productos en bodega de la sede " + (row+1) );
            String bodegaQuantity = String.valueOf(lectura.nextLine());
            tempQuantity = bodegaQuantity.split(" ");
            for (int column = 0;column < 3;column++){
                bodega[row][column] = Integer.parseInt(tempQuantity[column]);
            }
        }

        //Solicitud cantidades minimas
        for (int row_2 = 0; row_2 < 4; row_2++){
            System.out.println("Ingrese productos que se requieren de la sede " + (row_2+1) );
            String userQuantity = String.valueOf(lectura.nextLine());
            tempQuantity = userQuantity.split(" ");
            for (int column_2 = 0;column_2 < 3;column_2++){
                minQuantity[row_2][column_2] = Integer.parseInt(tempQuantity[column_2]);
            }
        }

        //Productos que hacen falta
        for (int bodegaRow = 0; bodegaRow < bodega.length; bodegaRow++){
            for (int bodegaColumn = 0; bodegaColumn < bodega[bodegaRow].length; bodegaColumn++){
                if (minQuantity[bodegaRow][bodegaColumn] > bodega[bodegaRow][bodegaColumn]){
                    System.out.println("Se debe solicitar producto " + codes[bodegaColumn] + " en sede " + (bodegaRow + 1));
                }
            }
        }
        //Promedio de productos
        for (int bodegaRow_1 = 0; bodegaRow_1 < bodega.length; bodegaRow_1++){
            for (int bodegaColumn_1 = 0; bodegaColumn_1 < bodega[bodegaColumn_1].length; bodegaColumn_1++){

                if(bodegaColumn_1 == 0){
                    productoCodigo1 += bodega[bodegaRow_1][bodegaColumn_1];
                }
                else if (bodegaColumn_1 == 1){
                    productoCodigo2 += bodega[bodegaRow_1][bodegaColumn_1];
                }
                else if (bodegaColumn_1 == 2){
                    productoCodigo3 += bodega[bodegaRow_1][bodegaColumn_1];
                }
            }
        }
        
        System.out.println("El promedio de productos del codigo " + codes[0] + " " + (productoCodigo1/4) );
        System.out.println("El promedio de productos del codigo " + codes[1] + " " + (productoCodigo2/4) );
        System.out.println("El promedio de productos del codigo " + codes[2] + " " + (productoCodigo3/4) );
    }
}

