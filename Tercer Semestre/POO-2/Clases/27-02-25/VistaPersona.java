import java.util.Scanner;

public class VistaPersona{
     
    private Scanner stdin;
    private ControlPersona controlPersona;
    private static VistaPersona vistaPersona = new VistaPersona();

    public VistaPersona(){ 
        stdin = new Scanner(System.in);
        controlPersona = new ControlPersona();
    }

    public static void main(String[] args) {
        vistaPersona.ingresarOpcion();
    }

    public void imprimirMenu(){
        System.out.println("""
                           \nMenu Principal
                           1. Agregar
                           2. Listar
                           3. Editar
                           4. Eliminar
                           5. Buscar
                           6. Contar
                           7. Mayor
                           8. Menor
                           9.Promedio edades
                           10. Salir""");
        System.out.print("Digite la opción que desea: ");
    }

    public void ingresarOpcion(){
        
        byte opcion;
        do{
            vistaPersona.imprimirMenu();
            opcion = stdin.nextByte();
            stdin.nextLine();

            switch (opcion) {

                case 1:
                    vistaPersona.agregarPersona();
                    break;

                case 2:
                    vistaPersona.listarPersonas();
                    break;

                case 3:
                    vistaPersona.modificarPersona();
                    break;
                
                case 4:
                    vistaPersona.eliminarPersona();
                    break;

                case 5:
                    vistaPersona.buscarPersonas();
                    break;

                case 6:
                    vistaPersona.contarPersonas();
                    break;
                
                case 7:
                    vistaPersona.mayorPersonas();
                    break;

                case 8:
                    vistaPersona.menorPersonas();
                    break;

                case 9:
                    vistaPersona.promedyEdades();
                    break;

                case 10:
                    System.out.println("Hasta luego!!!");
                    break;
                
                default:
                    System.out.println("Digite una opción válida");;
            }
        }
        while(opcion != 10);

    }
    
    public void agregarPersona(){
        System.out.print("Digite la cédula: ");
        int id = stdin.nextInt();
        stdin.nextLine();

        System.out.print("Digite el nombre: ");
        String nombre = stdin.nextLine();

        System.out.print("Digite la edad: ");
        int edad = stdin.nextInt(); 

        controlPersona.agregarPersona(new Persona(id, nombre, edad));
    }
    
    public void listarPersonas(){
        for(Persona persona: controlPersona.listarPersonas()){
            System.out.println(persona.toString());
        }
    }
    
    public void buscarPersonas(){
        System.out.print("Digite el número de cédula a buscar: ");
        int id = stdin.nextInt();
        stdin.nextLine();

        int posicion = controlPersona.buscarPersona(id);

        if(posicion != -1){ 
            System.out.println(controlPersona.listarPersonas().get(posicion).toString());
        }
        else{
            System.out.println("Persona no encontrada");
        }            
    }
    
    public void eliminarPersona(){

        System.out.print("Digite el número de cédula a eliminar: ");
        int id = stdin.nextInt();

        if(controlPersona.eliminarPersona(id)){
            System.out.println("Persona eliminada correctamente"); 
        }
        else{
            System.out.println("Persona no eliminada");
        }
    }

    public void contarPersonas() {
        System.out.println("El número de personas es: " + controlPersona.contarPersonas());
    }
    
    public void modificarPersona(){

        System.out.print("Digite el número de cédula a modificar: ");
        int id = stdin.nextInt();
        stdin.nextLine();

        System.out.print("Digite el nuevo nombre: ");
        String nombre = stdin.nextLine();

        System.out.print("Digite la edad: ");
        int edad = stdin.nextInt();

        if(controlPersona.modificarPersona(id, new Persona(id, nombre, edad))){
            System.out.println("Persona modificada correctamente"); 
        }
        else{
            System.out.println("Persona no modificada");
        }
    }   

    public void menorPersonas(){
        System.out.println(controlPersona.menorPersona().toString());
    }
    
    public void mayorPersonas(){
        System.out.println(controlPersona.mayorPersonas().toString());
    }

    public void promedyEdades(){
        System.out.println("El promedio es: " + controlPersona.promedyEdades());
    }
}
