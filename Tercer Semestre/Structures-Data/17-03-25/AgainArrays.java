import java.util.Scanner;

public class AgainArrays{

    static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args){

        final byte row = 4;
        final byte column = 4;
        String[][] students = new String[row][column];

        System.out.println("Ingresar datos al array\n");
        inputData(students);
        showStudents(students);

        System.out.println("\nEste es el promedio de los estudiantes " + promedyStudents(students));

        showStudents(students);
    }


    public static void inputData(String[][] students){

        for(int i = 0; i < students.length; i++){
            System.out.println("Estudiante " + (i + 1) + ": ");
            for (int j = 0; j < students[i].length; j++) {

                System.out.print(message(j));
                students[i][j] = stdin.nextLine();   
            } 
        }
    }

    public static String message(int index){
        
        switch(index){
            
            case 0: return "Ingresa el codigo del estudiante: ";

            case 1: return "Ingresa el apellido del estudiante: ";

            case 2: return "Ingresa el nombre del estudiante: ";

            case 3: return "Ingresa la nota del estudiante ";
        }

        return "";
    }

    public static void showStudents(String[][] students){
        System.out.println("CODIGO\t APELLIDO\t NOMBRE\t NOTA");

        for (int i = 0; i < students.length; i++) {
            System.out.println("");
            for (int j = 0; j < students[i].length; j++) {
                System.out.print(students[i][j] + "\t");
            } 
        }
    }

    public static float promedyStudents(String[][] students){
        
        float promedy = 0;

        for(int i = 0; i < students.length; i++) {

            promedy += Float.parseFloat(students[i][3]);
        }
        return promedy /= (students.length);
    }
}
