import java.util.Scanner;

public class MainTwo{
    
    static Scanner stdin = new Scanner(System.in);
    static ArrayListNames array = new ArrayListNames();

    public static void main(String[] args){
        menu();
    }

    public static void menu(){
        byte option = 0;
        
        do{
            System.out.println("\nMenu Para Hacer Lo Que Quieras\n" +
                "1._ Agregar Estudiante.\n" + 
                "2._ Listar Estudiantes.\n" + 
                "3._ Buscar Estudiante.\n" +
                "4._ Lista Numero de Estudiantes\n" + 
                "5._ Editar nombre estudiante.\n" +
                "6._ Eliminar Estudiante.\n" +
                "7._ Salir.");
            System.out.print("Ingresa una opcion: ");
            option = stdin.nextByte();
            stdin.nextLine();
            
            switch(option){
                
                case 1:
                    addStudent();
                    break;

                case 2:
                    listStudent();
                    break;

                case 3:
                    searchEstudent();
                    break;
                
                case 4:
                    listNumberStudents();
                    break;
                
                case 5:
                    editStudent();
                    break;
                    
                case 6:
                    deleteStudent();
                    break;

                case 7:
                    System.out.println("Adios...");
                    break;

                default:
                    System.out.println("Error.");
                    break;

            }
        }
        while(option != 7);
    }

    public static void addStudent(){
       System.out.println("Ingresa el nombre del estudiante: "); 
       String student = stdin.nextLine();
       array.addStudent(student);
    }

    public static void listStudent(){
        System.out.println(array.listStudents());
    }

    public static void searchEstudent(){
       System.out.println("Ingresa el estudiante que desea buscar: "); 
       String student = stdin.nextLine();
       System.out.println(array.searchEstudent(student));
    }

    public static void listNumberStudents(){
       System.out.print("numero de estudiantes " + array.numbersStudents()); 
    }

    public static void editStudent(){
        System.out.println("ingresa el estudiante a editar: ");
        String student = stdin.nextLine();

        System.out.println("ingresa cambiar al estudiante: ");
        String name = stdin.nextLine();
        array.editStudent(student, name);
    
        System.out.println("editado: ");
    }

    public static void deleteStudent(){
        System.out.println("ingresa el nombre: ");
        String index = stdin.nextLine();
        array.deleteStudent(index);
        System.out.println("eliminado: ");
    }
}
