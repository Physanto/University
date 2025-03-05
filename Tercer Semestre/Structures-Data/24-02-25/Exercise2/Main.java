package Exercise2;
import java.util.Scanner;

public class Main {

    Scanner stdin;
    int size = 5;
    Temp temp;

    public Main(){
        stdin = new Scanner(System.in);
        temp = new Temp();
    }

    public static void main(String[] args){
        Main main = new Main();
        main.menu();
    }

    public void menu(){

        byte option;
        do{
            System.out.println("\nMenu de Temperaturas\n" +
                    "1._ Ingresar Temperaturas.\n" +
                    "2._ Mostrar las Temperaturas.\n" +
                    "3._ Promedio de Temperaturas.\n" +
                    "4._ Temperaturas mayores a 15.0.\n" +
                    "5._ Buscar Temperatura.\n" +
                    "6._ Salir.");
            System.out.print("Ingresa la opcion: ");
            option = stdin.nextByte();

            switch (option){

                case 1:
                    inputTemps();
                    break;

                case 2:
                    showTemps();
                    break;

                case 3:
                    promedyTemps();
                    break;

                case 4:
                    tempsLargest();
                    break;

                case 5:
                    searchTemp();
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Error!");
                    break;
            }
        }
        while(option != 6);
    }

    public void inputTemps(){
        float[] notes = new float[size];

        for(int i = 0; i < size; i++) {
            System.out.print("Ingresa la temperatura " + (i+1) + ": ");
            notes[i] = stdin.nextFloat();  
        }
        temp.setTemps(notes);
        System.out.println("Temperaturas agregadas correctamente\n");
    }

    public void showTemps(){
        System.out.println(temp.showTemps() + "\n");
    }

    public void promedyTemps(){
        System.out.println("El promedio es: " + temp.promedyTemps() + "\n");
    } 

    public void tempsLargest(){
        System.out.println(temp.tempLargest());        
    }

    public void searchTemp(){
        System.out.print("Ingresa la temperatura a buscar: ");
        float temps = stdin.nextFloat();
        System.out.println(temp.searchTemp(temps));
    }

    public void clearScreen(){
        for(int i = 0; i < 50; i++) {
            System.out.println("\n");
        }
    }
}
