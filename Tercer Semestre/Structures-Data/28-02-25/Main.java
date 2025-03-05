import java.util.Scanner;

public class Main{
    Scanner stdin = new Scanner(System.in);
    GestionElectrodomestico gestionElectrodomestico; 

    public Main(){
        gestionElectrodomestico = new GestionElectrodomestico();    
    }

    public static void main(String[] args){
        Main main = new Main();

        main.menu();
    }

    public void menu(){

        byte opcion;
        do{
            System.out.println("Menu Principal\n"+
                "1._agregar\n" +
                "2._ listar\n" +
                "3._ Buscar\n" +
                "4. Salir");
            System.out.print("Ingresa la opcion: ");    
            opcion = stdin.nextByte();
            stdin.nextLine();

            switch(opcion){
                
                case 1:
                    agregarElectrodomestico();
                    break;

                case 2:
                    listarElectrodomesticos();
                    break;

                case 3:
                   buscarElectrodomestico(); 
                   break;

                case 4:
                    System.out.println("Adios");
                    break;

                default:
                    System.out.println("error.");
                    break;
            }
        }  
        while(opcion != 4);
    }

    public void agregarElectrodomestico(){
        Electrodomestico[][] electrodomesticos = new Electrodomestico[gestionElectrodomestico.getRow()][gestionElectrodomestico.getColumn()];

        for(int i = 0; i < gestionElectrodomestico.getRow(); i++) {
            for(int j = 0; j < gestionElectrodomestico.getColumn(); j++) {

               System.out.print("Ingresa el numero de serie: ");
               String serie = stdin.nextLine();

               System.out.print("Ingresa nombre: ");
               String nombre = stdin.nextLine();

               System.out.print("Ingresa el precio: ");
               float precio = stdin.nextFloat();
               stdin.nextLine();

               electrodomesticos[i][j] = new Electrodomestico(serie, nombre, precio);
            }
        }
        gestionElectrodomestico.agregarElectrodomestico(electrodomesticos);
    }

    public void listarElectrodomesticos(){
        Electrodomestico[][] electrodomesticos = gestionElectrodomestico.listarElectrodomesticos();

        System.out.println("* Tipo Serie *\t * Nombre *\t * Precio *\n"); 

        for(int i = 0; i < gestionElectrodomestico.getRow(); i++) {
            for(int j = 0; j < gestionElectrodomestico.getColumn(); j++) {
                System.out.println(electrodomesticos[i][j].toString());        
            } 
        } 
    }

    public void buscarElectrodomestico(){
        System.out.print("Ingresa el tipo de serie a buscar: ");
        String electro = stdin.nextLine();

        if(gestionElectrodomestico.buscarElectrodomestico(electro) != null){
            System.out.println("Elemento encontrado");
        }
        else{
            System.out.println("Elemento no encontrado");
        }
    }
}
