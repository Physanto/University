import java.util.Scanner;
import java.util.Arrays;

public class AgainArrays{

    static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args){

        final byte row = 4;
        final byte column = 4;
        String[][] students = new String[row][column];
        //String[][] students = {
        //    {"9", "es", "ma", "4.5"},
        //    {"3", "pe", "ne", "2.5"},
        //    {"4", "nu", "mo", "1.0"},
        //    {"1", "e", "fd", "3.6"}
        //};
        
        System.out.println("Ingresar datos al array\n");
        inputData(students);
        showStudents(students);

        System.out.println("\nEste es el promedio de los estudiantes " + promedyStudents(students));

        System.out.println(Arrays.toString(searchStudent(students)));

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

    //public static String[] copyArrays(String[][] students){
    //    String[] student = new String[4];
    //
    //    for(int i = 0; i < students.length; i++) {
    //        student = students[i];
    //    }
    //
    //    for(int j = 0; j < 4; j++){
    //        System.out.println(student[j]);
    //    }
    //    return student; 
    //}

    //public static void sortStudents(String[][] students){
    //
    //    String[] code =;
    //
    //    for(int i = 0; i < students.length; i++) {
    //       for(int j = i + 1; j < students[i].length - 1; j++){
    //
    //        if(Float.parseFloat(students[i][0]) > Float.parseFloat(code[j][0])){
    //            String[] aux = students[i];
    //            students[i] = code[j];
    //            students[i] = aux;
    //        }
    //       }
    //    }
    //}

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

    public static String[] searchStudent(String[][] students){
        int j = 0;

        System.out.println("Ingrese el codigo del estudiante a buscar: ");
        String search = stdin.nextLine();

        for(int i = 0; i < students.length; i++) {
                
            if(students[i][j].equals(search)){
                return students[i];
            }
        }
        return null;
    }
}
