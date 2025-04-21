import java.util.Scanner;

public class Main {

    GestionElectrodomesticos gestion = new GestionElectrodomesticos();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        int opcion;

        do {
            System.out.println("1. Agregar electrodomestico");
            System.out.println("2. Eliminar electrodomestico");
            System.out.println("3. Buscar electrodomestico");
            System.out.println("4. Salir");
            System.out.println("Digite una opcion");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    main.agregar();
                    break;

                case 2:
                    main.eliminar();
                    break;

                case 3:
                    main.buscar();
                    break;

                case 4:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 4);
    }

    public void agregar() {
        System.out.println("Ingrese un serial");
        int serial = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese una marca");
        String marca = sc.nextLine();

        System.out.println("Ingrese un precio");
        double precio = sc.nextDouble();

        if(gestion.agregarElectrodomestico(new Electrodomestico(serial, marca, precio))){
            System.out.println("Electrodomestico agregado correctamente");
        } 
        else {
            System.out.println("Electrodomestico no agregado");
        }
    }

    public void eliminar() {

        System.out.println("Ingrese el serial");
        int serialEliminar = sc.nextInt();

        if (gestion.eliminarElectrodomestico(serialEliminar)) {
            System.out.println("Electrodomestico eliminado");
        } else {
            System.out.println("Electrodomestico no eliminado");
        }
    }

    public void buscar() {

        System.out.println("Ingrese el serial");
        int serialBuscar = sc.nextInt();
        Electrodomestico electrodomestico = gestion.buscarElectrodomestico(serialBuscar);
        if (electrodomestico != null) {
            System.out.println("Electrodomestico encontrado " + electrodomestico.toString());
        } 
        else {
            System.out.println("Electrodomestico no encontrado");
        }
    }
}
