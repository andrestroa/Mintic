import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        boolean userDecision = false;

        while (userDecision != true) {
            System.out.println("************************************************************************************");
            System.out.println("Bienvenido a los ejercicios de Java del ciclo 2 Mintic, sesión 1,puedes escoger");
            System.out.println("entre 7 diferentes ejercicios, cual desea ver?: ");
            for(int ejercicio = 1; ejercicio <= 7; ejercicio++){
                System.out.println("Ejercicio " + ejercicio);
            }
            System.out.println("Salir del programa 0");
            System.out.println("*****************************************************************************************");
            int exercise = leer.nextInt();
            switch(exercise){
                case 1:
                    Ejercicio_1.main(args);
                    break;
                case 2:
                    Ejercicio_2.main(args);
                    break;
                case 3:
                    Ejercicio_3.main(args);
                    break;
                case 4:
                    Ejercicio_4.main(args);
                    break;
                case 5:
                    Ejercicio_5.main(args);
                    break;
                case 6:
                    Ejercicio_6.main(args);
                    break;
                case 7:
                    Ejercicio_7.main(args);
                    break;
                case 0:
                    userDecision = true;
                    System.out.println("Gracias por su atención");
                    break;

            }
                
        }
            
    }
        
}
    


