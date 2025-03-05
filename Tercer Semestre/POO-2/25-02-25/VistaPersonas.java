import java.util.Scanner;

public class VistaPersonas{

    Persona persona;
    ControlPersonas controlPersonas;

    public VistaPersonas(){
        persona = new Persona();
        controlPersonas = new ControlPersonas();
    }

    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        VistaPersonas vista = new VistaPersonas();
        vista.menu(stdin);
    }

    public void menu(Scanner stdin){
        System.out.println("\n Menu\n" +
                "1._ Agregar.\n" +
                "2._ Listar.\n" + 
                "3._ Editar.\n" + 
                "4._ Eliminar\n" +
                "5._ Buscar\n" +
                "6._ Contar\n" +
                "7._ Salir.");
        System.out.print("Ingresar la opcion: ");
        byte opcion = stdin.nextByte();
    }

    public void agregarPersonas(){
        controlPersonas.agregarPersonas(persona);
    }

    public void listarPersonas(){

        for(Persona persona : controlPersonas.listarPersonas()){
            
        }
    }

    public void editarPersonas(){
        controlPersonas.modificarPersona(id, persona);
    }

    public void eliminarPersonas(){

    }

    public void buscarPersona(){

    }

    public void contarPersonas(){

    }
}
