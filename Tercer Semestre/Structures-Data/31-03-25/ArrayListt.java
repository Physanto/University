import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListt{
    static Scanner stdin = new Scanner(System.in);

    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args){
        menu();
    }

    public static void registerCourses(){
        System.out.print("Ingresa el nombre del curso que desea registrar: ");
        String data = stdin.nextLine();
        list.add(data);
    }

    public static void listCourses(){
        System.out.println("Materias registradas\n");
        for(String n: list){
            System.out.print(n + " ");
        }
        System.out.print("\n");
    }

    public static void removeList(){
        System.out.print("Ingresa el elemento que desea eliminar: ");
        String element = stdin.nextLine();
        boolean n = list.remove(element);
        if(n){
            System.out.println("Curso eliminado correctamente");
        }
        else{
            System.out.println("Curso no encontrado");
        }
    }

    public static void menu(){
        int option;
        do{
            System.out.println("MENU DE MATERIAS");
            System.out.println("1. Registrar materias");
            System.out.println("2. Listar materias");
            System.out.println("3. Eliminar materias");
            System.out.println("4. Salir");
            System.out.print("Ingresa una opcion: ");
            option = stdin.nextInt();
            stdin.nextLine();

            switch(option){
                case 1:
                    registerCourses();
                    break;

                case 2:
                    listCourses();
                    break;
                
                case 3:
                    removeList();
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Error en la opcion");
                    break;
            }
        }
        while(option != 4); 
    }
}
