import java.util.*;
import java.math.*;
import java.text.DecimalFormat;

public class reto1 {
    public static void main(String[] args) {
        //Inputs
        Scanner sc = new Scanner(System.in);
        //Formateo de impresión de decimales
        DecimalFormat frmt = new DecimalFormat();
		frmt.setMaximumFractionDigits(2);
        //Array de materias
        String[] subject = new String[4];

        subject[0] = "quimica";
        subject[1] = "idiomas";
        subject[2] = "historia";

        //Array de nombres de estudiantes
        String[] studentsNames = new String[7];

        studentsNames[1] = "armando";
        studentsNames[2] = "nicolas";
        studentsNames[3] = "daniel";
        studentsNames[4] = "maria";
        studentsNames[5] = "marcela";
        studentsNames[6] = "alexandra";

        //Array de generos de estudiantes
        String[] gender = new String[3];

        gender[1] = "m";
        gender[2] = "f";

        //Array de datos de estudiantes no se define porque no se sabe cuantos estudiantes son
        float [][] studentsData;

        //Solicitud de total de estudiantes
        System.out.println("Ingrese el total de los estudiantes ");
        int totalStudents = Integer.valueOf(sc.nextLine());

        //Se construye el array con base a la variable totalStudents 
        studentsData = new float[totalStudents][4];
        //Se construye un array donde guarda los elementos del estudiante temporalmente
        String[] students = new String[4];

        //Ciclo for que pregunta los datos de los estudiantes

        for (int row = 0;row < totalStudents;row++){
            System.out.println("Ingrese los datos del alumno separados por espacio ");
            String studentsTempData = String.valueOf(sc.nextLine());
            students = studentsTempData.split(" ");
            for (int column = 0;column < 4;column++){
                studentsData[row][column] = Float.parseFloat(students[column]);
            }
        }
        //Cierre del for

        //Verificación de media y varianza
        float varianza = 0;
        float media = 0;
        double percentageOfRegularExams = 0;

        //Saca la media y el porcentaje de examenes regulares
        for (int row = 0; row < studentsData.length; row++){
            for (int column = 0; column < studentsData[row].length;column++){
                if (column == 3){
                    media += studentsData[row][column];
                    if(studentsData[row][column]> 60 && studentsData[row][column] <=80){
                        percentageOfRegularExams++;
                    }
                }
            }
        }
        media /= totalStudents;
        percentageOfRegularExams =  (percentageOfRegularExams*100)/totalStudents;
        percentageOfRegularExams = Math.round(percentageOfRegularExams);
        percentageOfRegularExams /= 100;

        //Saca la varianza
        for (int row = 0; row < studentsData.length; row++){
            for (int column = 0; column < studentsData[row].length;column++){
                if (column == 3){
                    varianza += (Math.pow((studentsData[row][column]-media),2));

                }
            }
        }
        varianza /=totalStudents;

        //Verificar que materia tuvo la mayor nota
        int[] sumOfSuject = new int[3];
        int[] maxValue = new int[2];

        
        for (int row = 0; row < studentsData.length; row++){
            for (int column = 0; column < studentsData[row].length;column++){
                if (column == 3){
                    if (studentsData[row][2] == 1.0){
                        if (studentsData[row][column] >= 60.0){
                            sumOfSuject[0]++;
                        }
                    }else if (studentsData[row][2] == 2.0){
                        if (studentsData[row][column] >= 60.0){
                            sumOfSuject[1]++;
                        }                       
                    }else if(studentsData[row][2] == 3.0){
                        if (studentsData[row][column] >= 60.0){
                            sumOfSuject[2]++;
                        }                        
                    }
                }
            }
        }

        for (int value = 0; value < sumOfSuject.length; value++){
            if(sumOfSuject[value] > maxValue[1]){
                maxValue[0] = value;
                maxValue[1] = sumOfSuject[value];
            }
        }
        //Verifica cual es el estudiante con mejor promedio en quimica
        float[] bestStudentInfo = new float[2];

        
        for (int row = 0; row < studentsData.length; row++){
            for (int column = 0; column < studentsData[row].length;column++){
                if (column == 2){
                    if (studentsData[row][column] == 1.0){
                        if (studentsData[row][3] > bestStudentInfo[1]){
                            bestStudentInfo[0] = studentsData[row][0];
                            bestStudentInfo[1] = studentsData[row][3];
                        }
                    }
                }
            }
        }

        int bestStudent = (int) bestStudentInfo[0];
        //Imprime la varianza, materias regulares, la materia con el mayor puntaje y el mejor alumno  de quimica
        System.out.println(frmt.format(varianza));
        System.out.println(percentageOfRegularExams);
        System.out.println(subject[maxValue[0]]);
        System.out.println(studentsNames[bestStudent]);
    }
}
