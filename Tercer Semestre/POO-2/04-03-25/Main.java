import java.util.Date;

public class Main{

    Rol cargoDesarrollador = new Rol("C1", "Desarrollador", "Encargado del codigo de bajo nivel");
    Rol cargoAnalista= new Rol("C2", "Analista", "Encargado del modelos de alto nivel");

    public static void main(String[] args){
        Rol cargoDesarrollador = new Rol("C1", "Desarrollador", "Encargado del codigo de bajo nivel");
        Rol cargoAnalista= new Rol("C2", "Analista", "Encargado del modelos de alto nivel");


        Empleado empleado1 = new Empleado(1, "Yuli", "3236134568", "cra 2 #23-3",
                "fds@gmail.com",new Date(), cargoDesarrollador);
        Empleado empleado2 = new Empleado(2, "Pedro", "3236134552", "cra 5 #24-3",
                "fghf@gmail.com", new Date(), cargoDesarrollador);
        Empleado empleado3 = new Empleado(3, "Juan", "3236134545", "cra 9 #23-51",
                "jgk@gmail.com",new Date(), cargoAnalista);
        Empleado empleado4 = new Empleado(4, "Camilo", "3236534568", "cra 29 #23-93",
                "qwe@gmail.com",new Date(), cargoAnalista);
    }
}
